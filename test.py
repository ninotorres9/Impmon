

import os
import unittest
import re

class TestImpmon(unittest.TestCase):
    def compile(self, filename):
        with os.popen("java MainVisit E:\\code\\Impmon\\test\\" + filename + ".im") as ir:
            pass
        with os.popen("E:\\code\\Guilmon\\Debug\\Guilmon.exe -r demo.gl") as result:
            return result.read()
    
    # def test_add(self):
    #     self.assertEqual("6", self.compile("add").replace("\n", ""))

    # def test_mult(self):
    #     self.assertEqual("12", self.compile("mult").replace("\n", ""))

    # def test_div(self):
    #     self.assertEqual("2", self.compile("div").replace("\n", ""))

    # def test_gtn(self):
    #     self.assertEqual("1", self.compile("gtn").replace("\n", ""))

    # def test_cond(self):
    #     self.assertEqual("0", self.compile("cond").replace("\n", ""))

    # def test_par(self):
    #     self.assertEqual("12", self.compile("par").replace("\n", ""))

    # def test_defvar(self):
    #     self.assertEqual("15", self.compile("defvar").replace("\n", ""))

    # def test_assign(self):
    #     self.assertEqual("20", self.compile("assign").replace("\n", ""))

    # def test_addAssign(self):
    #     self.assertEqual("35", self.compile("addAssign").replace("\n", ""))

    # def test_multAssign(self):
    #     self.assertEqual("2", self.compile("multAssign").replace("\n", ""))

    def test_if(self):
        self.assertEqual("250", self.compile("if").replace("\n", ""))

if __name__ == '__main__':
    unittest.main()




