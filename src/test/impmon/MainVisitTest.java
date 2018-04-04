package test.impmon;

import gen.ImpmonLexer;
import gen.ImpmonParser;
import impmon.MainVisit;
import impmon.Scope;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.IOException;
import java.util.ArrayList;

import static impmon.MainVisit.errorList;
import static impmon.MainVisit.scope;

/**
* MainVisit Tester.
*
* @author <Authors name>
* @since <pre>���� 22, 2018</pre>
* @version 1.0
*/
public class MainVisitTest {

    private void checkType(String text)throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(text);
        ImpmonLexer lexer = new ImpmonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImpmonParser parser = new ImpmonParser(tokens);
        ParseTree tree = parser.compilation_unit();

        MainVisit.TypeChecker typeChecker = new MainVisit.TypeChecker();
        typeChecker.visit(tree);
    }

    private String getExprType(String text) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(text);
        ImpmonLexer lexer = new ImpmonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImpmonParser parser = new ImpmonParser(tokens);
        ParseTree tree = parser.expr();

        MainVisit.TypeChecker typeChecker = new MainVisit.TypeChecker();
        return typeChecker.visit(tree);
    }

    private String generateCode(String text) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(text);
        ImpmonLexer lexer = new ImpmonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImpmonParser parser = new ImpmonParser(tokens);
        ParseTree tree = parser.compilation_unit();

        MainVisit.CodeGenerator codeGenerator = new MainVisit.CodeGenerator();
        return codeGenerator.visit(tree);

    }

    private String removeWhitespace(String text){
        return text.replaceAll("\\s+", "");
    }

    @Before
    public void before() throws Exception {
        scope = new Scope.TopScope();
        errorList = new ArrayList<String>();
    }

    @After
    public void after() throws Exception {
    }

    /*
    在建立symboltable的时候就加上临时变量值
     */
//    @Test
//    public void testSymbolTable() throws Exception{
//
//    }

    @Test
    public void testGetType() throws Exception{
        Assert.assertEquals(getExprType("1"), "int");
        Assert.assertEquals(getExprType("\"abc\""), "string");
        Assert.assertEquals(getExprType("1+5"), "int");
        Assert.assertEquals(getExprType("1 != 2"), "int");
        Assert.assertEquals(getExprType("(1+2)"), "int");

        scope.createVariable("i"
                , new Scope.Variable("int", "i"));
        Assert.assertEquals(getExprType("i"), "int");
        Assert.assertEquals(getExprType("i++"), "int");
        Assert.assertEquals(getExprType("i--"), "int");
        Assert.assertEquals(getExprType("(i)"), "int");
        Assert.assertEquals(getExprType("i + 10 / 2"), "int");
        Assert.assertEquals(getExprType("(i*5-10) > 15"), "int");
        Assert.assertEquals(getExprType("i = 1"), "int");
        Assert.assertEquals(getExprType("i *= \"abc\""), "error");

        // error
        Assert.assertEquals(getExprType("var"), "error"); // 未声明变量
        Assert.assertEquals(getExprType("10 + \"abc\""), "error");
        Assert.assertEquals(getExprType("1 != \"abc\""), "error");

        scope.createVariable("container",
                new Scope.Variable("array_int", "container"));
        Assert.assertEquals(getExprType("container"), "array_int");
        Assert.assertEquals(getExprType("container[10]"), "int");
        Assert.assertEquals(getExprType("abc[10]"), "error");
        Assert.assertEquals(getExprType("i[10]"), "error");
    }

