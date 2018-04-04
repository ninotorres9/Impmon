package test.impmon; 

import impmon.Scope;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import impmon.Scope.*;

import java.rmi.server.ExportException;

/** 
* Scope Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 22, 2018</pre> 
* @version 1.0 
*/ 
public class ScopeTest { 

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testEnterScope() throws  Exception{
        TopScope scope = new TopScope();
        scope.createVariable("var"
                , new Variable("int", "var"));

        scope.addSubScope("scope1");
        scope.createVariable("var"
                , new Variable("char", "var"));

        Assert.assertEquals(scope.getType("var"), "char");
        Assert.assertEquals(scope.getName("var"), "scope1_var");
    }

    @Test
    public void testExitScope() throws  Exception{
        TopScope scope = new TopScope();
        scope.createVariable("var"
                , new Variable("int", "var"));

        scope.addSubScope("scope");
        scope.createVariable("var"
                , new Variable("char", "var"));

        scope.exitScope();
        Assert.assertEquals(scope.getType("var"), "int");
        Assert.assertEquals(scope.getName("var"), "var");
    }

    @Test
    public void testFind() throws  Exception{
        TopScope scope = new TopScope();
        scope.createVariable("var"
                , new Variable("int", "var"));

        scope.addSubScope("scope");
        scope.createVariable("akb"
                , new Variable("char", "akb"));

        Assert.assertEquals(scope.getType("var"), "int");

    }

    @Test
    public void testFind_1() throws  Exception{
        TopScope scope = new TopScope();
        scope.createVariable("var"
                , new Variable("int", "var"));

        scope.addSubScope("scope");
        scope.addSubScope("scope1");
        Assert.assertEquals(scope.getType("var"), "int");

    }

    @Test
    public void testHas() throws Exception{
        TopScope scope = new TopScope();
        scope.createVariable("var"
                , new Variable("int", "var"));
        Assert.assertTrue(scope.hasVariable("var"));
        Assert.assertFalse(scope.hasVariable("err"));
    }

    @Test
    public void testGetNames() throws Exception{
        TopScope scope = new TopScope();
        scope.addSubScope("scope");
        scope.createVariable("abc"
                , new Variable("int", "abc"));
        scope.createVariable("cde"
                , new Variable("int", "cde"));
        Assert.assertEquals(scope.getNames().size(), 2);
        Assert.assertTrue(scope.getNames().contains("scope_abc"));
        Assert.assertTrue(scope.getNames().contains("scope_cde"));
    }

}
