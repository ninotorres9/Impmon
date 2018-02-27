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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, IDENTIFIER=52, 
		INTEGER=53, CHARACTER=54, STRING=55, BASETYPE=56, SKIP_TOKEN=57, LINE_COMMENT=58, 
		BLOCK_COMMENT=59;
	public static final int
		RULE_compilation_unit = 0, RULE_import_stmts = 1, RULE_import_stmt = 2, 
		RULE_tof_defs = 3, RULE_defunc = 4, RULE_defvars = 5, RULE_defconst = 6, 
		RULE_defstruct = 7, RULE_defunion = 8, RULE_typedef = 9, RULE_stmts = 10, 
		RULE_stmt = 11, RULE_labeled_stmt = 12, RULE_if_stmt = 13, RULE_while_stmt = 14, 
		RULE_for_stmt = 15, RULE_switch_stmt = 16, RULE_break_stmt = 17, RULE_continue_stmt = 18, 
		RULE_goto_stmt = 19, RULE_return_stmt = 20, RULE_print_stmt = 21, RULE_expr = 22, 
		RULE_factor = 23, RULE_term = 24, RULE_storage = 25, RULE_type = 26, RULE_typeref = 27, 
		RULE_typeref_base = 28, RULE_name = 29, RULE_params = 30, RULE_param = 31, 
		RULE_block = 32, RULE_defvar_list = 33, RULE_member_list = 34, RULE_slot = 35, 
		RULE_args = 36;
	public static final String[] ruleNames = {
		"compilation_unit", "import_stmts", "import_stmt", "tof_defs", "defunc", 
		"defvars", "defconst", "defstruct", "defunion", "typedef", "stmts", "stmt", 
		"labeled_stmt", "if_stmt", "while_stmt", "for_stmt", "switch_stmt", "break_stmt", 
		"continue_stmt", "goto_stmt", "return_stmt", "print_stmt", "expr", "factor", 
		"term", "storage", "type", "typeref", "typeref_base", "name", "params", 
		"param", "block", "defvar_list", "member_list", "slot", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "';'", "'('", "')'", "'='", "','", "'const'", 
		"'struct'", "'union'", "'typedef'", "':'", "'if'", "'else'", "'while'", 
		"'for'", "'switch'", "'case'", "'default'", "'break'", "'continue'", "'goto'", 
		"'return'", "'print'", "'+='", "'-='", "'*='", "'/='", "'*'", "'/'", "'+'", 
		"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'['", "']'", "'static'", "'void'", "'char'", "'int'", "'...'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IDENTIFIER", "INTEGER", "CHARACTER", "STRING", 
		"BASETYPE", "SKIP_TOKEN", "LINE_COMMENT", "BLOCK_COMMENT"
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
			setState(74);
			import_stmts();
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77);
				import_stmt();
				}
				}
				setState(82);
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
			setState(83);
			match(T__0);
			setState(84);
			name();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(85);
				match(T__1);
				setState(86);
				name();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		public List<DefconstContext> defconst() {
			return getRuleContexts(DefconstContext.class);
		}
		public DefconstContext defconst(int i) {
			return getRuleContext(DefconstContext.class,i);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(94);
					defunc();
					}
					break;
				case 2:
					{
					setState(95);
					defvars();
					}
					break;
				case 3:
					{
					setState(96);
					defconst();
					}
					break;
				case 4:
					{
					setState(97);
					defstruct();
					}
					break;
				case 5:
					{
					setState(98);
					defunion();
					}
					break;
				case 6:
					{
					setState(99);
					typedef();
					}
					break;
				}
				}
				setState(104);
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
			setState(105);
			type();
			setState(106);
			name();
			setState(107);
			match(T__3);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) {
				{
				setState(108);
				params();
				}
			}

			setState(111);
			match(T__4);
			setState(112);
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
			setState(114);
			type();
			setState(115);
			name();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(116);
				match(T__5);
				setState(117);
				expr();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(118);
					match(T__6);
					setState(119);
					name();
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(120);
						match(T__5);
						setState(121);
						expr();
						}
					}

					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
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

	public static class DefconstContext extends ParserRuleContext {
		public DefvarsContext defvars() {
			return getRuleContext(DefvarsContext.class,0);
		}
		public DefconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defconst; }
	}

	public final DefconstContext defconst() throws RecognitionException {
		DefconstContext _localctx = new DefconstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__7);
			setState(134);
			defvars();
			setState(135);
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
		enterRule(_localctx, 14, RULE_defstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__8);
			setState(138);
			name();
			setState(139);
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
		enterRule(_localctx, 16, RULE_defunion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__9);
			setState(142);
			name();
			setState(143);
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
		enterRule(_localctx, 18, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__10);
			setState(146);
			type();
			setState(147);
			match(IDENTIFIER);
			setState(148);
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
		enterRule(_localctx, 20, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__49) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(150);
				stmt();
				}
				}
				setState(155);
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
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PassStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LabeledStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				labeled_stmt();
				}
				break;
			case 3:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				expr();
				setState(159);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				block();
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				if_stmt();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				while_stmt();
				}
				break;
			case 7:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				for_stmt();
				}
				break;
			case 8:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				switch_stmt();
				}
				break;
			case 9:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				break_stmt();
				}
				break;
			case 10:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				continue_stmt();
				}
				break;
			case 11:
				_localctx = new GotoStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				goto_stmt();
				}
				break;
			case 12:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(169);
				return_stmt();
				}
				break;
			case 13:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
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
		enterRule(_localctx, 24, RULE_labeled_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(T__11);
			setState(175);
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
		enterRule(_localctx, 26, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__12);
			setState(178);
			match(T__3);
			setState(179);
			expr();
			setState(180);
			match(T__4);
			setState(181);
			stmt();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(182);
				match(T__13);
				setState(183);
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
		enterRule(_localctx, 28, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__14);
			setState(187);
			match(T__3);
			setState(188);
			expr();
			setState(189);
			match(T__4);
			setState(190);
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
		enterRule(_localctx, 30, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__15);
			setState(193);
			match(T__3);
			setState(194);
			expr();
			setState(195);
			match(T__2);
			setState(196);
			expr();
			setState(197);
			match(T__2);
			setState(198);
			expr();
			setState(199);
			match(T__4);
			setState(200);
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
		enterRule(_localctx, 32, RULE_switch_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__16);
			setState(203);
			match(T__3);
			setState(204);
			expr();
			setState(205);
			match(T__4);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(T__17);
					setState(207);
					expr();
					setState(208);
					match(T__11);
					setState(209);
					stmt();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(216);
				match(T__18);
				setState(217);
				match(T__11);
				setState(218);
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
		enterRule(_localctx, 34, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__19);
			setState(222);
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
		enterRule(_localctx, 36, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__20);
			setState(225);
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
		enterRule(_localctx, 38, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__21);
			setState(228);
			match(IDENTIFIER);
			setState(229);
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
		enterRule(_localctx, 40, RULE_return_stmt);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__22);
				setState(232);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(T__22);
				setState(234);
				expr();
				setState(235);
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
		enterRule(_localctx, 42, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__23);
			setState(240);
			expr();
			setState(241);
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
		enterRule(_localctx, 44, RULE_expr);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				term(0);
				setState(244);
				match(T__5);
				setState(245);
				expr();
				}
				break;
			case 2:
				_localctx = new AddAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				term(0);
				setState(248);
				match(T__24);
				setState(249);
				expr();
				}
				break;
			case 3:
				_localctx = new SubAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				term(0);
				setState(252);
				match(T__25);
				setState(253);
				expr();
				}
				break;
			case 4:
				_localctx = new MulAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				term(0);
				setState(256);
				match(T__26);
				setState(257);
				expr();
				}
				break;
			case 5:
				_localctx = new DivAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				term(0);
				setState(260);
				match(T__27);
				setState(261);
				expr();
				}
				break;
			case 6:
				_localctx = new ToFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(267);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(269);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(270);
						match(T__28);
						setState(271);
						factor(14);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(272);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(273);
						match(T__29);
						setState(274);
						factor(13);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(275);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(276);
						match(T__30);
						setState(277);
						factor(12);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(279);
						match(T__31);
						setState(280);
						factor(11);
						}
						break;
					case 5:
						{
						_localctx = new GtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						match(T__32);
						setState(283);
						factor(10);
						}
						break;
					case 6:
						{
						_localctx = new LtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(284);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(285);
						match(T__33);
						setState(286);
						factor(9);
						}
						break;
					case 7:
						{
						_localctx = new GoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(287);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(288);
						match(T__34);
						setState(289);
						factor(8);
						}
						break;
					case 8:
						{
						_localctx = new LoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(291);
						match(T__35);
						setState(292);
						factor(7);
						}
						break;
					case 9:
						{
						_localctx = new EqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(294);
						match(T__36);
						setState(295);
						factor(6);
						}
						break;
					case 10:
						{
						_localctx = new NeqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(297);
						match(T__37);
						setState(298);
						factor(5);
						}
						break;
					case 11:
						{
						_localctx = new AndContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(300);
						match(T__38);
						setState(301);
						factor(4);
						}
						break;
					case 12:
						{
						_localctx = new OrContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						match(T__39);
						setState(304);
						factor(3);
						}
						break;
					}
					} 
				}
				setState(309);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311);
				match(INTEGER);
				}
				break;
			case CHARACTER:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(CHARACTER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(IDENTIFIER);
				}
				break;
			case T__3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(T__3);
				setState(315);
				expr();
				setState(316);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new IncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(320);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(321);
						match(T__40);
						}
						break;
					case 2:
						{
						_localctx = new DecContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(323);
						match(T__41);
						}
						break;
					case 3:
						{
						_localctx = new CallArrayContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(T__42);
						setState(326);
						expr();
						setState(327);
						match(T__43);
						}
						break;
					case 4:
						{
						_localctx = new CallFuncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(329);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(330);
						match(T__3);
						setState(331);
						args();
						setState(332);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(338);
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
		enterRule(_localctx, 50, RULE_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(339);
				match(T__44);
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
		enterRule(_localctx, 52, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		public TerminalNode INTEGER() { return getToken(ImpmonParser.INTEGER, 0); }
		public TyperefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeref; }
	}

	public final TyperefContext typeref() throws RecognitionException {
		TyperefContext _localctx = new TyperefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeref);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				typeref_base();
				setState(345);
				match(T__42);
				setState(346);
				match(T__43);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				typeref_base();
				setState(349);
				match(T__42);
				setState(350);
				match(INTEGER);
				setState(351);
				match(T__43);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				typeref_base();
				setState(354);
				match(T__28);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
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
		enterRule(_localctx, 56, RULE_typeref_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 60, RULE_params);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				param();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(364);
					match(T__6);
					setState(365);
					param();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				param();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(372);
					match(T__6);
					setState(373);
					match(T__48);
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
		enterRule(_localctx, 62, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			type();
			setState(379);
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
		enterRule(_localctx, 64, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__49);
			setState(382);
			defvar_list();
			setState(383);
			stmts();
			setState(384);
			match(T__50);
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
		enterRule(_localctx, 66, RULE_defvar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) {
				{
				{
				setState(386);
				defvars();
				}
				}
				setState(391);
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
		enterRule(_localctx, 68, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__49);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) {
				{
				{
				setState(393);
				slot();
				setState(394);
				match(T__2);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(T__50);
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
		enterRule(_localctx, 70, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			type();
			setState(404);
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
		enterRule(_localctx, 72, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << CHARACTER))) != 0)) {
				{
				setState(406);
				expr();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(407);
					match(T__6);
					setState(408);
					expr();
					}
					}
					setState(413);
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
		case 23:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 24:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\7\3Q\n\3\f\3\16\3"+
		"T\13\3\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\7\7\177\n\7\f\7\16\7\u0082\13"+
		"\7\5\7\u0084\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bb\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d6\n\22"+
		"\f\22\16\22\u00d9\13\22\3\22\3\22\3\22\5\22\u00de\n\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00f0\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u010b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0134\n\31\f\31\16\31\u0137\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0141\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0151\n\32\f\32\16\32\u0154\13\32\3\33\5\33"+
		"\u0157\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0168\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u0171"+
		"\n \f \16 \u0174\13 \3 \3 \3 \5 \u0179\n \5 \u017b\n \3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3#\7#\u0186\n#\f#\16#\u0189\13#\3$\3$\3$\3$\7$\u018f\n$\f"+
		"$\16$\u0192\13$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u019c\n&\f&\16&\u019f\13&\5"+
		"&\u01a1\n&\3&\2\4\60\62\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJ\2\3\3\2\60\62\2\u01bd\2L\3\2\2\2\4R\3\2\2\2"+
		"\6U\3\2\2\2\bh\3\2\2\2\nk\3\2\2\2\ft\3\2\2\2\16\u0087\3\2\2\2\20\u008b"+
		"\3\2\2\2\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u009b\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00af\3\2\2\2\34\u00b3\3\2\2\2\36\u00bc\3\2\2\2 \u00c2\3\2\2"+
		"\2\"\u00cc\3\2\2\2$\u00df\3\2\2\2&\u00e2\3\2\2\2(\u00e5\3\2\2\2*\u00ef"+
		"\3\2\2\2,\u00f1\3\2\2\2.\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u0140\3\2\2"+
		"\2\64\u0156\3\2\2\2\66\u0158\3\2\2\28\u0167\3\2\2\2:\u0169\3\2\2\2<\u016b"+
		"\3\2\2\2>\u017a\3\2\2\2@\u017c\3\2\2\2B\u017f\3\2\2\2D\u0187\3\2\2\2F"+
		"\u018a\3\2\2\2H\u0195\3\2\2\2J\u01a0\3\2\2\2LM\5\4\3\2MN\5\b\5\2N\3\3"+
		"\2\2\2OQ\5\6\4\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TR"+
		"\3\2\2\2UV\7\3\2\2V[\5<\37\2WX\7\4\2\2XZ\5<\37\2YW\3\2\2\2Z]\3\2\2\2["+
		"Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_\7\3\2\2\2`g\5\n\6"+
		"\2ag\5\f\7\2bg\5\16\b\2cg\5\20\t\2dg\5\22\n\2eg\5\24\13\2f`\3\2\2\2fa"+
		"\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2i\t\3\2\2\2jh\3\2\2\2kl\5\66\34\2lm\5<\37\2mo\7\6\2\2np\5> \2"+
		"on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\7\2\2rs\5B\"\2s\13\3\2\2\2tu\5\66\34"+
		"\2u\u0083\5<\37\2vw\7\b\2\2w\u0080\5.\30\2xy\7\t\2\2y|\5<\37\2z{\7\b\2"+
		"\2{}\5.\30\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~x\3\2\2\2\177\u0082\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083v\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\5\2\2\u0086\r\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5\f\7\2"+
		"\u0089\u008a\7\5\2\2\u008a\17\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d"+
		"\5<\37\2\u008d\u008e\5F$\2\u008e\21\3\2\2\2\u008f\u0090\7\f\2\2\u0090"+
		"\u0091\5<\37\2\u0091\u0092\5F$\2\u0092\23\3\2\2\2\u0093\u0094\7\r\2\2"+
		"\u0094\u0095\5\66\34\2\u0095\u0096\7\66\2\2\u0096\u0097\7\5\2\2\u0097"+
		"\25\3\2\2\2\u0098\u009a\5\30\r\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00ae\7\5\2\2\u009f\u00ae\5\32\16\2\u00a0\u00a1\5.\30\2"+
		"\u00a1\u00a2\7\5\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00ae\5B\"\2\u00a4\u00ae"+
		"\5\34\17\2\u00a5\u00ae\5\36\20\2\u00a6\u00ae\5 \21\2\u00a7\u00ae\5\"\22"+
		"\2\u00a8\u00ae\5$\23\2\u00a9\u00ae\5&\24\2\u00aa\u00ae\5(\25\2\u00ab\u00ae"+
		"\5*\26\2\u00ac\u00ae\5,\27\2\u00ad\u009e\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad"+
		"\u00a0\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2"+
		"\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\66\2\2\u00b0\u00b1\7\16\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7\6"+
		"\2\2\u00b5\u00b6\5.\30\2\u00b6\u00b7\7\7\2\2\u00b7\u00ba\5\30\r\2\u00b8"+
		"\u00b9\7\20\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00be\7\6\2\2\u00be"+
		"\u00bf\5.\30\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5\30\r\2\u00c1\37\3\2\2"+
		"\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5.\30\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c7\5.\30\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5."+
		"\30\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\5\30\r\2\u00cb!\3\2\2\2\u00cc\u00cd"+
		"\7\23\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5.\30\2\u00cf\u00d7\7\7\2\2"+
		"\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5.\30\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4"+
		"\5\30\r\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\7\25\2\2\u00db\u00dc\7\16\2\2\u00dc\u00de\5\30\r"+
		"\2\u00dd\u00da\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2\u00df\u00e0"+
		"\7\26\2\2\u00e0\u00e1\7\5\2\2\u00e1%\3\2\2\2\u00e2\u00e3\7\27\2\2\u00e3"+
		"\u00e4\7\5\2\2\u00e4\'\3\2\2\2\u00e5\u00e6\7\30\2\2\u00e6\u00e7\7\66\2"+
		"\2\u00e7\u00e8\7\5\2\2\u00e8)\3\2\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00f0"+
		"\7\5\2\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7\5\2\2"+
		"\u00ee\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0+\3"+
		"\2\2\2\u00f1\u00f2\7\32\2\2\u00f2\u00f3\5.\30\2\u00f3\u00f4\7\5\2\2\u00f4"+
		"-\3\2\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\5.\30"+
		"\2\u00f8\u010b\3\2\2\2\u00f9\u00fa\5\62\32\2\u00fa\u00fb\7\33\2\2\u00fb"+
		"\u00fc\5.\30\2\u00fc\u010b\3\2\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff\7"+
		"\34\2\2\u00ff\u0100\5.\30\2\u0100\u010b\3\2\2\2\u0101\u0102\5\62\32\2"+
		"\u0102\u0103\7\35\2\2\u0103\u0104\5.\30\2\u0104\u010b\3\2\2\2\u0105\u0106"+
		"\5\62\32\2\u0106\u0107\7\36\2\2\u0107\u0108\5.\30\2\u0108\u010b\3\2\2"+
		"\2\u0109\u010b\5\60\31\2\u010a\u00f5\3\2\2\2\u010a\u00f9\3\2\2\2\u010a"+
		"\u00fd\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0109\3\2"+
		"\2\2\u010b/\3\2\2\2\u010c\u010d\b\31\1\2\u010d\u010e\5\62\32\2\u010e\u0135"+
		"\3\2\2\2\u010f\u0110\f\17\2\2\u0110\u0111\7\37\2\2\u0111\u0134\5\60\31"+
		"\20\u0112\u0113\f\16\2\2\u0113\u0114\7 \2\2\u0114\u0134\5\60\31\17\u0115"+
		"\u0116\f\r\2\2\u0116\u0117\7!\2\2\u0117\u0134\5\60\31\16\u0118\u0119\f"+
		"\f\2\2\u0119\u011a\7\"\2\2\u011a\u0134\5\60\31\r\u011b\u011c\f\13\2\2"+
		"\u011c\u011d\7#\2\2\u011d\u0134\5\60\31\f\u011e\u011f\f\n\2\2\u011f\u0120"+
		"\7$\2\2\u0120\u0134\5\60\31\13\u0121\u0122\f\t\2\2\u0122\u0123\7%\2\2"+
		"\u0123\u0134\5\60\31\n\u0124\u0125\f\b\2\2\u0125\u0126\7&\2\2\u0126\u0134"+
		"\5\60\31\t\u0127\u0128\f\7\2\2\u0128\u0129\7\'\2\2\u0129\u0134\5\60\31"+
		"\b\u012a\u012b\f\6\2\2\u012b\u012c\7(\2\2\u012c\u0134\5\60\31\7\u012d"+
		"\u012e\f\5\2\2\u012e\u012f\7)\2\2\u012f\u0134\5\60\31\6\u0130\u0131\f"+
		"\4\2\2\u0131\u0132\7*\2\2\u0132\u0134\5\60\31\5\u0133\u010f\3\2\2\2\u0133"+
		"\u0112\3\2\2\2\u0133\u0115\3\2\2\2\u0133\u0118\3\2\2\2\u0133\u011b\3\2"+
		"\2\2\u0133\u011e\3\2\2\2\u0133\u0121\3\2\2\2\u0133\u0124\3\2\2\2\u0133"+
		"\u0127\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0130\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\61\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\b\32\1\2\u0139\u0141\7\67"+
		"\2\2\u013a\u0141\78\2\2\u013b\u0141\7\66\2\2\u013c\u013d\7\6\2\2\u013d"+
		"\u013e\5.\30\2\u013e\u013f\7\7\2\2\u013f\u0141\3\2\2\2\u0140\u0138\3\2"+
		"\2\2\u0140\u013a\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0141"+
		"\u0152\3\2\2\2\u0142\u0143\f\6\2\2\u0143\u0151\7+\2\2\u0144\u0145\f\5"+
		"\2\2\u0145\u0151\7,\2\2\u0146\u0147\f\4\2\2\u0147\u0148\7-\2\2\u0148\u0149"+
		"\5.\30\2\u0149\u014a\7.\2\2\u014a\u0151\3\2\2\2\u014b\u014c\f\3\2\2\u014c"+
		"\u014d\7\6\2\2\u014d\u014e\5J&\2\u014e\u014f\7\7\2\2\u014f\u0151\3\2\2"+
		"\2\u0150\u0142\3\2\2\2\u0150\u0144\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u014b"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\63\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\7/\2\2\u0156\u0155\3\2\2\2"+
		"\u0156\u0157\3\2\2\2\u0157\65\3\2\2\2\u0158\u0159\58\35\2\u0159\67\3\2"+
		"\2\2\u015a\u015b\5:\36\2\u015b\u015c\7-\2\2\u015c\u015d\7.\2\2\u015d\u0168"+
		"\3\2\2\2\u015e\u015f\5:\36\2\u015f\u0160\7-\2\2\u0160\u0161\7\67\2\2\u0161"+
		"\u0162\7.\2\2\u0162\u0168\3\2\2\2\u0163\u0164\5:\36\2\u0164\u0165\7\37"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0168\5:\36\2\u0167\u015a\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0166\3\2\2\2\u01689\3\2\2\2"+
		"\u0169\u016a\t\2\2\2\u016a;\3\2\2\2\u016b\u016c\7\66\2\2\u016c=\3\2\2"+
		"\2\u016d\u0172\5@!\2\u016e\u016f\7\t\2\2\u016f\u0171\5@!\2\u0170\u016e"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u017b\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0178\5@!\2\u0176\u0177\7\t\2"+
		"\2\u0177\u0179\7\63\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u016d\3\2\2\2\u017a\u0175\3\2\2\2\u017b?\3\2\2\2"+
		"\u017c\u017d\5\66\34\2\u017d\u017e\5<\37\2\u017eA\3\2\2\2\u017f\u0180"+
		"\7\64\2\2\u0180\u0181\5D#\2\u0181\u0182\5\26\f\2\u0182\u0183\7\65\2\2"+
		"\u0183C\3\2\2\2\u0184\u0186\5\f\7\2\u0185\u0184\3\2\2\2\u0186\u0189\3"+
		"\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188E\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u0190\7\64\2\2\u018b\u018c\5H%\2\u018c\u018d\7\5\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\7\65\2\2\u0194G\3\2\2\2\u0195\u0196\5\66\34\2\u0196\u0197\5<\37"+
		"\2\u0197I\3\2\2\2\u0198\u019d\5.\30\2\u0199\u019a\7\t\2\2\u019a\u019c"+
		"\5.\30\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u0198\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1K\3\2\2\2\37R[fho|\u0080\u0083\u009b\u00ad"+
		"\u00ba\u00d7\u00dd\u00ef\u010a\u0133\u0135\u0140\u0150\u0152\u0156\u0167"+
		"\u0172\u0178\u017a\u0187\u0190\u019d\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}