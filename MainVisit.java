
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.Math;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class MainVisit {

	

	private static class Visitor extends ImpmonBaseVisitor<String> {
		static final String NEWLINE = " \r\n";
		private int count = 0;	// 记录tag数量（暂时只记录if)
		private String getTagCount(){
			return Integer.toString(count++);
		}

		private String getTagCode(String name){
			return "tag " + "@" + name + NEWLINE;
		}

		private String getAssignCode(String name, String value){
			return 
				value +
				"assign " + "%" + name + NEWLINE;
		}

		private String getBaseBinaryCode(String lhs, String rhs, String op){
			return lhs + rhs + op + NEWLINE;
		}

		private String getBinaryCode(List<?> list, String op){
			String lhs = visit((ParseTree)list.get(0));
			String rhs = visit((ParseTree)list.get(1));
			return getBaseBinaryCode(lhs, rhs, op);
		}

		@Override public String visitDefunc(ImpmonParser.DefuncContext ctx) { 
			String name = ctx.name().getText();
			String block = visit(ctx.block()); 
			return "tag " + "@" + name + NEWLINE + block;
		}	

		@Override public String visitDefvars(ImpmonParser.DefvarsContext ctx){

			// if the array type get "store_a", or else get "store"
			String storeType = visit(ctx.type());

			String name = ctx.name(0).getText();
			String value = visit(ctx.expr(0));
			return 
				value +
				// "store " + "%" + name + NEWLINE;
				storeType + " %" + name + NEWLINE;
		}

		@Override public String visitToExpr(ImpmonParser.ToExprContext ctx){
			return visit(ctx.expr());
		}

		@Override public String visitBlock(ImpmonParser.BlockContext ctx){
			return visit(ctx.defvar_list()) 
				+ visit(ctx.stmts());
		}

		@Override public String visitDefvar_list(ImpmonParser.Defvar_listContext ctx){
			if(ctx.defvars().size() == 0){
				return "";
			}else{
				String result = "";
				for(ImpmonParser.DefvarsContext defvar : ctx.defvars()){
					result += visit(defvar);
				}
				return result;
			}
		}

		@Override public String visitStmts(ImpmonParser.StmtsContext ctx){
			if(ctx.stmt().size() == 0){
				return "";
			}else{
				String result = "";
				for(ImpmonParser.StmtContext stmt : ctx.stmt()){
					result += visit(stmt);
				}
				return result;
			}
		}


		@Override public String visitPrint_stmt(ImpmonParser.Print_stmtContext ctx) {
			String value = visit(ctx.expr());
			return 
				value + 
				"print" + NEWLINE;
		}


		private String getJumpCode(String op, String tag){
			return op + " " + "@" + tag + NEWLINE;
		}

		@Override public String visitEmptyStmt(ImpmonParser.EmptyStmtContext ctx){
			return "";
		}

		@Override public String visitIf_stmt(ImpmonParser.If_stmtContext ctx) {
			String tagCount = getTagCount();
			String cond = visit(ctx.expr());
			if(ctx.stmt().size() == 1){
				return cond +
					getJumpCode("jz", "ENDIF" + tagCount) +
					getTagCode("IF" + tagCount) + 
					visit(ctx.stmt(0)) + 
					getTagCode("ENDIF" + tagCount);
			}else{
				return cond +
					getJumpCode("jz", "ELSE" + tagCount) + 
					getTagCode("IF" + tagCount) + 
					visit(ctx.stmt(0)) + 
					getJumpCode("jmp", "ENDIF" + tagCount) + 
					getTagCode("ELSE" + tagCount) + 
					visit(ctx.stmt(1)) +
					getTagCode("ENDIF" + tagCount);
			}
		}

		@Override public String visitFor_stmt(ImpmonParser.For_stmtContext ctx){
			String tagCount = getTagCount();
			String initExpression = visit(ctx.defvars());
			String condExpression = visit(ctx.expr(0));
			String loopExpression = visit(ctx.expr(1));
			String blockStatement = visit(ctx.stmt());


			return 
				// initExpression is executed only once
				getTagCode("FOR" + tagCount) +			
				initExpression + 
				
				getTagCode("LOOP" + tagCount) + 
				condExpression + 		
				// jump to tag ENDFOR if the condition is false		
				getJumpCode("jz", "ENDFOR" + tagCount) +	
				loopExpression +
				// or else execute blockStatement
				blockStatement +
				getJumpCode("jmp", "LOOP" + tagCount) +  // continues to loop

				// end loop and deleted temp variable
				getTagCode("ENDFOR" + tagCount) +
				"free " + "%" + ctx.defvars().name(0).getText() + NEWLINE;
		}

		@Override public String visitWhile_stmt(ImpmonParser.While_stmtContext ctx){
			String tagCount = getTagCount();

			String condExpression = visit(ctx.expr());
			String blockStatement = visit(ctx.stmt());
			return 
				getTagCode("WHILE" + tagCount) +

				// jump to tag ENDWHILE if condExpression evaluates to false
				// or else execute blockStatement
				condExpression +
				getJumpCode("jz", "ENDWHILE" + tagCount) + 
				blockStatement + 

				// return the tag WHILE and continues to loop
				getJumpCode("jmp", "WHILE" + tagCount) + 
				getTagCode("ENDWHILE" + tagCount);

		}


		@Override public String visitAssign(ImpmonParser.AssignContext ctx) {
			String value = visit(ctx.expr());
			String name = ctx.term().getText();
			return getAssignCode(name, value);
		}

		@Override public String visitAddAssign(ImpmonParser.AddAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String value = getBaseBinaryCode(lhs, rhs, "add");
			String name = ctx.term().getText();
			return getAssignCode(name, value);
		}

		@Override public String visitSubAssign(ImpmonParser.SubAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String value = getBaseBinaryCode(lhs, rhs, "sub");
			String name = ctx.term().getText();
			return getAssignCode(name, value);
		}

		@Override public String visitMulAssign(ImpmonParser.MulAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String value = getBaseBinaryCode(lhs, rhs, "mul");
			String name = ctx.term().getText();
			return getAssignCode(name, value);
		}

		@Override public String visitDivAssign(ImpmonParser.DivAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String value = getBaseBinaryCode(lhs, rhs, "div");
			String name = ctx.term().getText();
			return getAssignCode(name, value);
		}

		@Override public String visitMul(ImpmonParser.MulContext ctx){
			return getBinaryCode(ctx.factor(), "mul");
		}

		@Override public String visitDiv(ImpmonParser.DivContext ctx){
			return getBinaryCode(ctx.factor(), "div");
		}

		@Override public String visitAdd(ImpmonParser.AddContext ctx) {
			return getBinaryCode(ctx.factor(), "add");
		}

		@Override public String visitSub(ImpmonParser.SubContext ctx) {
			return getBinaryCode(ctx.factor(), "sub");
		}

		@Override public String visitGtn(ImpmonParser.GtnContext ctx){
			return getBinaryCode(ctx.factor(), "gtn");
		}

		@Override public String visitLtn(ImpmonParser.LtnContext ctx){
			return getBinaryCode(ctx.factor(), "ltn");
		}

		@Override public String visitGoe(ImpmonParser.GoeContext ctx){
			return getBinaryCode(ctx.factor(), "goe");
		}

		@Override public String visitLoe(ImpmonParser.LoeContext ctx){
			return getBinaryCode(ctx.factor(), "loe");
		}

		@Override public String visitEq(ImpmonParser.EqContext ctx) {
			return getBinaryCode(ctx.factor(), "eq");
		}

		@Override public String visitNeq(ImpmonParser.NeqContext ctx){
			return getBinaryCode(ctx.factor(), "neq");
		}

		@Override public String visitAnd(ImpmonParser.AndContext ctx){
			return getBinaryCode(ctx.factor(), "and");
		}

		@Override public String visitOr(ImpmonParser.OrContext ctx){
			return getBinaryCode(ctx.factor(), "or");
		}

		@Override public String visitArrayType(ImpmonParser.ArrayTypeContext ctx){
			return "store_a";
		}

		@Override public String visitBaseType(ImpmonParser.BaseTypeContext ctx){
			return "store";
		}

		@Override public String visitInt(ImpmonParser.IntContext ctx) { 
			String value = ctx.INTEGER().getText();
			return "push " + value + NEWLINE;
		}

		@Override public String visitIden(ImpmonParser.IdenContext ctx) {
			String value = ctx.IDENTIFIER().getText();
			return "push " + "%" + value + NEWLINE;
		}

		@Override public String visitPar(ImpmonParser.ParContext ctx) {
			return visit(ctx.expr());
		}

		@Override public String visitInc(ImpmonParser.IncContext ctx){
			String lhs = visit(ctx.term());
			String rhs = "push 1" + NEWLINE;
			String name = ctx.term().getText();
			return 
				lhs + rhs + "add" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitDec(ImpmonParser.DecContext ctx){
			String lhs = visit(ctx.term());
			String rhs = "push 1" + NEWLINE;
			String name = ctx.term().getText();
			return 
				lhs + rhs + "sub" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitCallArray(ImpmonParser.CallArrayContext ctx){
			String index = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				"push_a " + "%" + name + NEWLINE;
		}

	}

	public static void main(String[] args) throws Exception {
		if(args.length > 0){
			String filename = args[0];
			File file = new File(filename);
			FileInputStream stream = null;

			stream = new FileInputStream(file);
			ANTLRInputStream input = new ANTLRInputStream(stream);
			ImpmonLexer lexer = new ImpmonLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			ImpmonParser parser = new ImpmonParser(tokens);
			ParseTree tree = parser.compilation_unit(); 
			Visitor eval = new Visitor();

			// to file
			PrintWriter writer = new PrintWriter("demo.gl", "ascii");
			writer.println(eval.visit(tree));
			writer.close();

			// print
			System.out.println(eval.visit(tree));
		}




		

		

	}
}
