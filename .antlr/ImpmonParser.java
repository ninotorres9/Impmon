// Generated from e:\code\Impmon\Impmon.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, IDENTIFIER=37, INTEGER=38, 
		STRING=39, SKIP_TOKEN=40, LINE_COMMENT=41, BLOCK_COMMENT=42;
	public static final int
		RULE_compilation_unit = 0, RULE_import_stmts = 1, RULE_import_stmt = 2, 
		RULE_tof_defs = 3, RULE_defunc = 4, RULE_stmts = 5, RULE_stmt = 6, RULE_if_stmt = 7, 
		RULE_while_stmt = 8, RULE_for_stmt = 9, RULE_return_stmt = 10, RULE_print_stmt = 11, 
		RULE_expr = 12, RULE_factor = 13, RULE_term = 14, RULE_name = 15, RULE_params = 16, 
		RULE_param = 17, RULE_block = 18, RULE_args = 19;
	public static final String[] ruleNames = {
		"compilation_unit", "import_stmts", "import_stmt", "tof_defs", "defunc", 
		"stmts", "stmt", "if_stmt", "while_stmt", "for_stmt", "return_stmt", "print_stmt", 
		"expr", "factor", "term", "name", "params", "param", "block", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "';'", "'def'", "'('", "')'", "'if'", "'else'", 
		"'while'", "'for'", "'return'", "'print'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'['", "']'", "','", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDENTIFIER", "INTEGER", "STRING", "SKIP_TOKEN", "LINE_COMMENT", 
		"BLOCK_COMMENT"
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
			setState(40);
			import_stmts();
			setState(41);
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
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(43);
				import_stmt();
				}
				}
				setState(48);
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
			setState(49);
			match(T__0);
			setState(50);
			name();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(51);
				match(T__1);
				setState(52);
				name();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				defunc();
				}
				}
				setState(65);
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
			setState(66);
			match(T__3);
			setState(67);
			name();
			setState(68);
			match(T__4);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(69);
				params();
				}
			}

			setState(72);
			match(T__5);
			setState(73);
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
		enterRule(_localctx, 10, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				{
				setState(75);
				stmt();
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
	public static class PrintStmtContext extends StmtContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class EmptyStmtContext extends StmtContext {
		public EmptyStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ToExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__2);
				}
				break;
			case T__4:
			case T__31:
			case IDENTIFIER:
			case INTEGER:
			case STRING:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				expr();
				setState(83);
				match(T__2);
				}
				break;
			case T__34:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				block();
				}
				break;
			case T__6:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				if_stmt();
				}
				break;
			case T__8:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				while_stmt();
				}
				break;
			case T__9:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				for_stmt();
				}
				break;
			case T__10:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				return_stmt();
				}
				break;
			case T__11:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				print_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 14, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__6);
			setState(94);
			match(T__4);
			setState(95);
			expr();
			setState(96);
			match(T__5);
			setState(97);
			stmt();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(98);
				match(T__7);
				setState(99);
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
		enterRule(_localctx, 16, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
			setState(103);
			match(T__4);
			setState(104);
			expr();
			setState(105);
			match(T__5);
			setState(106);
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
		enterRule(_localctx, 18, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__9);
			setState(109);
			match(T__4);
			setState(110);
			expr();
			setState(111);
			match(T__2);
			setState(112);
			expr();
			setState(113);
			match(T__2);
			setState(114);
			expr();
			setState(115);
			match(T__5);
			setState(116);
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
		enterRule(_localctx, 20, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__10);
			setState(119);
			expr();
			setState(120);
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
		enterRule(_localctx, 22, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			setState(123);
			expr();
			setState(124);
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
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				term(0);
				setState(127);
				match(T__12);
				setState(128);
				expr();
				}
				break;
			case 2:
				_localctx = new AddAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				term(0);
				setState(131);
				match(T__13);
				setState(132);
				expr();
				}
				break;
			case 3:
				_localctx = new SubAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				term(0);
				setState(135);
				match(T__14);
				setState(136);
				expr();
				}
				break;
			case 4:
				_localctx = new MulAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				term(0);
				setState(139);
				match(T__15);
				setState(140);
				expr();
				}
				break;
			case 5:
				_localctx = new DivAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				term(0);
				setState(143);
				match(T__16);
				setState(144);
				expr();
				}
				break;
			case 6:
				_localctx = new ToFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(150);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(152);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(153);
						match(T__17);
						setState(154);
						factor(14);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(155);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(156);
						match(T__18);
						setState(157);
						factor(13);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(158);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(159);
						match(T__19);
						setState(160);
						factor(12);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(161);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(162);
						match(T__20);
						setState(163);
						factor(11);
						}
						break;
					case 5:
						{
						_localctx = new GtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(164);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(165);
						match(T__21);
						setState(166);
						factor(10);
						}
						break;
					case 6:
						{
						_localctx = new LtnContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(168);
						match(T__22);
						setState(169);
						factor(9);
						}
						break;
					case 7:
						{
						_localctx = new GoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(171);
						match(T__23);
						setState(172);
						factor(8);
						}
						break;
					case 8:
						{
						_localctx = new LoeContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(173);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(174);
						match(T__24);
						setState(175);
						factor(7);
						}
						break;
					case 9:
						{
						_localctx = new EqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						match(T__25);
						setState(178);
						factor(6);
						}
						break;
					case 10:
						{
						_localctx = new NeqContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						match(T__26);
						setState(181);
						factor(5);
						}
						break;
					case 11:
						{
						_localctx = new AndContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(T__27);
						setState(184);
						factor(4);
						}
						break;
					case 12:
						{
						_localctx = new OrContext(new FactorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(T__28);
						setState(187);
						factor(3);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class ArrayContext extends TermContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArrayContext(TermContext ctx) { copyFrom(ctx); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(STRING);
				}
				break;
			case T__4:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__4);
				setState(198);
				expr();
				setState(199);
				match(T__5);
				}
				break;
			case T__31:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(T__31);
				setState(202);
				args();
				setState(203);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new IncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						match(T__29);
						}
						break;
					case 2:
						{
						_localctx = new DecContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(T__30);
						}
						break;
					case 3:
						{
						_localctx = new CallArrayContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(211);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(212);
						match(T__31);
						setState(213);
						expr();
						setState(214);
						match(T__32);
						}
						break;
					case 4:
						{
						_localctx = new CallFuncContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(216);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(217);
						match(T__4);
						setState(218);
						args();
						setState(219);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImpmonParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			param();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(229);
				match(T__33);
				setState(230);
				param();
				}
				}
				setState(235);
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

	public static class ParamContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 36, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__34);
			setState(239);
			stmts();
			setState(240);
			match(T__35);
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
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__31) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(242);
				expr();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(243);
					match(T__33);
					setState(244);
					expr();
					}
					}
					setState(249);
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
		case 13:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 14:
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
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\7\5@\n\5\f\5\16"+
		"\5C\13\5\3\6\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\7\7\7O\n\7\f\7\16\7R\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00e0\n\20\f\20\16\20\u00e3\13\20\3\21\3\21\3\22\3\22\3\22\7\22\u00ea"+
		"\n\22\f\22\16\22\u00ed\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\7\25\u00f8\n\25\f\25\16\25\u00fb\13\25\5\25\u00fd\n\25\3\25\2\4\34"+
		"\36\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0113\2*\3\2"+
		"\2\2\4\60\3\2\2\2\6\63\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fP\3\2\2\2\16]\3"+
		"\2\2\2\20_\3\2\2\2\22h\3\2\2\2\24n\3\2\2\2\26x\3\2\2\2\30|\3\2\2\2\32"+
		"\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u00cf\3\2\2\2 \u00e4\3\2\2\2\"\u00e6"+
		"\3\2\2\2$\u00ee\3\2\2\2&\u00f0\3\2\2\2(\u00fc\3\2\2\2*+\5\4\3\2+,\5\b"+
		"\5\2,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\7\3\2\2\649\5 \21\2\65\66\7\4\2"+
		"\2\668\5 \21\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2"+
		";9\3\2\2\2<=\7\5\2\2=\7\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2B\t\3\2\2\2CA\3\2\2\2DE\7\6\2\2EF\5 \21\2FH\7\7\2\2GI\5\""+
		"\22\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\b\2\2KL\5&\24\2L\13\3\2\2\2MO"+
		"\5\16\b\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2"+
		"S^\7\5\2\2TU\5\32\16\2UV\7\5\2\2V^\3\2\2\2W^\5&\24\2X^\5\20\t\2Y^\5\22"+
		"\n\2Z^\5\24\13\2[^\5\26\f\2\\^\5\30\r\2]S\3\2\2\2]T\3\2\2\2]W\3\2\2\2"+
		"]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\17\3\2\2\2_`\7\t"+
		"\2\2`a\7\7\2\2ab\5\32\16\2bc\7\b\2\2cf\5\16\b\2de\7\n\2\2eg\5\16\b\2f"+
		"d\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hi\7\13\2\2ij\7\7\2\2jk\5\32\16\2kl\7\b"+
		"\2\2lm\5\16\b\2m\23\3\2\2\2no\7\f\2\2op\7\7\2\2pq\5\32\16\2qr\7\5\2\2"+
		"rs\5\32\16\2st\7\5\2\2tu\5\32\16\2uv\7\b\2\2vw\5\16\b\2w\25\3\2\2\2xy"+
		"\7\r\2\2yz\5\32\16\2z{\7\5\2\2{\27\3\2\2\2|}\7\16\2\2}~\5\32\16\2~\177"+
		"\7\5\2\2\177\31\3\2\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0083\5\32\16\2\u0083\u0096\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086"+
		"\7\20\2\2\u0086\u0087\5\32\16\2\u0087\u0096\3\2\2\2\u0088\u0089\5\36\20"+
		"\2\u0089\u008a\7\21\2\2\u008a\u008b\5\32\16\2\u008b\u0096\3\2\2\2\u008c"+
		"\u008d\5\36\20\2\u008d\u008e\7\22\2\2\u008e\u008f\5\32\16\2\u008f\u0096"+
		"\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7\23\2\2\u0092\u0093\5\32\16"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0096\5\34\17\2\u0095\u0080\3\2\2\2\u0095"+
		"\u0084\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\33\3\2\2\2\u0097\u0098\b\17\1\2\u0098\u0099"+
		"\5\36\20\2\u0099\u00c0\3\2\2\2\u009a\u009b\f\17\2\2\u009b\u009c\7\24\2"+
		"\2\u009c\u00bf\5\34\17\20\u009d\u009e\f\16\2\2\u009e\u009f\7\25\2\2\u009f"+
		"\u00bf\5\34\17\17\u00a0\u00a1\f\r\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00bf"+
		"\5\34\17\16\u00a3\u00a4\f\f\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00bf\5\34"+
		"\17\r\u00a6\u00a7\f\13\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00bf\5\34\17\f"+
		"\u00a9\u00aa\f\n\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00bf\5\34\17\13\u00ac"+
		"\u00ad\f\t\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00bf\5\34\17\n\u00af\u00b0"+
		"\f\b\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00bf\5\34\17\t\u00b2\u00b3\f\7\2"+
		"\2\u00b3\u00b4\7\34\2\2\u00b4\u00bf\5\34\17\b\u00b5\u00b6\f\6\2\2\u00b6"+
		"\u00b7\7\35\2\2\u00b7\u00bf\5\34\17\7\u00b8\u00b9\f\5\2\2\u00b9\u00ba"+
		"\7\36\2\2\u00ba\u00bf\5\34\17\6\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7\37\2"+
		"\2\u00bd\u00bf\5\34\17\5\u00be\u009a\3\2\2\2\u00be\u009d\3\2\2\2\u00be"+
		"\u00a0\3\2\2\2\u00be\u00a3\3\2\2\2\u00be\u00a6\3\2\2\2\u00be\u00a9\3\2"+
		"\2\2\u00be\u00ac\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b2\3\2\2\2\u00be"+
		"\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\35\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\b\20\1\2\u00c4\u00d0\7(\2\2\u00c5\u00d0\7\'\2\2\u00c6"+
		"\u00d0\7)\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca\7"+
		"\b\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\5(\25\2\u00cd"+
		"\u00ce\7#\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c5\3\2"+
		"\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0"+
		"\u00e1\3\2\2\2\u00d1\u00d2\f\7\2\2\u00d2\u00e0\7 \2\2\u00d3\u00d4\f\6"+
		"\2\2\u00d4\u00e0\7!\2\2\u00d5\u00d6\f\5\2\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\u00d8\5\32\16\2\u00d8\u00d9\7#\2\2\u00d9\u00e0\3\2\2\2\u00da\u00db\f"+
		"\4\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5(\25\2\u00dd\u00de\7\b\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00d5\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\'\2"+
		"\2\u00e5!\3\2\2\2\u00e6\u00eb\5$\23\2\u00e7\u00e8\7$\2\2\u00e8\u00ea\5"+
		"$\23\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5 \21\2"+
		"\u00ef%\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1\u00f2\5\f\7\2\u00f2\u00f3\7&"+
		"\2\2\u00f3\'\3\2\2\2\u00f4\u00f9\5\32\16\2\u00f5\u00f6\7$\2\2\u00f6\u00f8"+
		"\5\32\16\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd)\3\2\2\2\22\609AHP]f\u0095\u00be\u00c0"+
		"\u00cf\u00df\u00e1\u00eb\u00f9\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}