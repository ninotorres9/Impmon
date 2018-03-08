

import os
import unittest
import re

class TestImpmon(unittest.TestCase):
    def compile(self, filename):
        with os.popen("java MainVisit E:\\code\\Impmon\\test\\" + filename + ".im") as ir:
            pass
        with os.popen("E:\\code\\Guilmon\\Debug\\Guilmon.exe -r demo.gl") as result:
            return result.read()
    
    def test_add(self):
        self.assertEqual("6", self.compile("add").replace("\n", ""))

    def test_mult(self):
        self.assertEqual("12", self.compile("mult").replace("\n", ""))

    def test_div(self):
        self.assertEqual("2", self.compile("div").replace("\n", ""))

    def test_gtn(self):
        self.assertEqual("1", self.compile("gtn").replace("\n", ""))

    def test_cond(self):
        self.assertEqual("0", self.compile("cond").replace("\n", ""))

    def test_par(self):
        self.assertEqual("12", self.compile("par").replace("\n", ""))

    def test_defvar(self):
        self.assertEqual("15", self.compile("defvar").replace("\n", ""))

    def test_assign(self):
        self.assertEqual("20", self.compile("assign").replace("\n", ""))

    def test_addAssign(self):
        self.assertEqual("35", self.compile("addAssign").replace("\n", ""))

    def test_multAssign(self):
        self.assertEqual("2", self.compile("multAssign").replace("\n", ""))

    def test_if(self):
        self.assertEqual("250", self.compile("if").replace("\n", ""))
    
    def test_ifElse(self):
        self.assertEqual("900", self.compile("ifElse").replace("\n", ""))

    def test_MultIf(self):
        self.assertEqual("32", self.compile("multIf").replace("\n", ""))

    def test_ifElseIf(self):
        self.assertEqual("25", self.compile("ifElseIf").replace("\n", ""))

    def test_nestedIf(self):
        self.assertEqual("999", self.compile("nestedIf").replace("\n", ""))

    def test_multDef(self):
        self.assertEqual("25", self.compile("multDef").replace("\n", ""))

    def test_while(self):
        self.assertEqual("25", self.compile("while").replace("\n", ""))

    def test_incDec(self):
        self.assertEqual("15", self.compile("incDec").replace("\n", ""))

    def test_nestedWhile(self):
        self.assertEqual("100", self.compile("nestedWhile").replace("\n", ""))

    def test_for(self):
        self.assertEqual("25", self.compile("for").replace("\n", ""))

    def test_emptyStatement(self):
        self.assertEqual("50", self.compile("emptyStatement").replace("\n", ""))

    def test_nestedScope(self):
        self.assertEqual("50", self.compile("nestedScope").replace("\n", ""))

    # def test_array(self):
    #     self.assertEqual("15", self.compile("array").replace("\n", ""))

if __name__ == '__main__':
    unittest.main()




