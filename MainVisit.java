
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

		public String visitBinary(List<?> list, String op){
			String lhs = visit((ParseTree)list.get(0));
			String rhs = visit((ParseTree)list.get(1));
			return lhs + rhs + op + NEWLINE;
		}

		@Override 
		public String visitDefunc(ImpmonParser.DefuncContext ctx) { 
			String name = ctx.name().getText();
			String block = visit(ctx.block()); 
			return "tag " + "@" + name + NEWLINE + block;
		}	

		@Override public String visitDefvars(ImpmonParser.DefvarsContext ctx){
			String name = ctx.name(0).getText();
			String value = visit(ctx.expr(0));
			return 
				value +
				"store " + "%" + name + NEWLINE;
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
				return visitChildren(ctx);
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

		@Override public String visitIf_stmt(ImpmonParser.If_stmtContext ctx) {
			// return 
			String cond = visit(ctx.expr());
			return cond +
				"jz @ELSE" + NEWLINE +
				"tag @IF" + NEWLINE +
				visit(ctx.stmt(0)) + 
				"jmp @ENDIF" + NEWLINE +
				"tag @ELSE" + NEWLINE +
				visit(ctx.stmt(1)) +
				"tag @ENDIF" + NEWLINE;
		}

		@Override public String visitAssign(ImpmonParser.AssignContext ctx) {
			String value = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				value +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitAddAssign(ImpmonParser.AddAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				lhs + rhs + "add" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitSubAssign(ImpmonParser.SubAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				lhs + rhs + "sub" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitMulAssign(ImpmonParser.MulAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				lhs + rhs + "mul" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitDivAssign(ImpmonParser.DivAssignContext ctx){
			String lhs = visit(ctx.term());
			String rhs = visit(ctx.expr());
			String name = ctx.term().getText();
			return 
				lhs + rhs + "div" + NEWLINE +
				"assign " + "%" + name + NEWLINE;
		}

		@Override public String visitMul(ImpmonParser.MulContext ctx){
			return visitBinary(ctx.factor(), "mul");
		}

		@Override public String visitDiv(ImpmonParser.DivContext ctx){
			return visitBinary(ctx.factor(), "div");
		}

		@Override public String visitAdd(ImpmonParser.AddContext ctx) {
			return visitBinary(ctx.factor(), "add");
		}

		@Override public String visitSub(ImpmonParser.SubContext ctx) {
			return visitBinary(ctx.factor(), "sub");
		}

		@Override public String visitGtn(ImpmonParser.GtnContext ctx){
			return visitBinary(ctx.factor(), "gtn");
		}

		@Override public String visitLtn(ImpmonParser.LtnContext ctx){
			return visitBinary(ctx.factor(), "ltn");
		}

		@Override public String visitGoe(ImpmonParser.GoeContext ctx){
			return visitBinary(ctx.factor(), "goe");
		}

		@Override public String visitLoe(ImpmonParser.LoeContext ctx){
			return visitBinary(ctx.factor(), "loe");
		}

		@Override public String visitEq(ImpmonParser.EqContext ctx) {
			return visitBinary(ctx.factor(), "eq");
		}

		@Override public String visitNeq(ImpmonParser.NeqContext ctx){
			return visitBinary(ctx.factor(), "neq");
		}

		@Override public String visitAnd(ImpmonParser.AndContext ctx){
			return visitBinary(ctx.factor(), "and");
		}

		@Override public String visitOr(ImpmonParser.OrContext ctx){
			return visitBinary(ctx.factor(), "or");
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
