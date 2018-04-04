// Generated from E:/code/Impmon/src/impmon\Impmon.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImpmonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, IDENTIFIER=48, INTEGER=49, CHARACTER=50, STRING=51, 
		BASETYPE=52, SKIP_TOKEN=53, LINE_COMMENT=54, BLOCK_COMMENT=55;
	public static final int
		RULE_compilation_unit = 0, RULE_import_stmts = 1, RULE_import_stmt = 2, 
		RULE_tof_defs = 3, RULE_defunc = 4, RULE_defvars = 5, RULE_defclass = 6, 
		RULE_stmts = 7, RULE_stmt = 8, RULE_labeled_stmt = 9, RULE_if_stmt = 10, 
		RULE_while_stmt = 11, RULE_for_stmt = 12, RULE_switch_stmt = 13, RULE_break_stmt = 14, 
		RULE_continue_stmt = 15, RULE_goto_stmt = 16, RULE_return_stmt = 17, RULE_print_stmt = 18, 
		RULE_expr = 19, RULE_factor = 20, RULE_term = 21, RULE_storage = 22, RULE_type = 23, 
		RULE_typeref = 24, RULE_typeref_base = 25, RULE_name = 26, RULE_params = 27, 
		RULE_param = 28, RULE_block = 29, RULE_defvar_list = 30, RULE_member_list = 31, 
		RULE_slot = 32, RULE_args = 33;
	public static final String[] ruleNames = {
		"compilation_unit", "import_stmts", "import_stmt", "tof_defs", "defunc", 
		"defvars", "defclass", "stmts", "stmt", "labeled_stmt", "if_stmt", "while_stmt", 
		"for_stmt", "switch_stmt", "break_stmt", "continue_stmt", "goto_stmt", 
		"return_stmt", "print_stmt", "expr", "factor", "term", "storage", "type", 
		"typeref", "typeref_base", "name", "params", "param", "block", "defvar_list", 
		"member_list", "slot", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "';'", "'('", "')'", "'='", "'['", "']'", "'{'", 
		"'}'", "':'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", 
		"'default'", "'break'", "'continue'", "'goto'", "'return'", "'print'", 
		"'+='", "'-='", "'*='", "'/='", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'static'", 
		"'void'", "'string'", "'int'", "','", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIFIER", "INTEGER", "CHARACTER", "STRING", "BASETYPE", "SKIP_TOKEN", 
		"LINE_COMMENT", "BLOCK_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Impmon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpmonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public Import_stmtsContext import_stmts() {
			return getRuleContext(Import_stmtsContext.class,0);
		}
		public Tof_defsContext tof_defs() {
			return getRuleContext(Tof_defsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			import_stmts();
			setState(69);
			tof_defs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtsContext extends ParserRuleContext {
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public Import_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitImport_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtsContext import_stmts() throws RecognitionException {
		Import_stmtsContext _localctx = new Import_stmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71);
				import_stmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			name();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(79);
				match(T__1);
				setState(80);
				name();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tof_defsContext extends ParserRuleContext {
		public List<DefuncContext> defunc() {
			return getRuleContexts(DefuncContext.class);
		}
		public DefuncContext defunc(int i) {
			return getRuleContext(DefuncContext.class,i);
		}
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public Tof_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tof_defs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitTof_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tof_defsContext tof_defs() throws RecognitionException {
		Tof_defsContext _localctx = new Tof_defsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tof_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(88);
					defunc();
					}
					break;
				case 2:
					{
					setState(89);
					defvars();
					}
					break;
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefuncContext defunc() throws RecognitionException {
		DefuncContext _localctx = new DefuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			type();
			setState(96);
			name();
			setState(97);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				setState(98);
				params();
				}
			}

			setState(101);
			match(T__4);
			setState(102);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarsContext extends ParserRuleContext {
		public DefvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvars; }
	 
		public DefvarsContext() { }
		public void copyFrom(DefvarsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefvarContext extends DefvarsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefvarContext(DefvarsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefarrContext extends DefvarsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DefarrContext(DefvarsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDefarr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarsContext defvars() throws RecognitionException {
		DefvarsContext _localctx = new DefvarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defvars);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DefvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				type();
				setState(105);
				name();
				setState(106);
				match(T__5);
				setState(107);
				expr();
				setState(108);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new DefarrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				type();
				setState(111);
				match(T__6);
				setState(112);
				expr();
				setState(113);
				match(T__7);
				setState(114);
				name();
				setState(115);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefclassContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DefclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDefclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefclassContext defclass() throws RecognitionException {
		DefclassContext _localctx = new DefclassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			type();
			setState(120);
			name();
			setState(121);
			match(T__8);
			setState(122);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				{
				setState(124);
				stmt();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LabeledStmtContext extends StmtContext {
		public Labeled_stmtContext labeled_stmt() {
			return getRuleContext(Labeled_stmtContext.class,0);
		}
		public LabeledStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitLabeledStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends StmtContext {
		public EmptyStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStmtContext extends StmtContext {
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public GotoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStmtContext extends StmtContext {
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public SwitchStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StmtContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StmtContext {
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitToExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LabeledStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				labeled_stmt();
				}
				break;
			case 3:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				expr();
				setState(133);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				block();
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				if_stmt();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				while_stmt();
				}
				break;
			case 7:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				for_stmt();
				}
				break;
			case 8:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				switch_stmt();
				}
				break;
			case 9:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				break_stmt();
				}
				break;
			case 10:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				continue_stmt();
				}
				break;
			case 11:
				_localctx = new GotoStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				goto_stmt();
				}
				break;
			case 12:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(143);
				return_stmt();
				}
				break;
			case 13:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				print_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_stmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Labeled_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitLabeled_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_stmtContext labeled_stmt() throws RecognitionException {
		Labeled_stmtContext _localctx = new Labeled_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_labeled_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(T__10);
			setState(149);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__11);
			setState(152);
			match(T__3);
			setState(153);
			expr();
			setState(154);
			match(T__4);
			setState(155);
			stmt();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(156);
				match(T__12);
				setState(157);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__13);
			setState(161);
			match(T__3);
			setState(162);
			expr();
			setState(163);
			match(T__4);
			setState(164);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public DefvarsContext defvars() {
			return getRuleContext(DefvarsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__14);
			setState(167);
			match(T__3);
			setState(168);
			defvars();
			setState(169);
			expr();
			setState(170);
			match(T__2);
			setState(171);
			expr();
			setState(172);
			match(T__4);
			setState(173);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__15);
			setState(176);
			match(T__3);
			setState(177);
			expr();
			setState(178);
			match(T__4);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(T__16);
					setState(180);
					expr();
					setState(181);
					match(T__10);
					setState(182);
					stmt();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(189);
				match(T__17);
				setState(190);
				match(T__10);
				setState(191);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__18);
			setState(195);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__19);
			setState(198);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Goto_stmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public Goto_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitGoto_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_stmtContext goto_stmt() throws RecognitionException {
		Goto_stmtContext _localctx = new Goto_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__20);
			setState(201);
			match(IDENTIFIER);
			setState(202);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_stmt);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__21);
				setState(205);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__21);
				setState(207);
				expr();
				setState(208);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__22);
			setState(213);
			expr();
			setState(214);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitSubAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MulAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitMulAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitAddAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DivAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDivAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToFactorContext extends ExprContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ToFactorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitToFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				term(0);
				setState(217);
				match(T__5);
				setState(218);
				expr();
				}
				break;
			case 2:
				_localctx = new AddAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				term(0);
				setState(221);
				match(T__23);
				setState(222);
				expr();
				}
				break;
			case 3:
				_localctx = new SubAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				term(0);
				setState(225);
				match(T__24);
				setState(226);
				expr();
				}
				break;
			case 4:
				_localctx = new MulAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				term(0);
				setState(229);
				match(T__25);
				setState(230);
				expr();
				}
				break;
			case 5:
				_localctx = new DivAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				term(0);
				setState(233);
				match(T__26);
				setState(234);
				expr();
				}
				break;
			case 6:
				_localctx = new ToFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				factor(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public AddContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtnContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public GtnContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitGtn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public SubContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoeContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public LoeContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitLoe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public OrContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MulContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtnContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public LtnContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitLtn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public EqContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public DivContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToTermContext extends FactorContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ToTermContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitToTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public AndContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public NeqContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoeContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public GoeContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitGoe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(240);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(242);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(243);
						match(T__27);
						setState(244);
						factor(14);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(245);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(246);
						match(T__28);
						setState(247);
						factor(13);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249);
						match(T__29);
						setState(250);
						factor(12);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(251);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(252);
						match(T__30);
						setState(253);
						factor(11);
						}
						break;
					case 5:
						{
						_localctx = new GtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(254);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(255);
						match(T__31);
						setState(256);
						factor(10);
						}
						break;
					case 6:
						{
						_localctx = new LtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						match(T__32);
						setState(259);
						factor(9);
						}
						break;
					case 7:
						{
						_localctx = new GoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(260);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(261);
						match(T__33);
						setState(262);
						factor(8);
						}
						break;
					case 8:
						{
						_localctx = new LoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(263);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(264);
						match(T__34);
						setState(265);
						factor(7);
						}
						break;
					case 9:
						{
						_localctx = new EqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(266);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(267);
						match(T__35);
						setState(268);
						factor(6);
						}
						break;
					case 10:
						{
						_localctx = new NeqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270);
						match(T__36);
						setState(271);
						factor(5);
						}
						break;
					case 11:
						{
						_localctx = new AndContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(272);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(273);
						match(T__37);
						setState(274);
						factor(4);
						}
						break;
					case 12:
						{
						_localctx = new OrContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(T__38);
						setState(277);
						factor(3);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrContext extends TermContext {
		public TerminalNode STRING() { return getToken(ImpmonParser.STRING, 0); }
		public StrContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends TermContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DecContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdenContext extends TermContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public IdenContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallArrayContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallArrayContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitCallArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFuncContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallFuncContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TermContext {
		public TerminalNode INTEGER() { return getToken(ImpmonParser.INTEGER, 0); }
		public IntContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IncContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(284);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(STRING);
				}
				break;
			case T__3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__3);
				setState(288);
				expr();
				setState(289);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new IncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(294);
						match(T__39);
						}
						break;
					case 2:
						{
						_localctx = new DecContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						match(T__40);
						}
						break;
					case 3:
						{
						_localctx = new CallArrayContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(297);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(298);
						match(T__6);
						setState(299);
						expr();
						setState(300);
						match(T__7);
						}
						break;
					case 4:
						{
						_localctx = new CallFuncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(302);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(303);
						match(T__3);
						setState(304);
						args();
						setState(305);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StorageContext extends ParserRuleContext {
		public StorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitStorage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageContext storage() throws RecognitionException {
		StorageContext _localctx = new StorageContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(312);
				match(T__41);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TyperefContext typeref() {
			return getRuleContext(TyperefContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			typeref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyperefContext extends ParserRuleContext {
		public Typeref_baseContext typeref_base() {
			return getRuleContext(Typeref_baseContext.class,0);
		}
		public TyperefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitTyperef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyperefContext typeref() throws RecognitionException {
		TyperefContext _localctx = new TyperefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			typeref_base();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typeref_baseContext extends ParserRuleContext {
		public Typeref_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref_base; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitTyperef_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typeref_baseContext typeref_base() throws RecognitionException {
		Typeref_baseContext _localctx = new Typeref_baseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeref_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_params);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				param();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45) {
					{
					{
					setState(324);
					match(T__45);
					setState(325);
					param();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				param();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(332);
					match(T__45);
					setState(333);
					match(T__46);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			type();
			setState(339);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Defvar_listContext defvar_list() {
			return getRuleContext(Defvar_listContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__8);
			setState(342);
			defvar_list();
			setState(343);
			stmts();
			setState(344);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defvar_listContext extends ParserRuleContext {
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public Defvar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitDefvar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defvar_listContext defvar_list() throws RecognitionException {
		Defvar_listContext _localctx = new Defvar_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defvar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				{
				setState(346);
				defvars();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__8);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
				{
				{
				setState(353);
				slot();
				setState(354);
				match(T__2);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitSlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotContext slot() throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			type();
			setState(364);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpmonVisitor ) return ((ImpmonVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(366);
				expr();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45) {
					{
					{
					setState(367);
					match(T__45);
					setState(368);
					expr();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3"+
		"\6\3\6\3\6\3\6\5\6f\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\b\3\b\3\t\7\t\u0080\n\t\f\t"+
		"\16\t\u0083\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bb\n\17"+
		"\f\17\16\17\u00be\13\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00d5\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00f0\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0119\n\26\f\26\16\26\u011c\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0126\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0136\n\27\f\27\16\27\u0139\13\27\3\30\5\30"+
		"\u013c\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u0149\n\35\f\35\16\35\u014c\13\35\3\35\3\35\3\35\5\35\u0151\n\35\5\35"+
		"\u0153\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \7 \u015e\n \f "+
		"\16 \u0161\13 \3!\3!\3!\3!\7!\u0167\n!\f!\16!\u016a\13!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\7#\u0174\n#\f#\16#\u0177\13#\5#\u0179\n#\3#\2\4*,$\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2"+
		"-/\2\u018f\2F\3\2\2\2\4L\3\2\2\2\6O\3\2\2\2\b^\3\2\2\2\na\3\2\2\2\fw\3"+
		"\2\2\2\16y\3\2\2\2\20\u0081\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2"+
		"\26\u0099\3\2\2\2\30\u00a2\3\2\2\2\32\u00a8\3\2\2\2\34\u00b1\3\2\2\2\36"+
		"\u00c4\3\2\2\2 \u00c7\3\2\2\2\"\u00ca\3\2\2\2$\u00d4\3\2\2\2&\u00d6\3"+
		"\2\2\2(\u00ef\3\2\2\2*\u00f1\3\2\2\2,\u0125\3\2\2\2.\u013b\3\2\2\2\60"+
		"\u013d\3\2\2\2\62\u013f\3\2\2\2\64\u0141\3\2\2\2\66\u0143\3\2\2\28\u0152"+
		"\3\2\2\2:\u0154\3\2\2\2<\u0157\3\2\2\2>\u015f\3\2\2\2@\u0162\3\2\2\2B"+
		"\u016d\3\2\2\2D\u0178\3\2\2\2FG\5\4\3\2GH\5\b\5\2H\3\3\2\2\2IK\5\6\4\2"+
		"JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP\7\3\2"+
		"\2PU\5\66\34\2QR\7\4\2\2RT\5\66\34\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\5\2\2Y\7\3\2\2\2Z]\5\n\6\2[]\5\f\7\2\\"+
		"Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`^\3\2\2"+
		"\2ab\5\60\31\2bc\5\66\34\2ce\7\6\2\2df\58\35\2ed\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gh\7\7\2\2hi\5<\37\2i\13\3\2\2\2jk\5\60\31\2kl\5\66\34\2lm\7\b\2"+
		"\2mn\5(\25\2no\7\5\2\2ox\3\2\2\2pq\5\60\31\2qr\7\t\2\2rs\5(\25\2st\7\n"+
		"\2\2tu\5\66\34\2uv\7\5\2\2vx\3\2\2\2wj\3\2\2\2wp\3\2\2\2x\r\3\2\2\2yz"+
		"\5\60\31\2z{\5\66\34\2{|\7\13\2\2|}\7\f\2\2}\17\3\2\2\2~\u0080\5\22\n"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\21\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0094\7\5\2\2\u0085\u0094"+
		"\5\24\13\2\u0086\u0087\5(\25\2\u0087\u0088\7\5\2\2\u0088\u0094\3\2\2\2"+
		"\u0089\u0094\5<\37\2\u008a\u0094\5\26\f\2\u008b\u0094\5\30\r\2\u008c\u0094"+
		"\5\32\16\2\u008d\u0094\5\34\17\2\u008e\u0094\5\36\20\2\u008f\u0094\5 "+
		"\21\2\u0090\u0094\5\"\22\2\u0091\u0094\5$\23\2\u0092\u0094\5&\24\2\u0093"+
		"\u0084\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u0089\3\2"+
		"\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096"+
		"\7\62\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\22\n\2\u0098\25\3\2\2\2\u0099"+
		"\u009a\7\16\2\2\u009a\u009b\7\6\2\2\u009b\u009c\5(\25\2\u009c\u009d\7"+
		"\7\2\2\u009d\u00a0\5\22\n\2\u009e\u009f\7\17\2\2\u009f\u00a1\5\22\n\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3"+
		"\7\20\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5(\25\2\u00a5\u00a6\7\7\2\2"+
		"\u00a6\u00a7\5\22\n\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa"+
		"\7\6\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\7\5\2\2\u00ad"+
		"\u00ae\5(\25\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5\22\n\2\u00b0\33\3\2\2"+
		"\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\5(\25\2\u00b4"+
		"\u00bc\7\7\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7"+
		"\r\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\7\r\2\2\u00c1"+
		"\u00c3\5\22\n\2\u00c2\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2"+
		"\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\7\5\2\2\u00c6\37\3\2\2\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00c9\7\5\2\2\u00c9!\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb"+
		"\u00cc\7\62\2\2\u00cc\u00cd\7\5\2\2\u00cd#\3\2\2\2\u00ce\u00cf\7\30\2"+
		"\2\u00cf\u00d5\7\5\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5(\25\2\u00d2"+
		"\u00d3\7\5\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9"+
		"\7\5\2\2\u00d9\'\3\2\2\2\u00da\u00db\5,\27\2\u00db\u00dc\7\b\2\2\u00dc"+
		"\u00dd\5(\25\2\u00dd\u00f0\3\2\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7\32"+
		"\2\2\u00e0\u00e1\5(\25\2\u00e1\u00f0\3\2\2\2\u00e2\u00e3\5,\27\2\u00e3"+
		"\u00e4\7\33\2\2\u00e4\u00e5\5(\25\2\u00e5\u00f0\3\2\2\2\u00e6\u00e7\5"+
		",\27\2\u00e7\u00e8\7\34\2\2\u00e8\u00e9\5(\25\2\u00e9\u00f0\3\2\2\2\u00ea"+
		"\u00eb\5,\27\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\5(\25\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00f0\5*\26\2\u00ef\u00da\3\2\2\2\u00ef\u00de\3\2\2\2\u00ef"+
		"\u00e2\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0)\3\2\2\2\u00f1\u00f2\b\26\1\2\u00f2\u00f3\5,\27\2\u00f3\u011a"+
		"\3\2\2\2\u00f4\u00f5\f\17\2\2\u00f5\u00f6\7\36\2\2\u00f6\u0119\5*\26\20"+
		"\u00f7\u00f8\f\16\2\2\u00f8\u00f9\7\37\2\2\u00f9\u0119\5*\26\17\u00fa"+
		"\u00fb\f\r\2\2\u00fb\u00fc\7 \2\2\u00fc\u0119\5*\26\16\u00fd\u00fe\f\f"+
		"\2\2\u00fe\u00ff\7!\2\2\u00ff\u0119\5*\26\r\u0100\u0101\f\13\2\2\u0101"+
		"\u0102\7\"\2\2\u0102\u0119\5*\26\f\u0103\u0104\f\n\2\2\u0104\u0105\7#"+
		"\2\2\u0105\u0119\5*\26\13\u0106\u0107\f\t\2\2\u0107\u0108\7$\2\2\u0108"+
		"\u0119\5*\26\n\u0109\u010a\f\b\2\2\u010a\u010b\7%\2\2\u010b\u0119\5*\26"+
		"\t\u010c\u010d\f\7\2\2\u010d\u010e\7&\2\2\u010e\u0119\5*\26\b\u010f\u0110"+
		"\f\6\2\2\u0110\u0111\7\'\2\2\u0111\u0119\5*\26\7\u0112\u0113\f\5\2\2\u0113"+
		"\u0114\7(\2\2\u0114\u0119\5*\26\6\u0115\u0116\f\4\2\2\u0116\u0117\7)\2"+
		"\2\u0117\u0119\5*\26\5\u0118\u00f4\3\2\2\2\u0118\u00f7\3\2\2\2\u0118\u00fa"+
		"\3\2\2\2\u0118\u00fd\3\2\2\2\u0118\u0100\3\2\2\2\u0118\u0103\3\2\2\2\u0118"+
		"\u0106\3\2\2\2\u0118\u0109\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010f\3\2"+
		"\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b+\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d\u011e\b\27\1\2\u011e\u0126\7\63\2\2\u011f\u0126\7\62\2\2\u0120"+
		"\u0126\7\65\2\2\u0121\u0122\7\6\2\2\u0122\u0123\5(\25\2\u0123\u0124\7"+
		"\7\2\2\u0124\u0126\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0137\3\2\2\2\u0127\u0128\f\6"+
		"\2\2\u0128\u0136\7*\2\2\u0129\u012a\f\5\2\2\u012a\u0136\7+\2\2\u012b\u012c"+
		"\f\4\2\2\u012c\u012d\7\t\2\2\u012d\u012e\5(\25\2\u012e\u012f\7\n\2\2\u012f"+
		"\u0136\3\2\2\2\u0130\u0131\f\3\2\2\u0131\u0132\7\6\2\2\u0132\u0133\5D"+
		"#\2\u0133\u0134\7\7\2\2\u0134\u0136\3\2\2\2\u0135\u0127\3\2\2\2\u0135"+
		"\u0129\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u0130\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138-\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013c\7,\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"/\3\2\2\2\u013d\u013e\5\62\32\2\u013e\61\3\2\2\2\u013f\u0140\5\64\33\2"+
		"\u0140\63\3\2\2\2\u0141\u0142\t\2\2\2\u0142\65\3\2\2\2\u0143\u0144\7\62"+
		"\2\2\u0144\67\3\2\2\2\u0145\u014a\5:\36\2\u0146\u0147\7\60\2\2\u0147\u0149"+
		"\5:\36\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0153\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\5:"+
		"\36\2\u014e\u014f\7\60\2\2\u014f\u0151\7\61\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0145\3\2\2\2\u0152\u014d\3\2"+
		"\2\2\u01539\3\2\2\2\u0154\u0155\5\60\31\2\u0155\u0156\5\66\34\2\u0156"+
		";\3\2\2\2\u0157\u0158\7\13\2\2\u0158\u0159\5> \2\u0159\u015a\5\20\t\2"+
		"\u015a\u015b\7\f\2\2\u015b=\3\2\2\2\u015c\u015e\5\f\7\2\u015d\u015c\3"+
		"\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"?\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0168\7\13\2\2\u0163\u0164\5B\"\2"+
		"\u0164\u0165\7\5\2\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016c\7\f\2\2\u016cA\3\2\2\2\u016d\u016e\5\60\31"+
		"\2\u016e\u016f\5\66\34\2\u016fC\3\2\2\2\u0170\u0175\5(\25\2\u0171\u0172"+
		"\7\60\2\2\u0172\u0174\5(\25\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0179\3\2\2\2\u0179E\3\2\2\2\34LU\\"+
		"^ew\u0081\u0093\u00a0\u00bc\u00c2\u00d4\u00ef\u0118\u011a\u0125\u0135"+
		"\u0137\u013b\u014a\u0150\u0152\u015f\u0168\u0175\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}