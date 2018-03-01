// Generated from e:\code\Impmon\Impmon.g4 by ANTLR 4.7
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, IDENTIFIER=51, INTEGER=52, 
		CHARACTER=53, STRING=54, BASETYPE=55, SKIP_TOKEN=56, LINE_COMMENT=57, 
		BLOCK_COMMENT=58;
	public static final int
		RULE_compilation_unit = 0, RULE_import_stmts = 1, RULE_import_stmt = 2, 
		RULE_tof_defs = 3, RULE_defunc = 4, RULE_defvars = 5, RULE_defstruct = 6, 
		RULE_defunion = 7, RULE_typedef = 8, RULE_stmts = 9, RULE_stmt = 10, RULE_labeled_stmt = 11, 
		RULE_if_stmt = 12, RULE_while_stmt = 13, RULE_for_stmt = 14, RULE_switch_stmt = 15, 
		RULE_break_stmt = 16, RULE_continue_stmt = 17, RULE_goto_stmt = 18, RULE_return_stmt = 19, 
		RULE_print_stmt = 20, RULE_expr = 21, RULE_factor = 22, RULE_term = 23, 
		RULE_storage = 24, RULE_type = 25, RULE_typeref = 26, RULE_typeref_base = 27, 
		RULE_name = 28, RULE_params = 29, RULE_param = 30, RULE_block = 31, RULE_defvar_list = 32, 
		RULE_member_list = 33, RULE_slot = 34, RULE_args = 35;
	public static final String[] ruleNames = {
		"compilation_unit", "import_stmts", "import_stmt", "tof_defs", "defunc", 
		"defvars", "defstruct", "defunion", "typedef", "stmts", "stmt", "labeled_stmt", 
		"if_stmt", "while_stmt", "for_stmt", "switch_stmt", "break_stmt", "continue_stmt", 
		"goto_stmt", "return_stmt", "print_stmt", "expr", "factor", "term", "storage", 
		"type", "typeref", "typeref_base", "name", "params", "param", "block", 
		"defvar_list", "member_list", "slot", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "';'", "'('", "')'", "'='", "','", "'struct'", 
		"'union'", "'typedef'", "':'", "'if'", "'else'", "'while'", "'for'", "'switch'", 
		"'case'", "'default'", "'break'", "'continue'", "'goto'", "'return'", 
		"'print'", "'+='", "'-='", "'*='", "'/='", "'*'", "'/'", "'+'", "'-'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'['", "']'", "'static'", "'void'", "'char'", "'int'", "'...'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IDENTIFIER", "INTEGER", "CHARACTER", "STRING", "BASETYPE", 
		"SKIP_TOKEN", "LINE_COMMENT", "BLOCK_COMMENT"
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
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			import_stmts();
			setState(73);
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
	}

	public final Import_stmtsContext import_stmts() throws RecognitionException {
		Import_stmtsContext _localctx = new Import_stmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(75);
				import_stmt();
				}
				}
				setState(80);
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
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			name();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				name();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		public List<DefstructContext> defstruct() {
			return getRuleContexts(DefstructContext.class);
		}
		public DefstructContext defstruct(int i) {
			return getRuleContext(DefstructContext.class,i);
		}
		public List<DefunionContext> defunion() {
			return getRuleContexts(DefunionContext.class);
		}
		public DefunionContext defunion(int i) {
			return getRuleContext(DefunionContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public Tof_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tof_defs; }
	}

	public final Tof_defsContext tof_defs() throws RecognitionException {
		Tof_defsContext _localctx = new Tof_defsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tof_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(92);
					defunc();
					}
					break;
				case 2:
					{
					setState(93);
					defvars();
					}
					break;
				case 3:
					{
					setState(94);
					defstruct();
					}
					break;
				case 4:
					{
					setState(95);
					defunion();
					}
					break;
				case 5:
					{
					setState(96);
					typedef();
					}
					break;
				}
				}
				setState(101);
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
	}

	public final DefuncContext defunc() throws RecognitionException {
		DefuncContext _localctx = new DefuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			name();
			setState(104);
			match(T__3);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
				{
				setState(105);
				params();
				}
			}

			setState(108);
			match(T__4);
			setState(109);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DefvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvars; }
	}

	public final DefvarsContext defvars() throws RecognitionException {
		DefvarsContext _localctx = new DefvarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defvars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			name();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(113);
				match(T__5);
				setState(114);
				expr();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(115);
					match(T__6);
					setState(116);
					name();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(117);
						match(T__5);
						setState(118);
						expr();
						}
					}

					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
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

	public static class DefstructContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public DefstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstruct; }
	}

	public final DefstructContext defstruct() throws RecognitionException {
		DefstructContext _localctx = new DefstructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__7);
			setState(131);
			name();
			setState(132);
			member_list();
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

	public static class DefunionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public DefunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defunion; }
	}

	public final DefunionContext defunion() throws RecognitionException {
		DefunionContext _localctx = new DefunionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__8);
			setState(135);
			name();
			setState(136);
			member_list();
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

	public static class TypedefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__9);
			setState(139);
			type();
			setState(140);
			match(IDENTIFIER);
			setState(141);
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
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__48) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(143);
				stmt();
				}
				}
				setState(148);
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
	public static class PassStmtContext extends StmtContext {
		public PassStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class LabeledStmtContext extends StmtContext {
		public Labeled_stmtContext labeled_stmt() {
			return getRuleContext(Labeled_stmtContext.class,0);
		}
		public LabeledStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ForStmtContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStmtContext extends StmtContext {
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public GotoStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchStmtContext extends StmtContext {
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public SwitchStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStmtContext extends StmtContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class BlockStmtContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStmtContext extends StmtContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStmtContext extends StmtContext {
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ToExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PassStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LabeledStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				labeled_stmt();
				}
				break;
			case 3:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				expr();
				setState(152);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				block();
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				if_stmt();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				while_stmt();
				}
				break;
			case 7:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				for_stmt();
				}
				break;
			case 8:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				switch_stmt();
				}
				break;
			case 9:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				break_stmt();
				}
				break;
			case 10:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				continue_stmt();
				}
				break;
			case 11:
				_localctx = new GotoStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				goto_stmt();
				}
				break;
			case 12:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				return_stmt();
				}
				break;
			case 13:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
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
	}

	public final Labeled_stmtContext labeled_stmt() throws RecognitionException {
		Labeled_stmtContext _localctx = new Labeled_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_labeled_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
			setState(167);
			match(T__10);
			setState(168);
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
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__11);
			setState(171);
			match(T__3);
			setState(172);
			expr();
			setState(173);
			match(T__4);
			setState(174);
			stmt();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(175);
				match(T__12);
				setState(176);
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
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__13);
			setState(180);
			match(T__3);
			setState(181);
			expr();
			setState(182);
			match(T__4);
			setState(183);
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
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__14);
			setState(186);
			match(T__3);
			setState(187);
			defvars();
			setState(188);
			expr();
			setState(189);
			match(T__2);
			setState(190);
			expr();
			setState(191);
			match(T__4);
			setState(192);
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
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__15);
			setState(195);
			match(T__3);
			setState(196);
			expr();
			setState(197);
			match(T__4);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(T__16);
					setState(199);
					expr();
					setState(200);
					match(T__10);
					setState(201);
					stmt();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(208);
				match(T__17);
				setState(209);
				match(T__10);
				setState(210);
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
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__18);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__19);
			setState(217);
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
	}

	public final Goto_stmtContext goto_stmt() throws RecognitionException {
		Goto_stmtContext _localctx = new Goto_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__20);
			setState(220);
			match(IDENTIFIER);
			setState(221);
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
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_stmt);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__21);
				setState(224);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__21);
				setState(226);
				expr();
				setState(227);
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
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__22);
			setState(232);
			expr();
			setState(233);
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
	}
	public static class MulAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MulAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivAssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DivAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ToFactorContext extends ExprContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ToFactorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				term(0);
				setState(236);
				match(T__5);
				setState(237);
				expr();
				}
				break;
			case 2:
				_localctx = new AddAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				term(0);
				setState(240);
				match(T__23);
				setState(241);
				expr();
				}
				break;
			case 3:
				_localctx = new SubAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				term(0);
				setState(244);
				match(T__24);
				setState(245);
				expr();
				}
				break;
			case 4:
				_localctx = new MulAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				term(0);
				setState(248);
				match(T__25);
				setState(249);
				expr();
				}
				break;
			case 5:
				_localctx = new DivAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				term(0);
				setState(252);
				match(T__26);
				setState(253);
				expr();
				}
				break;
			case 6:
				_localctx = new ToFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
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
	}
	public static class GtnContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public GtnContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public SubContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class LoeContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public LoeContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public OrContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MulContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class LtnContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public LtnContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class EqContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public EqContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class DivContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public DivContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class ToTermContext extends FactorContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ToTermContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public AndContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class NeqContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public NeqContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class GoeContext extends FactorContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public GoeContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(259);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(262);
						match(T__27);
						setState(263);
						factor(14);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(264);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(265);
						match(T__28);
						setState(266);
						factor(13);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						match(T__29);
						setState(269);
						factor(12);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(270);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(271);
						match(T__30);
						setState(272);
						factor(11);
						}
						break;
					case 5:
						{
						_localctx = new GtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(273);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(274);
						match(T__31);
						setState(275);
						factor(10);
						}
						break;
					case 6:
						{
						_localctx = new LtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(276);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(277);
						match(T__32);
						setState(278);
						factor(9);
						}
						break;
					case 7:
						{
						_localctx = new GoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(279);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(280);
						match(T__33);
						setState(281);
						factor(8);
						}
						break;
					case 8:
						{
						_localctx = new LoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(282);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(283);
						match(T__34);
						setState(284);
						factor(7);
						}
						break;
					case 9:
						{
						_localctx = new EqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(285);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(286);
						match(T__35);
						setState(287);
						factor(6);
						}
						break;
					case 10:
						{
						_localctx = new NeqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(288);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(289);
						match(T__36);
						setState(290);
						factor(5);
						}
						break;
					case 11:
						{
						_localctx = new AndContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						match(T__37);
						setState(293);
						factor(4);
						}
						break;
					case 12:
						{
						_localctx = new OrContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295);
						match(T__38);
						setState(296);
						factor(3);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class ParContext extends TermContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class DecContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DecContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class IdenContext extends TermContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public IdenContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class CallArrayContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallArrayContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class CharContext extends TermContext {
		public TerminalNode CHARACTER() { return getToken(ImpmonParser.CHARACTER, 0); }
		public CharContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class CallFuncContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallFuncContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends TermContext {
		public TerminalNode INTEGER() { return getToken(ImpmonParser.INTEGER, 0); }
		public IntContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class IncContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IncContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(303);
				match(INTEGER);
				}
				break;
			case CHARACTER:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(CHARACTER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(IDENTIFIER);
				}
				break;
			case T__3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__3);
				setState(307);
				expr();
				setState(308);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new IncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						match(T__39);
						}
						break;
					case 2:
						{
						_localctx = new DecContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(314);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(315);
						match(T__40);
						}
						break;
					case 3:
						{
						_localctx = new CallArrayContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(316);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(317);
						match(T__41);
						setState(318);
						expr();
						setState(319);
						match(T__42);
						}
						break;
					case 4:
						{
						_localctx = new CallFuncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(321);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(322);
						match(T__3);
						setState(323);
						args();
						setState(324);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	}

	public final StorageContext storage() throws RecognitionException {
		StorageContext _localctx = new StorageContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(331);
				match(T__43);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		public TyperefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref; }
	 
		public TyperefContext() { }
		public void copyFrom(TyperefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TyperefContext {
		public Typeref_baseContext typeref_base() {
			return getRuleContext(Typeref_baseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ImpmonParser.INTEGER, 0); }
		public ArrayTypeContext(TyperefContext ctx) { copyFrom(ctx); }
	}
	public static class BaseTypeContext extends TyperefContext {
		public Typeref_baseContext typeref_base() {
			return getRuleContext(Typeref_baseContext.class,0);
		}
		public BaseTypeContext(TyperefContext ctx) { copyFrom(ctx); }
	}

	public final TyperefContext typeref() throws RecognitionException {
		TyperefContext _localctx = new TyperefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeref);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				typeref_base();
				setState(337);
				match(T__41);
				setState(338);
				match(INTEGER);
				setState(339);
				match(T__42);
				}
				break;
			case 2:
				_localctx = new BaseTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				typeref_base();
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

	public static class Typeref_baseContext extends ParserRuleContext {
		public Typeref_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref_base; }
	}

	public final Typeref_baseContext typeref_base() throws RecognitionException {
		Typeref_baseContext _localctx = new Typeref_baseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeref_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_params);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				param();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(349);
					match(T__6);
					setState(350);
					param();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				param();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(357);
					match(T__6);
					setState(358);
					match(T__47);
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
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_param);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__48);
			setState(367);
			defvar_list();
			setState(368);
			stmts();
			setState(369);
			match(T__49);
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
	}

	public final Defvar_listContext defvar_list() throws RecognitionException {
		Defvar_listContext _localctx = new Defvar_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_defvar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
				{
				{
				setState(371);
				defvars();
				}
				}
				setState(376);
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
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__48);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
				{
				{
				setState(378);
				slot();
				setState(379);
				match(T__2);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(T__49);
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
	}

	public final SlotContext slot() throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			type();
			setState(389);
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
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << CHARACTER))) != 0)) {
				{
				setState(391);
				expr();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(392);
					match(T__6);
					setState(393);
					expr();
					}
					}
					setState(398);
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
		case 22:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\7\3O\n\3\f\3\16\3R\13\3"+
		"\3\4\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7"+
		"\5d\n\5\f\5\16\5g\13\5\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\7\7|\n\7\f\7\16\7\177\13\7\5\7\u0081\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\7"+
		"\13\u0093\n\13\f\13\16\13\u0096\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\21\3\21"+
		"\3\21\5\21\u00d6\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e8\n\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0103\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012c\n\30\f\30\16\30\u012f\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0139\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0149\n\31"+
		"\f\31\16\31\u014c\13\31\3\32\5\32\u014f\n\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0159\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u0162\n\37\f\37\16\37\u0165\13\37\3\37\3\37\3\37\5\37\u016a\n\37\5\37"+
		"\u016c\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\7\"\u0177\n\"\f\"\16\"\u017a\13"+
		"\"\3#\3#\3#\3#\7#\u0180\n#\f#\16#\u0183\13#\3#\3#\3$\3$\3$\3%\3%\3%\7"+
		"%\u018d\n%\f%\16%\u0190\13%\5%\u0192\n%\3%\2\4.\60&\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\3\2/\61\2\u01ac"+
		"\2J\3\2\2\2\4P\3\2\2\2\6S\3\2\2\2\be\3\2\2\2\nh\3\2\2\2\fq\3\2\2\2\16"+
		"\u0084\3\2\2\2\20\u0088\3\2\2\2\22\u008c\3\2\2\2\24\u0094\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00ac\3\2\2\2\34\u00b5\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00c4\3\2\2\2\"\u00d7\3\2\2\2$\u00da\3\2\2\2&\u00dd\3\2\2\2(\u00e7"+
		"\3\2\2\2*\u00e9\3\2\2\2,\u0102\3\2\2\2.\u0104\3\2\2\2\60\u0138\3\2\2\2"+
		"\62\u014e\3\2\2\2\64\u0150\3\2\2\2\66\u0158\3\2\2\28\u015a\3\2\2\2:\u015c"+
		"\3\2\2\2<\u016b\3\2\2\2>\u016d\3\2\2\2@\u0170\3\2\2\2B\u0178\3\2\2\2D"+
		"\u017b\3\2\2\2F\u0186\3\2\2\2H\u0191\3\2\2\2JK\5\4\3\2KL\5\b\5\2L\3\3"+
		"\2\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RP"+
		"\3\2\2\2ST\7\3\2\2TY\5:\36\2UV\7\4\2\2VX\5:\36\2WU\3\2\2\2X[\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\5\2\2]\7\3\2\2\2^d\5\n\6"+
		"\2_d\5\f\7\2`d\5\16\b\2ad\5\20\t\2bd\5\22\n\2c^\3\2\2\2c_\3\2\2\2c`\3"+
		"\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge"+
		"\3\2\2\2hi\5\64\33\2ij\5:\36\2jl\7\6\2\2km\5<\37\2lk\3\2\2\2lm\3\2\2\2"+
		"mn\3\2\2\2no\7\7\2\2op\5@!\2p\13\3\2\2\2qr\5\64\33\2r\u0080\5:\36\2st"+
		"\7\b\2\2t}\5,\27\2uv\7\t\2\2vy\5:\36\2wx\7\b\2\2xz\5,\27\2yw\3\2\2\2y"+
		"z\3\2\2\2z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\u0080s\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\7\5\2\2\u0083\r\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086"+
		"\5:\36\2\u0086\u0087\5D#\2\u0087\17\3\2\2\2\u0088\u0089\7\13\2\2\u0089"+
		"\u008a\5:\36\2\u008a\u008b\5D#\2\u008b\21\3\2\2\2\u008c\u008d\7\f\2\2"+
		"\u008d\u008e\5\64\33\2\u008e\u008f\7\65\2\2\u008f\u0090\7\5\2\2\u0090"+
		"\23\3\2\2\2\u0091\u0093\5\26\f\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\25\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u00a7\7\5\2\2\u0098\u00a7\5\30\r\2\u0099\u009a\5,\27\2"+
		"\u009a\u009b\7\5\2\2\u009b\u00a7\3\2\2\2\u009c\u00a7\5@!\2\u009d\u00a7"+
		"\5\32\16\2\u009e\u00a7\5\34\17\2\u009f\u00a7\5\36\20\2\u00a0\u00a7\5 "+
		"\21\2\u00a1\u00a7\5\"\22\2\u00a2\u00a7\5$\23\2\u00a3\u00a7\5&\24\2\u00a4"+
		"\u00a7\5(\25\2\u00a5\u00a7\5*\26\2\u00a6\u0097\3\2\2\2\u00a6\u0098\3\2"+
		"\2\2\u00a6\u0099\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6"+
		"\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2"+
		"\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\65\2\2\u00a9\u00aa\7\r\2"+
		"\2\u00aa\u00ab\5\26\f\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae"+
		"\7\6\2\2\u00ae\u00af\5,\27\2\u00af\u00b0\7\7\2\2\u00b0\u00b3\5\26\f\2"+
		"\u00b1\u00b2\7\17\2\2\u00b2\u00b4\5\26\f\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\7\6\2\2\u00b7"+
		"\u00b8\5,\27\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5\26\f\2\u00ba\35\3\2\2"+
		"\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\5\f\7\2\u00be"+
		"\u00bf\5,\27\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\7"+
		"\2\2\u00c2\u00c3\5\26\f\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5"+
		"\u00c6\7\6\2\2\u00c6\u00c7\5,\27\2\u00c7\u00cf\7\7\2\2\u00c8\u00c9\7\23"+
		"\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\5\26\f\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\24\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d6\5\26\f\2\u00d5\u00d2\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6!\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9"+
		"\7\5\2\2\u00d9#\3\2\2\2\u00da\u00db\7\26\2\2\u00db\u00dc\7\5\2\2\u00dc"+
		"%\3\2\2\2\u00dd\u00de\7\27\2\2\u00de\u00df\7\65\2\2\u00df\u00e0\7\5\2"+
		"\2\u00e0\'\3\2\2\2\u00e1\u00e2\7\30\2\2\u00e2\u00e8\7\5\2\2\u00e3\u00e4"+
		"\7\30\2\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\7\5\2\2\u00e6\u00e8\3\2\2\2"+
		"\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8)\3\2\2\2\u00e9\u00ea\7"+
		"\31\2\2\u00ea\u00eb\5,\27\2\u00eb\u00ec\7\5\2\2\u00ec+\3\2\2\2\u00ed\u00ee"+
		"\5\60\31\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\5,\27\2\u00f0\u0103\3\2\2\2"+
		"\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\32\2\2\u00f3\u00f4\5,\27\2\u00f4"+
		"\u0103\3\2\2\2\u00f5\u00f6\5\60\31\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8"+
		"\5,\27\2\u00f8\u0103\3\2\2\2\u00f9\u00fa\5\60\31\2\u00fa\u00fb\7\34\2"+
		"\2\u00fb\u00fc\5,\27\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\5\60\31\2\u00fe"+
		"\u00ff\7\35\2\2\u00ff\u0100\5,\27\2\u0100\u0103\3\2\2\2\u0101\u0103\5"+
		".\30\2\u0102\u00ed\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00f5\3\2\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103-\3\2\2\2"+
		"\u0104\u0105\b\30\1\2\u0105\u0106\5\60\31\2\u0106\u012d\3\2\2\2\u0107"+
		"\u0108\f\17\2\2\u0108\u0109\7\36\2\2\u0109\u012c\5.\30\20\u010a\u010b"+
		"\f\16\2\2\u010b\u010c\7\37\2\2\u010c\u012c\5.\30\17\u010d\u010e\f\r\2"+
		"\2\u010e\u010f\7 \2\2\u010f\u012c\5.\30\16\u0110\u0111\f\f\2\2\u0111\u0112"+
		"\7!\2\2\u0112\u012c\5.\30\r\u0113\u0114\f\13\2\2\u0114\u0115\7\"\2\2\u0115"+
		"\u012c\5.\30\f\u0116\u0117\f\n\2\2\u0117\u0118\7#\2\2\u0118\u012c\5.\30"+
		"\13\u0119\u011a\f\t\2\2\u011a\u011b\7$\2\2\u011b\u012c\5.\30\n\u011c\u011d"+
		"\f\b\2\2\u011d\u011e\7%\2\2\u011e\u012c\5.\30\t\u011f\u0120\f\7\2\2\u0120"+
		"\u0121\7&\2\2\u0121\u012c\5.\30\b\u0122\u0123\f\6\2\2\u0123\u0124\7\'"+
		"\2\2\u0124\u012c\5.\30\7\u0125\u0126\f\5\2\2\u0126\u0127\7(\2\2\u0127"+
		"\u012c\5.\30\6\u0128\u0129\f\4\2\2\u0129\u012a\7)\2\2\u012a\u012c\5.\30"+
		"\5\u012b\u0107\3\2\2\2\u012b\u010a\3\2\2\2\u012b\u010d\3\2\2\2\u012b\u0110"+
		"\3\2\2\2\u012b\u0113\3\2\2\2\u012b\u0116\3\2\2\2\u012b\u0119\3\2\2\2\u012b"+
		"\u011c\3\2\2\2\u012b\u011f\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0125\3\2"+
		"\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e/\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\b\31\1\2"+
		"\u0131\u0139\7\66\2\2\u0132\u0139\7\67\2\2\u0133\u0139\7\65\2\2\u0134"+
		"\u0135\7\6\2\2\u0135\u0136\5,\27\2\u0136\u0137\7\7\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0130\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0139\u014a\3\2\2\2\u013a\u013b\f\6\2\2\u013b\u0149\7*"+
		"\2\2\u013c\u013d\f\5\2\2\u013d\u0149\7+\2\2\u013e\u013f\f\4\2\2\u013f"+
		"\u0140\7,\2\2\u0140\u0141\5,\27\2\u0141\u0142\7-\2\2\u0142\u0149\3\2\2"+
		"\2\u0143\u0144\f\3\2\2\u0144\u0145\7\6\2\2\u0145\u0146\5H%\2\u0146\u0147"+
		"\7\7\2\2\u0147\u0149\3\2\2\2\u0148\u013a\3\2\2\2\u0148\u013c\3\2\2\2\u0148"+
		"\u013e\3\2\2\2\u0148\u0143\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\61\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f"+
		"\7.\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\63\3\2\2\2\u0150"+
		"\u0151\5\66\34\2\u0151\65\3\2\2\2\u0152\u0153\58\35\2\u0153\u0154\7,\2"+
		"\2\u0154\u0155\7\66\2\2\u0155\u0156\7-\2\2\u0156\u0159\3\2\2\2\u0157\u0159"+
		"\58\35\2\u0158\u0152\3\2\2\2\u0158\u0157\3\2\2\2\u0159\67\3\2\2\2\u015a"+
		"\u015b\t\2\2\2\u015b9\3\2\2\2\u015c\u015d\7\65\2\2\u015d;\3\2\2\2\u015e"+
		"\u0163\5> \2\u015f\u0160\7\t\2\2\u0160\u0162\5> \2\u0161\u015f\3\2\2\2"+
		"\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u016c"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\5> \2\u0167\u0168\7\t\2\2\u0168"+
		"\u016a\7\62\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3"+
		"\2\2\2\u016b\u015e\3\2\2\2\u016b\u0166\3\2\2\2\u016c=\3\2\2\2\u016d\u016e"+
		"\5\64\33\2\u016e\u016f\5:\36\2\u016f?\3\2\2\2\u0170\u0171\7\63\2\2\u0171"+
		"\u0172\5B\"\2\u0172\u0173\5\24\13\2\u0173\u0174\7\64\2\2\u0174A\3\2\2"+
		"\2\u0175\u0177\5\f\7\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179C\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u0181\7\63\2\2\u017c\u017d\5F$\2\u017d\u017e\7\5\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\64"+
		"\2\2\u0185E\3\2\2\2\u0186\u0187\5\64\33\2\u0187\u0188\5:\36\2\u0188G\3"+
		"\2\2\2\u0189\u018e\5,\27\2\u018a\u018b\7\t\2\2\u018b\u018d\5,\27\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0189\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192I\3\2\2\2\37PYcely}\u0080\u0094\u00a6\u00b3\u00cf"+
		"\u00d5\u00e7\u0102\u012b\u012d\u0138\u0148\u014a\u014e\u0158\u0163\u0169"+
		"\u016b\u0178\u0181\u018e\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}