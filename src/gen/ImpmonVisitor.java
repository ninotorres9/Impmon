// Generated from E:/code/Impmon/src/impmon\Impmon.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpmonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpmonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(ImpmonParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#import_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmts(ImpmonParser.Import_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(ImpmonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#tof_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTof_defs(ImpmonParser.Tof_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#defunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefunc(ImpmonParser.DefuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defvar}
	 * labeled alternative in {@link ImpmonParser#defvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(ImpmonParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defarr}
	 * labeled alternative in {@link ImpmonParser#defvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefarr(ImpmonParser.DefarrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#defclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefclass(ImpmonParser.DefclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(ImpmonParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(ImpmonParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labeledStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(ImpmonParser.LabeledStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toExpr}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToExpr(ImpmonParser.ToExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(ImpmonParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ImpmonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ImpmonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(ImpmonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(ImpmonParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(ImpmonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(ImpmonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotoStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(ImpmonParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(ImpmonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link ImpmonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ImpmonParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#labeled_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_stmt(ImpmonParser.Labeled_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(ImpmonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(ImpmonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(ImpmonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(ImpmonParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(ImpmonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(ImpmonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(ImpmonParser.Goto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(ImpmonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(ImpmonParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ImpmonParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addAssign}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAssign(ImpmonParser.AddAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subAssign}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssign(ImpmonParser.SubAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulAssign}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAssign(ImpmonParser.MulAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divAssign}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAssign(ImpmonParser.DivAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toFactor}
	 * labeled alternative in {@link ImpmonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFactor(ImpmonParser.ToFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ImpmonParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtn}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtn(ImpmonParser.GtnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ImpmonParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loe}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoe(ImpmonParser.LoeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ImpmonParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ImpmonParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltn}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtn(ImpmonParser.LtnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(ImpmonParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ImpmonParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toTerm}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTerm(ImpmonParser.ToTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ImpmonParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neq}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(ImpmonParser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goe}
	 * labeled alternative in {@link ImpmonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoe(ImpmonParser.GoeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(ImpmonParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(ImpmonParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dec}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(ImpmonParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iden}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIden(ImpmonParser.IdenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callArray}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArray(ImpmonParser.CallArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunc}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(ImpmonParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ImpmonParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inc}
	 * labeled alternative in {@link ImpmonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(ImpmonParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage(ImpmonParser.StorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ImpmonParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#typeref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyperef(ImpmonParser.TyperefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#typeref_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyperef_base(ImpmonParser.Typeref_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ImpmonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ImpmonParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ImpmonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ImpmonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#defvar_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar_list(ImpmonParser.Defvar_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(ImpmonParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#slot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot(ImpmonParser.SlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpmonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ImpmonParser.ArgsContext ctx);
}