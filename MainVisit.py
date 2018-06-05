import sys
from antlr4 import FileStream
from antlr4 import CommonTokenStream
from antlr4 import ParseTreeWalker
from out.ImpmonListener import ImpmonListener
from out.ImpmonVisitor import ImpmonVisitor
from out.ImpmonParser import ImpmonParser
from out.ImpmonLexer import ImpmonLexer
from antlr4.error.ErrorListener import ErrorListener
from Tools import *

RUN = True


class MyErrorListener(ErrorListener):
    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        global RUN
        RUN = False
        print("SyntaxError: line {line}, {msg}".format(line=line, msg=msg))


class CodeGenerator(ImpmonVisitor):
    def getNameAndValueFromAssign(self, ctx):
        name = ctx.term().getText()

        if ("[" in name):
            # 获取array[index]相关生成代码，并去掉最后一行push（暂时）
            prefix = self.visit(ctx.term()).rsplit("\n  ", 1)[0]
            # 去掉name中[index]部分
            name = name.split("[")[0]
        else:
            prefix = ""

        value = self.visit(ctx.expr())
        return prefix, name, value

    def visitCompilation_unit(self, ctx):
        return self.visitChildren(ctx)

    def visitImport_stmts(self, ctx):
        return self.visitChildren(ctx)

    def visitImport_stmt(self, ctx):
        return self.visitChildren(ctx)

    @generateTop_defsCode
    def visitTop_defs(self, ctx):
        # return self.visitChildren(ctx)
        defuncs = [self.visit(defunc) for defunc in ctx.defunc()]
        return defuncs

    def visitDefvar(self, ctx):
        return self.visitChildren(ctx)

    def visitDefarr(self, ctx):
        return self.visitChildren(ctx)

    def visitDefclass(self, ctx):
        return self.visitChildren(ctx)

    @generateStmtsCode
    def visitStmts(self, ctx):
        stmts = [self.visit(stmt) for stmt in ctx.stmt()]
        return stmts

    def visitEmptyStmt(self, ctx):
        return ""

    def visitLabeledStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitToExpr(self, ctx):
        return self.visit(ctx.expr())

    def visitBlockStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitIfStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitWhileStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitForStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitSwitchStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitBreakStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitContinueStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitGotoStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitReturnStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitPrintStmt(self, ctx):
        return self.visitChildren(ctx)

    def visitLabeled_stmt(self, ctx):
        return self.visitChildren(ctx)

    @generateIfCode
    def visitIf_stmt(self, ctx):
        condition = self.visit(ctx.expr())
        ifBody = self.visit(ctx.stmt(0))
        elseBody = self.visit(ctx.stmt(1))
        return condition, ifBody, elseBody

    @generateWhileCode
    def visitWhile_stmt(self, ctx):
        conditon = self.visit(ctx.expr())
        whileBody = self.visit(ctx.stmt())
        return conditon, whileBody

    @generateForCode
    def visitFor_stmt(self, ctx):
        initialization = self.visit(ctx.expr(0))
        condition = self.visit(ctx.expr(1))
        increment = self.visit(ctx.expr(2))
        forBody = self.visit(ctx.stmt())
        return initialization, condition, increment, forBody

    def visitSwitch_stmt(self, ctx):
        return self.visitChildren(ctx)

    def visitBreak_stmt(self, ctx):
        return self.visitChildren(ctx)

    def visitContinue_stmt(self, ctx):
        return self.visitChildren(ctx)

    def visitGoto_stmt(self, ctx):
        return self.visitChildren(ctx)

    @generateReturnStmtCode
    def visitReturn_stmt(self, ctx):
        value = self.visit(ctx.expr())
        return value

    @generatePrintCode
    def visitPrint_stmt(self, ctx):
        return self.visit(ctx.expr())

    @generateAssignCode
    def visitAssign(self, ctx):
        return self.getNameAndValueFromAssign(ctx)

    @generateOperationAssignCode("add")
    def visitAddAssign(self, ctx):
        return self.getNameAndValueFromAssign(ctx)

    @generateOperationAssignCode("sub")
    def visitSubAssign(self, ctx):
        return self.getNameAndValueFromAssign(ctx)

    @generateOperationAssignCode("mul")
    def visitMulAssign(self, ctx):
        return self.getNameAndValueFromAssign(ctx)

    @generateOperationAssignCode("div")
    def visitDivAssign(self, ctx):
        return self.getNameAndValueFromAssign(ctx)

    def visitToFactor(self, ctx):
        return self.visitChildren(ctx)

    @generateBinaryCode("add")
    def visitAdd(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("gtn")
    def visitGtn(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("sub")
    def visitSub(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("loe")
    def visitLoe(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("or")
    def visitOr(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("mul")
    def visitMul(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("ltn")
    def visitLtn(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("eq")
    def visitEq(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("div")
    def visitDiv(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("and")
    def visitAnd(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("neq")
    def visitNeq(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    @generateBinaryCode("goe")
    def visitGoe(self, ctx):
        return [self.visit(ctx.factor(0)), self.visit(ctx.factor(1))]

    def visitStr(self, ctx):
        return self.visitChildren(ctx)

    def visitPar(self, ctx):
        return self.visitChildren(ctx)

    def visitDec(self, ctx):
        return self.visitChildren(ctx)

    @generateIdenCode
    def visitIden(self, ctx):
        return ctx.IDENTIFIER().getText()

    @generateArrayCode
    def visitArray(self, ctx):
        # 倒置
        args = [self.visit(each) for each in ctx.args().expr()][::-1]
        length = str(len(args))
        return args, length

    @generateCallArrayCode
    def visitCallArray(self, ctx):
        name = ctx.term().getText()
        index = self.visit(ctx.expr())
        return name, index

    @generateDefuncCode
    def visitDefunc(self, ctx):
        name = ctx.name().getText()

        # 判断是否有参数
        if (ctx.params() is not None):
            params = self.visit(ctx.params())
        else:
            params = ""

        body = self.visit(ctx.block())
        return name, params, body

    @generateCallFuncCode
    def visitCallFunc(self, ctx):
        name = ctx.term().getText()
        # 倒置
        args = [self.visit(each) for each in ctx.args().expr()][::-1]
        return name, args

    @generateIntCode
    def visitInt(self, ctx):
        return ctx.INTEGER().getText()

    def visitInc(self, ctx):
        return self.visitChildren(ctx)

    def visitStorage(self, ctx):
        return self.visitChildren(ctx)

    def visitTyperef(self, ctx):
        return self.visitChildren(ctx)

    def visitTyperef_base(self, ctx):
        return self.visitChildren(ctx)

    def visitName(self, ctx):
        return self.visitChildren(ctx)

    @generateParamsCode
    def visitParams(self, ctx):
        params = [self.visit(param) for param in ctx.param()]
        return params

    @generateParamCode
    def visitParam(self, ctx):
        name = ctx.name().getText()
        return name

    def visitBlock(self, ctx):
        return self.visit(ctx.stmts())

    def visitDefvar_list(self, ctx):
        return self.visitChildren(ctx)

    def visitMember_list(self, ctx):
        return self.visitChildren(ctx)

    def visitSlot(self, ctx):
        return self.visitChildren(ctx)

    @generateArgsCode
    def visitArgs(self, ctx):
        args = [self.visit(expr) for expr in ctx.expr()]
        return args


def main(argv):
    input = FileStream(argv[1])
    lexer = ImpmonLexer(input)
    lexer._listeners = [MyErrorListener()]
    stream = CommonTokenStream(lexer)
    parser = ImpmonParser(stream)
    parser._listeners = [MyErrorListener()]

    tree = parser.compilation_unit()
    codeGenerator = CodeGenerator()

    # print(codeGenerator.visit(tree))

    global RUN
    if(RUN):
        outfile = argv[2]
        with open(outfile, "w") as output:
            output.write(codeGenerator.visit(tree))
    else:
        pass


if __name__ == '__main__':
    main(sys.argv)