//    @Test
//    public void testCheckType() throws Exception{
//        String text = "int main(){\n" +
//                "    int i = 0;\n" +
//                "    i = \"abc\";\n" +
//                "    return 0;\n" +
//                "}";
//        checkType(text);
//        Assert.assertEquals(errorList.size(), 1);
//        Assert.assertEquals(errorList.get(0),
//                "line 3: cannot assign 'string' to 'int'");
//    }

    @Test
    public void testGenAddCode() throws Exception{
        String text = "int main(){\n" +
                "    print 1 + 5;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 1\n" +
                "    push 5\n" +
                "    add\n" +
                "    print \n";

        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testGenAddAssign() throws Exception{
        String text = "int main(){\n" +
                "    int i = 15;\n" +
                "    i += 20;\n" +
                "    print i;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 15\n" +
                "    store %i\n" +
                "    push %i\n" +
                "    push 20\n" +
                "    add\n" +
                "    assign %i\n" +
                "    push %i\n" +
                "    print";

        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));

    }

    @Test
    public void testGenArray() throws Exception{
        String text = "int main(){\n" +
                "    int[10] array;\n" +
                "    array[0] = 19;\n" +
                "    print array[0];\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 10\n" +
                "    store_a %array\n" +
                "    push 19\n" +
                "    push 0\n" +
                "    assign_a %array\n" +
                "    push 0\n" +
                "    push_a %array\n" +
                "    print";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testGenCond() throws Exception{
        String text = "int main(){\n" +
                "    print 2 && 10;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 2\n" +
                "    push 10\n" +
                "    and\n" +
                "    print";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testGenEmptyStatement() throws Exception{
        String text = "\n" +
                "int main(){\n" +
                "\t;\n" +
                "\tprint 50;\n" +
                "}\n";
        String answer = "tag @main\n" +
                "\tpush 50\n" +
                "\tprint";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testGenFor() throws Exception{
        String text = "int main(){\n" +
                "    int result = 0;\n" +
                "    for(int i = 0; i != 10; i++){\n" +
                "        result++;\n" +
                "    }\n" +
                "    print result;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 0\n" +
                "    store %result\n" +
                "tag @FOR0\n" +
                "    push 0\n" +
                "    store %for0_i\n" +
                "tag @LOOP0\n" +
                "    push %for0_i\n" +
                "    push 10\n" +
                "    neq\n" +
                "    jz @ENDFOR0\n" +
                "    push %result\n" +
                "    push 1\n" +
                "    add\n" +
                "    assign %result\n" +
                "    push %for0_i\n" +
                "    push 1\n" +
                "    add\n" +
                "    assign %for0_i\n" +
                "    jmp @LOOP0\n" +
                "tag @ENDFOR0\n" +
                "    free %for0_i\n" +
                "    push %result\n" +
                "    print";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));

    }

    @Test
    public void testGtm() throws Exception{
        String text = "int main(){\n" +
                "    print 10 > 5;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 10\n" +
                "    push 5\n" +
                "    gtn\n" +
                "    print";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testIf() throws  Exception{
        String text = "int main(){\n" +
                "    int number = 50;\n" +
                "    if(number > 20){\n" +
                "        print 250;\n" +
                "    }\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 50\n" +
                "    store %number\n" +
                "    push %number\n" +
                "    push 20\n" +
                "    gtn\n" +
                "    jz @ENDIF0\n" +
                "tag @IF0\n" +
                "    push 250\n" +
                "    print\n" +
                "tag @ENDIF0";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testIfElse() throws Exception{
        String text = "int main(){\n" +
                "    int number = 50;\n" +
                "    if(number != 50){\n" +
                "        print 50;\n" +
                "    }else{\n" +
                "        print 900;\n" +
                "    }\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 50\n" +
                "    store %number\n" +
                "    push %number\n" +
                "    push 50\n" +
                "    neq\n" +
                "    jz @ELSE0\n" +
                "tag @IF0\n" +
                "    push 50\n" +
                "    print\n" +
                "    jmp @ENDIF0\n" +
                "tag @ELSE0\n" +
                "    push 900\n" +
                "    print\n" +
                "tag @ENDIF0";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testIfElseIf() throws Exception{
        String text = "int main(){\n" +
                "    int number = 25;\n" +
                "    if(number == 10){\n" +
                "        print 1;\n" +
                "    }else if(number == 15){\n" +
                "        print 10;\n" +
                "    }else if(number == 25){\n" +
                "        print 25;\n" +
                "    }else{\n" +
                "        print 2;\n" +
                "    }\n" +
                "}\n";
        String answer = "tag @main\n" +
                "    push 25\n" +
                "    store %number\n" +
                "    push %number \n" +
                "    push 10\n" +
                "    eq\n" +
                "    jz @ELSE0\n" +
                "tag @IF0\n" +
                "    push 1\n" +
                "    print\n" +
                "    jmp @ENDIF0\n" +
                "tag @ELSE0\n" +
                "    push %number\n" +
                "    push 15\n" +
                "    eq\n" +
                "    jz @ELSE1\n" +
                "tag @IF1\n" +
                "    push 10\n" +
                "    print\n" +
                "    jmp @ENDIF1\n" +
                "tag @ELSE1\n" +
                "    push %number\n" +
                "    push 25\n" +
                "    eq\n" +
                "    jz @ELSE2\n" +
                "tag @IF2\n" +
                "    push 25\n" +
                "    print\n" +
                "    jmp @ENDIF2\n" +
                "tag @ELSE2\n" +
                "    push 2\n" +
                "    print\n" +
                "tag @ENDIF2\n" +
                "tag @ENDIF1\n" +
                "tag @ENDIF0";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testIfScope() throws Exception{
        String text = "int main(){\n" +
                "    int abc = 12;\n" +
                "    if(abc > 0){\n" +
                "        int abc = 15;\n" +
                "    }\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 12\n" +
                "    store %abc\n" +
                "    push %abc\n" +
                "    push 0\n" +
                "    gtn\n" +
                "    jz @ENDIF0\n" +
                "tag @IF0\n" +
                "    push 15\n" +
                "    store %if0_abc\n" +
                "tag @ENDIF0\n" +
                "free %if0_abc\n";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testWhile() throws Exception{
        String text = "int main(){\n" +
                "    int result = 20;\n" +
                "    int count = 5;\n" +
                "    while(count > 0){\n" +
                "        result += 1;\n" +
                "        count -= 1;\n" +
                "    }\n" +
                "    print result;\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 20\n" +
                "    store %result\n" +
                "    push 5\n" +
                "    store %count\n" +
                "tag @WHILE0\n" +
                "    push %count\n" +
                "    push 0\n" +
                "    gtn\n" +
                "    jz @ENDWHILE0\n" +
                "    push %result\n" +
                "    push 1\n" +
                "    add\n" +
                "    assign %result\n" +
                "    push %count\n" +
                "    push 1\n" +
                "    sub\n" +
                "    assign %count\n" +
                "    jmp @WHILE0\n" +
                "tag @ENDWHILE0\n" +
                "    push %result\n" +
                "    print \n";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }

    @Test
    public void testArray() throws Exception{
        String text = "int main(){\n" +
                "    int[10] array;\n" +
                "    array[0] = 19;\n" +
                "    print array[0];\n" +
                "}";
        String answer = "tag @main\n" +
                "    push 10\n" +
                "    store_a %array\n" +
                "    push 19\n" +
                "    push 0\n" +
                "    assign_a %array\n" +
                "    push 0\n" +
                "    push_a %array\n" +
                "    print";
        Assert.assertEquals(removeWhitespace(generateCode(text)),
                removeWhitespace(answer));
    }






}
