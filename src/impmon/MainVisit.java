package impmon;

import gen.ImpmonBaseVisitor;
import gen.ImpmonLexer;
import gen.ImpmonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import impmon.Scope.*;

public class MainVisit{

    public static TopScope scope = new TopScope();
    public static ArrayList<String> errorList = new ArrayList<String>();

    public static class TypeChecker extends ImpmonBaseVisitor<String>{

        private String getBinaryType(String lhs, String rhs){
            if(lhs.equals(rhs)){
                return lhs;
            }else{
                return "error";
            }
        }

        @Override public String visitCompilation_unit(ImpmonParser.Compilation_unitContext ctx) { return visitChildren(ctx); }

        @Override public String visitImport_stmts(ImpmonParser.Import_stmtsContext ctx) { return visitChildren(ctx); }

        @Override public String visitImport_stmt(ImpmonParser.Import_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitTof_defs(ImpmonParser.Tof_defsContext ctx) { return visitChildren(ctx); }

        @Override public String visitDefunc(ImpmonParser.DefuncContext ctx) { return visitChildren(ctx); }

        @Override public String visitDefvar(ImpmonParser.DefvarContext ctx) {
//            String name = ctx.name().getText();
//            String type = ctx.type().getText();
//            scope.createVariable(name, new Variable(type, name));
            return "null";
        }

        @Override public String visitDefarr(ImpmonParser.DefarrContext ctx) { return visitChildren(ctx); }

        @Override public String visitDefclass(ImpmonParser.DefclassContext ctx) { return visitChildren(ctx); }

        @Override public String visitStmts(ImpmonParser.StmtsContext ctx) { return visitChildren(ctx); }

        @Override public String visitEmptyStmt(ImpmonParser.EmptyStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitLabeledStmt(ImpmonParser.LabeledStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitToExpr(ImpmonParser.ToExprContext ctx) { return visitChildren(ctx); }

        @Override public String visitBlockStmt(ImpmonParser.BlockStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitIfStmt(ImpmonParser.IfStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitWhileStmt(ImpmonParser.WhileStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitForStmt(ImpmonParser.ForStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitSwitchStmt(ImpmonParser.SwitchStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitBreakStmt(ImpmonParser.BreakStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitContinueStmt(ImpmonParser.ContinueStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitGotoStmt(ImpmonParser.GotoStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitReturnStmt(ImpmonParser.ReturnStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitPrintStmt(ImpmonParser.PrintStmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitLabeled_stmt(ImpmonParser.Labeled_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitIf_stmt(ImpmonParser.If_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitWhile_stmt(ImpmonParser.While_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitFor_stmt(ImpmonParser.For_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitSwitch_stmt(ImpmonParser.Switch_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitBreak_stmt(ImpmonParser.Break_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitContinue_stmt(ImpmonParser.Continue_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitGoto_stmt(ImpmonParser.Goto_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitReturn_stmt(ImpmonParser.Return_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitPrint_stmt(ImpmonParser.Print_stmtContext ctx) { return visitChildren(ctx); }

        @Override public String visitAssign(ImpmonParser.AssignContext ctx) {
            String type = getBinaryType(visit(ctx.term()), visit(ctx.expr()));
            if(type.contains("error")){
                int lineNumber = ctx.getStart().getLine();
                String errorMessage =
                        String.format("line %d: cannot assign '%s' to '%s'",
                                lineNumber, visit(ctx.expr()), visit(ctx.term()));
                errorList.add(errorMessage);
            }
            return type;
        }

        @Override public String visitAddAssign(ImpmonParser.AddAssignContext ctx) {
            return getBinaryType(visit(ctx.term()), visit(ctx.expr()));
        }

        @Override public String visitSubAssign(ImpmonParser.SubAssignContext ctx) {
            return getBinaryType(visit(ctx.term()), visit(ctx.expr()));
        }

        @Override public String visitMulAssign(ImpmonParser.MulAssignContext ctx) {
            return getBinaryType(visit(ctx.term()), visit(ctx.expr()));
        }

        @Override public String visitDivAssign(ImpmonParser.DivAssignContext ctx) {
            return getBinaryType(visit(ctx.term()), visit(ctx.expr()));
        }

        @Override public String visitToFactor(ImpmonParser.ToFactorContext ctx) { return visitChildren(ctx); }

        @Override public String visitAdd(ImpmonParser.AddContext ctx){
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitGtn(ImpmonParser.GtnContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitSub(ImpmonParser.SubContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitLoe(ImpmonParser.LoeContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitOr(ImpmonParser.OrContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitMul(ImpmonParser.MulContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitLtn(ImpmonParser.LtnContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitEq(ImpmonParser.EqContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitDiv(ImpmonParser.DivContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitToTerm(ImpmonParser.ToTermContext ctx) { return visitChildren(ctx); }

        @Override public String visitAnd(ImpmonParser.AndContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitNeq(ImpmonParser.NeqContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitGoe(ImpmonParser.GoeContext ctx) {
            return getBinaryType(visit(ctx.factor(0)), visit(ctx.factor(1)));
        }

        @Override public String visitStr(ImpmonParser.StrContext ctx) {
            return "string";
        }

        @Override public String visitPar(ImpmonParser.ParContext ctx) {
            return visit(ctx.expr());
        }

        @Override public String visitDec(ImpmonParser.DecContext ctx) {
            return visit(ctx.term());
        }

        @Override public String visitIden(ImpmonParser.IdenContext ctx) {
            String name = ctx.IDENTIFIER().getText();
            if(scope.hasVariable(name)){
                // return scope.findVariable(name).type_;
                return scope.getType(name);
            }else{
                return "error";
            }
        }

        @Override public String visitCallArray(ImpmonParser.CallArrayContext ctx) {
            String name = ctx.term().getText();
            Variable variable = scope.findVariable(name);
            // Variable variable = scope.ge

            if(variable == null){
                return "error";
            }else{
                // 判断是否为array类型
                String[] types = variable.type_.split("_");
                if(types[0].equals("array")){
                    return types[1];
                }else{
                    return "error";
                }
            }
        }

        @Override public String visitCallFunc(ImpmonParser.CallFuncContext ctx) { return visitChildren(ctx); }

        @Override public String visitInt(ImpmonParser.IntContext ctx){
            return "int";
        }

        @Override public String visitInc(ImpmonParser.IncContext ctx) {
            return visit(ctx.term());
        }

        @Override public String visitStorage(ImpmonParser.StorageContext ctx) { return visitChildren(ctx); }

        @Override public String visitType(ImpmonParser.TypeContext ctx) { return visitChildren(ctx); }

        @Override public String visitTyperef(ImpmonParser.TyperefContext ctx) { return visitChildren(ctx); }

        @Override public String visitTyperef_base(ImpmonParser.Typeref_baseContext ctx) { return visitChildren(ctx); }

        @Override public String visitName(ImpmonParser.NameContext ctx) { return visitChildren(ctx); }

        @Override public String visitParams(ImpmonParser.ParamsContext ctx) { return visitChildren(ctx); }

        @Override public String visitParam(ImpmonParser.ParamContext ctx) { return visitChildren(ctx); }

        @Override public String visitBlock(ImpmonParser.BlockContext ctx) { return visitChildren(ctx); }

        @Override public String visitDefvar_list(ImpmonParser.Defvar_listContext ctx) { return visitChildren(ctx); }

        @Override public String visitMember_list(ImpmonParser.Member_listContext ctx) { return visitChildren(ctx); }

        @Override public String visitSlot(ImpmonParser.SlotContext ctx) { return visitChildren(ctx); }

        @Override public String visitArgs(ImpmonParser.ArgsContext ctx) { return visitChildren(ctx); }



    }

    public static class CodeGenerator extends ImpmonBaseVisitor<String> {
        static final String NEWLINE = " \r\n";
        private int count = 0;	// 记录tag数量（暂时只记录if)
        private String getTagCount(){
            return Integer.toString(count++);
        }

        private String getTagCode(String name){
            return "tag " + "@" + name + NEWLINE;/**/
        }

        private String getAssignCode(String name, String value){
            // if name contains square, is an array
            if(name.contains("[")){
                String arrName = name.split("\\[")[0];
                // array[index] -> index] -> index
                String index = name.split("\\[")[1].split("]")[0];
                return
                        value +
                                "push " + index + NEWLINE +
                                "assign_a " + "%" + arrName + NEWLINE;
            }else{
                return
                        value +
                                "assign " + "%" + name + NEWLINE;
            }
        }

        private String getBaseBinaryCode(String lhs, String rhs, String op){
            return lhs + rhs + op + NEWLINE;
        }

        private String getBinaryCode(List<?> list, String op){
            String lhs = visit((ParseTree)list.get(0));
            String rhs = visit((ParseTree)list.get(1));
            return getBaseBinaryCode(lhs, rhs, op);
        }

        private String getFreeCode(){
            String result = "";
            ArrayList<String> names = scope.getNames();
            for(String name : names){
                result += "free " + "%" + name + NEWLINE;
            }
            return result;
        }

        @Override public String visitDefunc(ImpmonParser.DefuncContext ctx) {
            String name = ctx.name().getText();
            String block = visit(ctx.block());
            return "tag " + "@" + name + NEWLINE + block;
        }


        @Override public String visitDefvar(ImpmonParser.DefvarContext ctx){
            // String name = ;
            String type = visit(ctx.type());
            String name = ctx.name().getText();
            scope.createVariable(name
                    , new Variable(type, name));
            String value = visit(ctx.expr());
            return
                    value +
                            "store " + "%" + scope.getName(name) + NEWLINE;
        }

        @Override public String visitDefarr(ImpmonParser.DefarrContext ctx){
            String name = ctx.name().getText();
            String index = visit(ctx.expr());
            return
                    index +
                            "store_a " + "%" + name + NEWLINE;
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
            String scopeName = "if" + tagCount;
            scope.addSubScope(scopeName);
            String cond = visit(ctx.expr());

            String result = "";

            if(ctx.stmt().size() == 1){
                result = cond +
                        getJumpCode("jz", "ENDIF" + tagCount) +
                        getTagCode("IF" + tagCount) +
                        visit(ctx.stmt(0)) +
                        getTagCode("ENDIF" + tagCount) +
                        getFreeCode();
            }else{
                result = cond +
                        getJumpCode("jz", "ELSE" + tagCount) +
                        getTagCode("IF" + tagCount) +
                        visit(ctx.stmt(0)) +
                        getJumpCode("jmp", "ENDIF" + tagCount) +
                        getTagCode("ELSE" + tagCount) +
                        visit(ctx.stmt(1)) +
                        getTagCode("ENDIF" + tagCount) +
                        getFreeCode();
            }
            scope.exitScope();
            return result;
        }

        @Override public String visitFor_stmt(ImpmonParser.For_stmtContext ctx){
            String tagCount = getTagCount();
            String scopeName = "for" + tagCount;
            scope.addSubScope(scopeName);

            String initExpression = visit(ctx.defvars());
            String condExpression = visit(ctx.expr(0));
            String loopExpression = visit(ctx.expr(1));
            String blockStatement = visit(ctx.stmt());


            String result =
                    // 初始化
                    getTagCode("FOR" + tagCount) +
                    initExpression +

                    // 循环部分，包括condition, block，loop
                    getTagCode("LOOP" + tagCount) +
                    condExpression +
                    getJumpCode("jz", "ENDFOR" + tagCount) +
                    blockStatement +
                    loopExpression +
                    getJumpCode("jmp", "LOOP" + tagCount) +

                    // 循环结束，释放临时变量并退出scope
                    getTagCode("ENDFOR" + tagCount) +
                    getFreeCode();

            scope.exitScope();

            return result;

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

        @Override public String visitInt(ImpmonParser.IntContext ctx) {
            String value = ctx.INTEGER().getText();
            return "push " + value + NEWLINE;
        }

        @Override public String visitIden(ImpmonParser.IdenContext ctx) {
            String name = ctx.IDENTIFIER().getText();

            return "push " + "%" + scope.getName(name) + NEWLINE;
            // if(variableTable.containsKey(value)){
            // 	return "push " + "%" + value + NEWLINE;
            // }else{
            // 	System.err.println("name " + value + " is not defined");
            // 	return "";
            // }


        }

        @Override public String visitPar(ImpmonParser.ParContext ctx) {
            return visit(ctx.expr());
        }

        @Override public String visitInc(ImpmonParser.IncContext ctx){
            String lhs = visit(ctx.term());
            String rhs = "push 1" + NEWLINE;
            String name = scope.getName(ctx.term().getText());
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
                    index +
                            "push_a " + "%" + name + NEWLINE;
        }


    }

    private static void generate(String filename) throws Exception{
        File file = new File(filename);
        FileInputStream stream = null;

        stream = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(stream);
        ImpmonLexer lexer = new ImpmonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ImpmonParser parser = new ImpmonParser(tokens);
        ParseTree tree = parser.compilation_unit();

        MainVisit.CodeGenerator codeGenerator = new MainVisit.CodeGenerator();

//        System.out.println(codeGenerator.visit(tree));


        // 生成代码并写入文件
        PrintWriter writer = new PrintWriter("E:\\code\\Impmon\\demo.gl", "ascii");
        writer.println(codeGenerator.visit(tree));
        writer.close();


    }

    public static void main(String[] args) throws Exception {
         if(args.length > 0){
         	String filename = args[0];
         	generate(filename);
         }else{
             System.out.println("please enter the file path");
         }
    }
}