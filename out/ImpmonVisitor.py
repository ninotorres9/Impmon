# Generated from Impmon.g4 by ANTLR 4.7.1
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by ImpmonParser.

class ImpmonVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ImpmonParser#compilation_unit.
    def visitCompilation_unit(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#import_stmts.
    def visitImport_stmts(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#import_stmt.
    def visitImport_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#tof_defs.
    def visitTof_defs(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#defunc.
    def visitDefunc(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#stmts.
    def visitStmts(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#emptyStmt.
    def visitEmptyStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#toExpr.
    def visitToExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#blockStmt.
    def visitBlockStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#ifStmt.
    def visitIfStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#whileStmt.
    def visitWhileStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#forStmt.
    def visitForStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#returnStmt.
    def visitReturnStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#printStmt.
    def visitPrintStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#if_stmt.
    def visitIf_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#while_stmt.
    def visitWhile_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#for_stmt.
    def visitFor_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#return_stmt.
    def visitReturn_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#print_stmt.
    def visitPrint_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#assign.
    def visitAssign(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#addAssign.
    def visitAddAssign(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#subAssign.
    def visitSubAssign(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#mulAssign.
    def visitMulAssign(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#divAssign.
    def visitDivAssign(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#toFactor.
    def visitToFactor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#add.
    def visitAdd(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#gtn.
    def visitGtn(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#sub.
    def visitSub(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#loe.
    def visitLoe(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#or.
    def visitOr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#mul.
    def visitMul(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#ltn.
    def visitLtn(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#eq.
    def visitEq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#div.
    def visitDiv(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#toTerm.
    def visitToTerm(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#and.
    def visitAnd(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#neq.
    def visitNeq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#goe.
    def visitGoe(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#str.
    def visitStr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#par.
    def visitPar(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#dec.
    def visitDec(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#iden.
    def visitIden(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#array.
    def visitArray(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#callArray.
    def visitCallArray(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#callFunc.
    def visitCallFunc(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#int.
    def visitInt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#inc.
    def visitInc(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#name.
    def visitName(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#params.
    def visitParams(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#param.
    def visitParam(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#block.
    def visitBlock(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImpmonParser#args.
    def visitArgs(self, ctx):
        return self.visitChildren(ctx)


