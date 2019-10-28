// Generated from /Users/lorenzoavancena/IdeaProjects/Scannertry/g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR_LITERAL=1, STRING_LITERAL=2, INT_LITERAL=3, FLOAT_LITERAL=4, IF=5, 
		ELSE=6, ELSEIF=7, FOR=8, WHILE=9, DO=10, INTEGER=11, FLOATING_POINT=12, 
		CHARACTER=13, STRING=14, BOOLEAN=15, VOID=16, FUNCTION=17, CALL=18, PRINT=19, 
		SCAN=20, MAIN=21, RETURN=22, TRUE=23, FALSE=24, PUBLIC=25, PRIVATE=26, 
		STATIC=27, INSTANTIATED=28, PROTECTED=29, GLOBAL=30, IDENTIFIER=31, LBRACKET=32, 
		RBRACKET=33, LPARENTHESIS=34, RPARENTHESIS=35, LBRACE=36, RBRACE=37, COMMA=38, 
		SEMICOLON=39, DOT=40, QUOTE_S=41, QUOTE_D=42, PLUS_PLUS=43, MINUS_MINUS=44, 
		PLUS=45, MINUS=46, MUL=47, DIV=48, MOD=49, EQUALS=50, PLUS_EQUALS=51, 
		MIN_EQUALS=52, MUL_EQUALS=53, DIV_EQUALS=54, LESS_THAN=55, LESS_THAN_EQUALS=56, 
		GREATER_THAN=57, GREATER_THAN_EQUALS=58, EQUALS_EQUALS=59, NOT_EQUALS=60, 
		AND=61, OR=62, NOT=63, DIGIT=64, LETTER=65, WS=66;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_main = 2, RULE_function = 3, RULE_call = 4, 
		RULE_returnstatement = 5, RULE_globaldelcaration = 6, RULE_declaration = 7, 
		RULE_singledeclaration = 8, RULE_arraydeclaration = 9, RULE_booleandeclaration = 10, 
		RULE_intdeclaration = 11, RULE_intarrdeclaration = 12, RULE_floatdeclaration = 13, 
		RULE_floatarrdeclaration = 14, RULE_chardeclaration = 15, RULE_chararrdeclaration = 16, 
		RULE_assignment = 17, RULE_condition = 18, RULE_loop = 19, RULE_loopfor = 20, 
		RULE_loopwhile = 21, RULE_loopdowhile = 22, RULE_operation = 23, RULE_opr = 24, 
		RULE_addopr = 25, RULE_multopr = 26, RULE_terminalopr = 27, RULE_shortopr = 28, 
		RULE_print = 29, RULE_scan = 30, RULE_booleanexp = 31, RULE_booleanvalue = 32, 
		RULE_relation = 33, RULE_logic = 34, RULE_vararrname = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "main", "function", "call", "returnstatement", "globaldelcaration", 
			"declaration", "singledeclaration", "arraydeclaration", "booleandeclaration", 
			"intdeclaration", "intarrdeclaration", "floatdeclaration", "floatarrdeclaration", 
			"chardeclaration", "chararrdeclaration", "assignment", "condition", "loop", 
			"loopfor", "loopwhile", "loopdowhile", "operation", "opr", "addopr", 
			"multopr", "terminalopr", "shortopr", "print", "scan", "booleanexp", 
			"booleanvalue", "relation", "logic", "vararrname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'si'", "'autre'", "'autre si'", "'pour'", 
			"'tandis que'", "'faire'", "'nombre '", "'decimale '", "'lettre '", "'mot '", 
			"'booleen '", "'vide '", "'fonction '", "'appel '", "'imprimer'", "'analyse'", 
			"'essentiel'", "'rappel '", "'vrai'", "'faux'", "'publique '", "'privee '", 
			"'statique '", "'instancie '", "'protege '", "'global '", null, "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "','", "';'", "'.'", "'''", "'\"'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR_LITERAL", "STRING_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", 
			"IF", "ELSE", "ELSEIF", "FOR", "WHILE", "DO", "INTEGER", "FLOATING_POINT", 
			"CHARACTER", "STRING", "BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", 
			"SCAN", "MAIN", "RETURN", "TRUE", "FALSE", "PUBLIC", "PRIVATE", "STATIC", 
			"INSTANTIATED", "PROTECTED", "GLOBAL", "IDENTIFIER", "LBRACKET", "RBRACKET", 
			"LPARENTHESIS", "RPARENTHESIS", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", 
			"DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", 
			"MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", 
			"DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", 
			"EQUALS_EQUALS", "NOT_EQUALS", "AND", "OR", "NOT", "DIGIT", "LETTER", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public List<GlobaldelcarationContext> globaldelcaration() {
			return getRuleContexts(GlobaldelcarationContext.class);
		}
		public GlobaldelcarationContext globaldelcaration(int i) {
			return getRuleContext(GlobaldelcarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(72);
				globaldelcaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(78);
				function();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			main();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(85);
				function();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(EOF);
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
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(93);
				declaration();
				}
				break;
			case 2:
				{
				setState(94);
				assignment();
				}
				break;
			case 3:
				{
				setState(95);
				condition();
				}
				break;
			case 4:
				{
				setState(96);
				loop();
				}
				break;
			case 5:
				{
				setState(97);
				operation();
				}
				break;
			case 6:
				{
				setState(98);
				function();
				}
				break;
			case 7:
				{
				setState(99);
				call();
				}
				break;
			case 8:
				{
				setState(100);
				print();
				}
				break;
			case 9:
				{
				setState(101);
				scan();
				}
				break;
			}
			setState(104);
			match(SEMICOLON);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(gParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAIN);
			setState(107);
			match(LBRACE);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(108);
				block();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RBRACE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(gParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public TerminalNode CHARACTER() { return getToken(gParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(gParser.VOID, 0); }
		public TerminalNode LBRACKET() { return getToken(gParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(gParser.RBRACKET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FUNCTION);
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(118);
				match(LBRACKET);
				setState(119);
				match(RBRACKET);
				}
			}

			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(LPARENTHESIS);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(124);
				declaration();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					declaration();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(134);
			match(RPARENTHESIS);
			setState(135);
			match(LBRACE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(136);
				block();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(142);
				returnstatement();
				}
			}

			setState(145);
			match(RBRACE);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(gParser.CALL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(gParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gParser.IDENTIFIER, i);
		}
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(CALL);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(LPARENTHESIS);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << IDENTIFIER) | (1L << LPARENTHESIS))) != 0)) {
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(150);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(151);
					opr();
					}
					break;
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(154);
					match(COMMA);
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(155);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(156);
						opr();
						}
						break;
					}
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(166);
			match(RPARENTHESIS);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gParser.RETURN, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(RETURN);
			setState(169);
			booleanexp();
			setState(170);
			match(SEMICOLON);
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

	public static class GlobaldelcarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(gParser.GLOBAL, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public GlobaldelcarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaldelcaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGlobaldelcaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGlobaldelcaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGlobaldelcaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobaldelcarationContext globaldelcaration() throws RecognitionException {
		GlobaldelcarationContext _localctx = new GlobaldelcarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_globaldelcaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(GLOBAL);
			setState(173);
			declaration();
			setState(174);
			match(SEMICOLON);
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

	public static class DeclarationContext extends ParserRuleContext {
		public SingledeclarationContext singledeclaration() {
			return getRuleContext(SingledeclarationContext.class,0);
		}
		public ArraydeclarationContext arraydeclaration() {
			return getRuleContext(ArraydeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				arraydeclaration();
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

	public static class SingledeclarationContext extends ParserRuleContext {
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public FloatdeclarationContext floatdeclaration() {
			return getRuleContext(FloatdeclarationContext.class,0);
		}
		public ChardeclarationContext chardeclaration() {
			return getRuleContext(ChardeclarationContext.class,0);
		}
		public BooleandeclarationContext booleandeclaration() {
			return getRuleContext(BooleandeclarationContext.class,0);
		}
		public SingledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingledeclarationContext singledeclaration() throws RecognitionException {
		SingledeclarationContext _localctx = new SingledeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singledeclaration);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				intdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				floatdeclaration();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				chardeclaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				booleandeclaration();
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

	public static class ArraydeclarationContext extends ParserRuleContext {
		public IntarrdeclarationContext intarrdeclaration() {
			return getRuleContext(IntarrdeclarationContext.class,0);
		}
		public FloatarrdeclarationContext floatarrdeclaration() {
			return getRuleContext(FloatarrdeclarationContext.class,0);
		}
		public ChararrdeclarationContext chararrdeclaration() {
			return getRuleContext(ChararrdeclarationContext.class,0);
		}
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArraydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArraydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arraydeclaration);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				intarrdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				floatarrdeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				chararrdeclaration();
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

	public static class BooleandeclarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(gParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public BooleandeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleandeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleandeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleandeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleandeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleandeclarationContext booleandeclaration() throws RecognitionException {
		BooleandeclarationContext _localctx = new BooleandeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleandeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BOOLEAN);
			setState(192);
			match(IDENTIFIER);
			{
			setState(193);
			match(EQUALS);
			setState(194);
			booleanexp();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(195);
				logic();
				setState(196);
				booleanexp();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntdeclarationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public IntdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIntdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIntdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIntdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntdeclarationContext intdeclaration() throws RecognitionException {
		IntdeclarationContext _localctx = new IntdeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(INTEGER);
			setState(204);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(205);
				match(EQUALS);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(206);
					match(INT_LITERAL);
					}
					break;
				case 2:
					{
					setState(207);
					opr();
					}
					break;
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

	public static class IntarrdeclarationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public VararrnameContext vararrname() {
			return getRuleContext(VararrnameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(gParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(gParser.INT_LITERAL, i);
		}
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public IntarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIntarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIntarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIntarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntarrdeclarationContext intarrdeclaration() throws RecognitionException {
		IntarrdeclarationContext _localctx = new IntarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_intarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(INTEGER);
			setState(213);
			vararrname();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(214);
				match(EQUALS);
				setState(215);
				match(LBRACE);
				setState(216);
				match(INT_LITERAL);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					match(INT_LITERAL);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(RBRACE);
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

	public static class FloatdeclarationContext extends ParserRuleContext {
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(gParser.FLOAT_LITERAL, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public FloatdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFloatdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFloatdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFloatdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatdeclarationContext floatdeclaration() throws RecognitionException {
		FloatdeclarationContext _localctx = new FloatdeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_floatdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(FLOATING_POINT);
			setState(228);
			match(IDENTIFIER);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(229);
				match(EQUALS);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(230);
					match(FLOAT_LITERAL);
					}
					break;
				case 2:
					{
					setState(231);
					opr();
					}
					break;
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

	public static class FloatarrdeclarationContext extends ParserRuleContext {
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public VararrnameContext vararrname() {
			return getRuleContext(VararrnameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(gParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(gParser.FLOAT_LITERAL, i);
		}
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FloatarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFloatarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFloatarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFloatarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatarrdeclarationContext floatarrdeclaration() throws RecognitionException {
		FloatarrdeclarationContext _localctx = new FloatarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FLOATING_POINT);
			setState(237);
			vararrname();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(238);
				match(EQUALS);
				setState(239);
				match(LBRACE);
				setState(240);
				match(FLOAT_LITERAL);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(241);
					match(COMMA);
					setState(242);
					match(FLOAT_LITERAL);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(RBRACE);
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

	public static class ChardeclarationContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(gParser.CHARACTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(gParser.CHAR_LITERAL, 0); }
		public ChardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterChardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitChardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitChardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclarationContext chardeclaration() throws RecognitionException {
		ChardeclarationContext _localctx = new ChardeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CHARACTER);
			setState(252);
			match(IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(253);
				match(EQUALS);
				setState(254);
				match(CHAR_LITERAL);
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

	public static class ChararrdeclarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public ChararrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterChararrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitChararrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitChararrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararrdeclarationContext chararrdeclaration() throws RecognitionException {
		ChararrdeclarationContext _localctx = new ChararrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chararrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(STRING);
			setState(258);
			match(IDENTIFIER);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(259);
				match(EQUALS);
				setState(260);
				match(STRING_LITERAL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(gParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IDENTIFIER);
			setState(264);
			match(EQUALS);
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case IDENTIFIER:
			case LPARENTHESIS:
				{
				setState(265);
				opr();
				}
				break;
			case CHAR_LITERAL:
				{
				setState(266);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				{
				setState(267);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public List<TerminalNode> LPARENTHESIS() { return getTokens(gParser.LPARENTHESIS); }
		public TerminalNode LPARENTHESIS(int i) {
			return getToken(gParser.LPARENTHESIS, i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<TerminalNode> RPARENTHESIS() { return getTokens(gParser.RPARENTHESIS); }
		public TerminalNode RPARENTHESIS(int i) {
			return getToken(gParser.RPARENTHESIS, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(gParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(gParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(gParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(gParser.RBRACE, i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(gParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(gParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IF);
			setState(271);
			match(LPARENTHESIS);
			setState(272);
			booleanexp();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(273);
				logic();
				setState(274);
				booleanexp();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(RPARENTHESIS);
			setState(282);
			match(LBRACE);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(283);
				block();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(RBRACE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(290);
				match(ELSEIF);
				setState(291);
				match(LPARENTHESIS);
				setState(292);
				booleanexp();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(293);
					logic();
					setState(294);
					booleanexp();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(RPARENTHESIS);
				setState(302);
				match(LBRACE);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(303);
					block();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(RBRACE);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(316);
				match(ELSE);
				setState(317);
				match(LBRACE);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(318);
					block();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RBRACE);
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

	public static class LoopContext extends ParserRuleContext {
		public LoopforContext loopfor() {
			return getRuleContext(LoopforContext.class,0);
		}
		public LoopwhileContext loopwhile() {
			return getRuleContext(LoopwhileContext.class,0);
		}
		public LoopdowhileContext loopdowhile() {
			return getRuleContext(LoopdowhileContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loop);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				loopwhile();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				loopdowhile();
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

	public static class LoopforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gParser.SEMICOLON, i);
		}
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LoopforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopforContext loopfor() throws RecognitionException {
		LoopforContext _localctx = new LoopforContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FOR);
			setState(333);
			match(LPARENTHESIS);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(334);
				assignment();
				}
				break;
			case INTEGER:
			case FLOATING_POINT:
			case CHARACTER:
			case STRING:
			case BOOLEAN:
				{
				setState(335);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338);
			match(SEMICOLON);
			setState(339);
			booleanexp();
			setState(340);
			match(SEMICOLON);
			setState(341);
			operation();
			setState(342);
			match(RPARENTHESIS);
			setState(343);
			match(LBRACE);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(344);
				block();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RBRACE);
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

	public static class LoopwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LoopwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopwhileContext loopwhile() throws RecognitionException {
		LoopwhileContext _localctx = new LoopwhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(WHILE);
			setState(353);
			match(LPARENTHESIS);
			setState(354);
			booleanexp();
			setState(355);
			match(RPARENTHESIS);
			setState(356);
			match(LBRACE);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(357);
				block();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(RBRACE);
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

	public static class LoopdowhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LoopdowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopdowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopdowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopdowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopdowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopdowhileContext loopdowhile() throws RecognitionException {
		LoopdowhileContext _localctx = new LoopdowhileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopdowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(DO);
			setState(366);
			match(LBRACE);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << FUNCTION) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(367);
				block();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(RBRACE);
			setState(374);
			match(WHILE);
			setState(375);
			match(LPARENTHESIS);
			setState(376);
			booleanexp();
			setState(377);
			match(RPARENTHESIS);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public ShortoprContext shortopr() {
			return getRuleContext(ShortoprContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operation);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(IDENTIFIER);
				setState(380);
				match(EQUALS);
				setState(381);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(IDENTIFIER);
				setState(383);
				shortopr();
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

	public static class OprContext extends ParserRuleContext {
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
		}
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			addopr(0);
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

	public static class AddoprContext extends ParserRuleContext {
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public AddoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAddopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAddopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAddopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddoprContext addopr() throws RecognitionException {
		return addopr(0);
	}

	private AddoprContext addopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddoprContext _localctx = new AddoprContext(_ctx, _parentState);
		AddoprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_addopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(389);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(391);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(392);
						match(PLUS);
						setState(393);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(394);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(395);
						match(MINUS);
						setState(396);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class MultoprContext extends ParserRuleContext {
		public TerminaloprContext terminalopr() {
			return getRuleContext(TerminaloprContext.class,0);
		}
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(gParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(gParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public MultoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMultopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMultopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMultopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultoprContext multopr() throws RecognitionException {
		return multopr(0);
	}

	private MultoprContext multopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultoprContext _localctx = new MultoprContext(_ctx, _parentState);
		MultoprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_multopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(405);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(406);
						match(MUL);
						setState(407);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						match(DIV);
						setState(410);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(411);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(412);
						match(MOD);
						setState(413);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class TerminaloprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(gParser.FLOAT_LITERAL, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminaloprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTerminalopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTerminalopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTerminalopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminaloprContext terminalopr() throws RecognitionException {
		TerminaloprContext _localctx = new TerminaloprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_terminalopr);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(IDENTIFIER);
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(FLOAT_LITERAL);
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(LPARENTHESIS);
				setState(423);
				opr();
				setState(424);
				match(RPARENTHESIS);
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

	public static class ShortoprContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(gParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(gParser.MINUS_MINUS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public TerminalNode PLUS_EQUALS() { return getToken(gParser.PLUS_EQUALS, 0); }
		public TerminalNode MIN_EQUALS() { return getToken(gParser.MIN_EQUALS, 0); }
		public TerminalNode MUL_EQUALS() { return getToken(gParser.MUL_EQUALS, 0); }
		public TerminalNode DIV_EQUALS() { return getToken(gParser.DIV_EQUALS, 0); }
		public ShortoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterShortopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitShortopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShortopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortoprContext shortopr() throws RecognitionException {
		ShortoprContext _localctx = new ShortoprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shortopr);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
				match(INT_LITERAL);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gParser.PRINT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<TerminalNode> PLUS() { return getTokens(gParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gParser.PLUS, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(gParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(gParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gParser.IDENTIFIER, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(PRINT);
			setState(435);
			match(LPARENTHESIS);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENTIFIER) {
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(439);
				match(PLUS);
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(RPARENTHESIS);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(gParser.SCAN, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(SCAN);
			setState(449);
			match(LPARENTHESIS);
			setState(450);
			match(STRING_LITERAL);
			setState(451);
			match(COMMA);
			setState(452);
			match(IDENTIFIER);
			setState(453);
			match(RPARENTHESIS);
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

	public static class BooleanexpContext extends ParserRuleContext {
		public List<BooleanvalueContext> booleanvalue() {
			return getRuleContexts(BooleanvalueContext.class);
		}
		public BooleanvalueContext booleanvalue(int i) {
			return getRuleContext(BooleanvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(gParser.NOT, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public BooleanexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleanexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleanexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanexpContext booleanexp() throws RecognitionException {
		BooleanexpContext _localctx = new BooleanexpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_booleanexp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(455);
				match(NOT);
				}
			}

			setState(458);
			booleanvalue();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) {
				{
				setState(459);
				relation();
				setState(460);
				booleanvalue();
				}
			}

			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					logic();
					setState(465);
					booleanexp();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class BooleanvalueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(gParser.CHAR_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(gParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gParser.FALSE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booleanvalue);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(INT_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(CHAR_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				match(FALSE);
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
				match(LPARENTHESIS);
				setState(479);
				booleanexp();
				setState(480);
				match(RPARENTHESIS);
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode EQUALS_EQUALS() { return getToken(gParser.EQUALS_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(gParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(gParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(gParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(gParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(gParser.GREATER_THAN, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) ) {
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class VararrnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(gParser.LBRACKET, 0); }
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public TerminalNode RBRACKET() { return getToken(gParser.RBRACKET, 0); }
		public VararrnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararrname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVararrname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVararrname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVararrname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VararrnameContext vararrname() throws RecognitionException {
		VararrnameContext _localctx = new VararrnameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_vararrname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(IDENTIFIER);
			setState(489);
			match(LBRACKET);
			setState(490);
			match(INT_LITERAL);
			setState(491);
			match(RBRACKET);
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
		case 25:
			return addopr_sempred((AddoprContext)_localctx, predIndex);
		case 26:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addopr_sempred(AddoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multopr_sempred(MultoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\3\3\3\3\4\3\4\3\4\7\4p\n\4\f\4\16\4"+
		"s\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082"+
		"\n\5\f\5\16\5\u0085\13\5\5\5\u0087\n\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16"+
		"\5\u008f\13\5\3\5\5\5\u0092\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u009b"+
		"\n\6\3\6\3\6\3\6\5\6\u00a0\n\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13\6\5\6\u00a7"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00b5\n\t\3\n"+
		"\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00d3\n\r\5\r\u00d5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00de"+
		"\n\16\f\16\16\16\u00e1\13\16\3\16\5\16\u00e4\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00eb\n\17\5\17\u00ed\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3\20\5\20\u00fc\n\20\3\21\3"+
		"\21\3\21\3\21\5\21\u0102\n\21\3\22\3\22\3\22\3\22\5\22\u0108\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0117\n\24\f\24\16\24\u011a\13\24\3\24\3\24\3\24\7\24\u011f\n\24\f\24"+
		"\16\24\u0122\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u012b\n\24"+
		"\f\24\16\24\u012e\13\24\3\24\3\24\3\24\7\24\u0133\n\24\f\24\16\24\u0136"+
		"\13\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13\24\3\24\3\24\3\24"+
		"\7\24\u0142\n\24\f\24\16\24\u0145\13\24\3\24\5\24\u0148\n\24\3\25\3\25"+
		"\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\26\5\26\u0153\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0169\n\27\f\27\16\27\u016c\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u0173\n\30\f\30\16\30\u0176\13\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0183\n\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0190\n\33"+
		"\f\33\16\33\u0193\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u01a1\n\34\f\34\16\34\u01a4\13\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u01ad\n\35\3\36\3\36\3\36\3\36\5\36\u01b3\n\36"+
		"\3\37\3\37\3\37\5\37\u01b8\n\37\3\37\3\37\7\37\u01bc\n\37\f\37\16\37\u01bf"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\5!\u01cb\n!\3!\3!\3!\3!\5!\u01d1"+
		"\n!\3!\3!\3!\7!\u01d6\n!\f!\16!\u01d9\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01e5\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\2\4\64\66&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\7\4\2\r\20\22\22\3\2\658\4\2\4\4!!\3\29>\3\2?@\2\u0216\2M\3\2\2\2\4h"+
		"\3\2\2\2\6l\3\2\2\2\bv\3\2\2\2\n\u0095\3\2\2\2\f\u00aa\3\2\2\2\16\u00ae"+
		"\3\2\2\2\20\u00b4\3\2\2\2\22\u00ba\3\2\2\2\24\u00bf\3\2\2\2\26\u00c1\3"+
		"\2\2\2\30\u00cd\3\2\2\2\32\u00d6\3\2\2\2\34\u00e5\3\2\2\2\36\u00ee\3\2"+
		"\2\2 \u00fd\3\2\2\2\"\u0103\3\2\2\2$\u0109\3\2\2\2&\u0110\3\2\2\2(\u014c"+
		"\3\2\2\2*\u014e\3\2\2\2,\u0162\3\2\2\2.\u016f\3\2\2\2\60\u0182\3\2\2\2"+
		"\62\u0184\3\2\2\2\64\u0186\3\2\2\2\66\u0194\3\2\2\28\u01ac\3\2\2\2:\u01b2"+
		"\3\2\2\2<\u01b4\3\2\2\2>\u01c2\3\2\2\2@\u01ca\3\2\2\2B\u01e4\3\2\2\2D"+
		"\u01e6\3\2\2\2F\u01e8\3\2\2\2H\u01ea\3\2\2\2JL\5\16\b\2KJ\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\b\5\2QP\3\2\2\2RU\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VZ\5\6\4\2WY\5\b\5\2XW\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\2\2\3^"+
		"\3\3\2\2\2_i\5\20\t\2`i\5$\23\2ai\5&\24\2bi\5(\25\2ci\5\60\31\2di\5\b"+
		"\5\2ei\5\n\6\2fi\5<\37\2gi\5> \2h_\3\2\2\2h`\3\2\2\2ha\3\2\2\2hb\3\2\2"+
		"\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7)\2"+
		"\2k\5\3\2\2\2lm\7\27\2\2mq\7&\2\2np\5\4\3\2on\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\'\2\2u\7\3\2\2\2vw\7\23\2\2wz\t"+
		"\2\2\2xy\7\"\2\2y{\7#\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7!\2\2}\u0086"+
		"\7$\2\2~\u0083\5\20\t\2\177\u0080\7(\2\2\u0080\u0082\5\20\t\2\u0081\177"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086~\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0089\7%\2\2\u0089\u008d\7&\2\2\u008a\u008c"+
		"\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\f"+
		"\7\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7\'\2\2\u0094\t\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u0097\7!\2\2"+
		"\u0097\u00a6\7$\2\2\u0098\u009b\7!\2\2\u0099\u009b\5\62\32\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a3\3\2\2\2\u009c\u009f\7(\2\2\u009d"+
		"\u00a0\7!\2\2\u009e\u00a0\5\62\32\2\u009f\u009d\3\2\2\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7%\2\2\u00a9\13\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5@!\2"+
		"\u00ac\u00ad\7)\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7 \2\2\u00af\u00b0\5\20"+
		"\t\2\u00b0\u00b1\7)\2\2\u00b1\17\3\2\2\2\u00b2\u00b5\5\22\n\2\u00b3\u00b5"+
		"\5\24\13\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\21\3\2\2\2\u00b6"+
		"\u00bb\5\30\r\2\u00b7\u00bb\5\34\17\2\u00b8\u00bb\5 \21\2\u00b9\u00bb"+
		"\5\26\f\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00c0\5\32\16\2\u00bd\u00c0"+
		"\5\36\20\2\u00be\u00c0\5\"\22\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3"+
		"\7!\2\2\u00c3\u00c4\7\64\2\2\u00c4\u00ca\5@!\2\u00c5\u00c6\5F$\2\u00c6"+
		"\u00c7\5@!\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00d4\7!\2\2\u00cf\u00d2\7\64\2\2\u00d0"+
		"\u00d3\7\5\2\2\u00d1\u00d3\5\62\32\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\31\3\2\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00e3\5H%\2\u00d8\u00d9\7\64\2\2"+
		"\u00d9\u00da\7&\2\2\u00da\u00df\7\5\2\2\u00db\u00dc\7(\2\2\u00dc\u00de"+
		"\7\5\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\'"+
		"\2\2\u00e3\u00d8\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\33\3\2\2\2\u00e5\u00e6"+
		"\7\16\2\2\u00e6\u00ec\7!\2\2\u00e7\u00ea\7\64\2\2\u00e8\u00eb\7\6\2\2"+
		"\u00e9\u00eb\5\62\32\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee"+
		"\u00ef\7\16\2\2\u00ef\u00fb\5H%\2\u00f0\u00f1\7\64\2\2\u00f1\u00f2\7&"+
		"\2\2\u00f2\u00f7\7\6\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f6\7\6\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\7\'\2\2\u00fb"+
		"\u00f0\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2\2\u00fd\u00fe\7\17\2"+
		"\2\u00fe\u0101\7!\2\2\u00ff\u0100\7\64\2\2\u0100\u0102\7\3\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102!\3\2\2\2\u0103\u0104\7\20\2\2\u0104"+
		"\u0107\7!\2\2\u0105\u0106\7\64\2\2\u0106\u0108\7\4\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108#\3\2\2\2\u0109\u010a\7!\2\2\u010a\u010e"+
		"\7\64\2\2\u010b\u010f\5\62\32\2\u010c\u010f\7\3\2\2\u010d\u010f\7\4\2"+
		"\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f%"+
		"\3\2\2\2\u0110\u0111\7\7\2\2\u0111\u0112\7$\2\2\u0112\u0118\5@!\2\u0113"+
		"\u0114\5F$\2\u0114\u0115\5@!\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2\2"+
		"\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7%\2\2\u011c\u0120\7&\2\2\u011d"+
		"\u011f\5\4\3\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u013b\7\'\2\2\u0124\u0125\7\t\2\2\u0125\u0126\7$\2\2\u0126\u012c\5@!"+
		"\2\u0127\u0128\5F$\2\u0128\u0129\5@!\2\u0129\u012b\3\2\2\2\u012a\u0127"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7%\2\2\u0130\u0134\7&\2"+
		"\2\u0131\u0133\5\4\3\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7\'\2\2\u0138\u013a\3\2\2\2\u0139\u0124\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0147\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7\b\2\2\u013f\u0143\7&\2\2\u0140\u0142\5\4"+
		"\3\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\'"+
		"\2\2\u0147\u013e\3\2\2\2\u0147\u0148\3\2\2\2\u0148\'\3\2\2\2\u0149\u014d"+
		"\5*\26\2\u014a\u014d\5,\27\2\u014b\u014d\5.\30\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d)\3\2\2\2\u014e\u014f\7\n\2\2"+
		"\u014f\u0152\7$\2\2\u0150\u0153\5$\23\2\u0151\u0153\5\20\t\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7)\2\2\u0155"+
		"\u0156\5@!\2\u0156\u0157\7)\2\2\u0157\u0158\5\60\31\2\u0158\u0159\7%\2"+
		"\2\u0159\u015d\7&\2\2\u015a\u015c\5\4\3\2\u015b\u015a\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0161\7\'\2\2\u0161+\3\2\2\2\u0162\u0163\7\13\2\2"+
		"\u0163\u0164\7$\2\2\u0164\u0165\5@!\2\u0165\u0166\7%\2\2\u0166\u016a\7"+
		"&\2\2\u0167\u0169\5\4\3\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016e\7\'\2\2\u016e-\3\2\2\2\u016f\u0170\7\f\2\2\u0170\u0174"+
		"\7&\2\2\u0171\u0173\5\4\3\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\7\'\2\2\u0178\u0179\7\13\2\2\u0179\u017a\7$\2\2\u017a"+
		"\u017b\5@!\2\u017b\u017c\7%\2\2\u017c/\3\2\2\2\u017d\u017e\7!\2\2\u017e"+
		"\u017f\7\64\2\2\u017f\u0183\5\62\32\2\u0180\u0181\7!\2\2\u0181\u0183\5"+
		":\36\2\u0182\u017d\3\2\2\2\u0182\u0180\3\2\2\2\u0183\61\3\2\2\2\u0184"+
		"\u0185\5\64\33\2\u0185\63\3\2\2\2\u0186\u0187\b\33\1\2\u0187\u0188\5\66"+
		"\34\2\u0188\u0191\3\2\2\2\u0189\u018a\f\5\2\2\u018a\u018b\7/\2\2\u018b"+
		"\u0190\5\66\34\2\u018c\u018d\f\4\2\2\u018d\u018e\7\60\2\2\u018e\u0190"+
		"\5\66\34\2\u018f\u0189\3\2\2\2\u018f\u018c\3\2\2\2\u0190\u0193\3\2\2\2"+
		"\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\65\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0194\u0195\b\34\1\2\u0195\u0196\58\35\2\u0196\u01a2\3\2\2\2"+
		"\u0197\u0198\f\6\2\2\u0198\u0199\7\61\2\2\u0199\u01a1\58\35\2\u019a\u019b"+
		"\f\5\2\2\u019b\u019c\7\62\2\2\u019c\u01a1\58\35\2\u019d\u019e\f\4\2\2"+
		"\u019e\u019f\7\63\2\2\u019f\u01a1\58\35\2\u01a0\u0197\3\2\2\2\u01a0\u019a"+
		"\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\67\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01ad\7!\2\2"+
		"\u01a6\u01ad\7\5\2\2\u01a7\u01ad\7\6\2\2\u01a8\u01a9\7$\2\2\u01a9\u01aa"+
		"\5\62\32\2\u01aa\u01ab\7%\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a5\3\2\2\2"+
		"\u01ac\u01a6\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad9\3"+
		"\2\2\2\u01ae\u01b3\7-\2\2\u01af\u01b3\7.\2\2\u01b0\u01b1\t\3\2\2\u01b1"+
		"\u01b3\7\5\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3;\3\2\2\2\u01b4\u01b5\7\25\2\2\u01b5\u01b7\7$\2\2\u01b6\u01b8"+
		"\t\4\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bd\3\2\2\2\u01b9"+
		"\u01ba\7/\2\2\u01ba\u01bc\t\4\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\7%\2\2\u01c1=\3\2\2\2\u01c2\u01c3\7\26\2\2"+
		"\u01c3\u01c4\7$\2\2\u01c4\u01c5\7\4\2\2\u01c5\u01c6\7(\2\2\u01c6\u01c7"+
		"\7!\2\2\u01c7\u01c8\7%\2\2\u01c8?\3\2\2\2\u01c9\u01cb\7A\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d0\5B\"\2\u01cd"+
		"\u01ce\5D#\2\u01ce\u01cf\5B\"\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3\2\2"+
		"\2\u01d0\u01d1\3\2\2\2\u01d1\u01d7\3\2\2\2\u01d2\u01d3\5F$\2\u01d3\u01d4"+
		"\5@!\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8A\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01da\u01e5\7\5\2\2\u01db\u01e5\7!\2\2\u01dc\u01e5\7\4\2\2\u01dd\u01e5"+
		"\7\3\2\2\u01de\u01e5\7\31\2\2\u01df\u01e5\7\32\2\2\u01e0\u01e1\7$\2\2"+
		"\u01e1\u01e2\5@!\2\u01e2\u01e3\7%\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01da"+
		"\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01dc\3\2\2\2\u01e4\u01dd\3\2\2\2\u01e4"+
		"\u01de\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5C\3\2\2\2"+
		"\u01e6\u01e7\t\5\2\2\u01e7E\3\2\2\2\u01e8\u01e9\t\6\2\2\u01e9G\3\2\2\2"+
		"\u01ea\u01eb\7!\2\2\u01eb\u01ec\7\"\2\2\u01ec\u01ed\7\5\2\2\u01ed\u01ee"+
		"\7#\2\2\u01eeI\3\2\2\28MSZhqz\u0083\u0086\u008d\u0091\u009a\u009f\u00a3"+
		"\u00a6\u00b4\u00ba\u00bf\u00ca\u00d2\u00d4\u00df\u00e3\u00ea\u00ec\u00f7"+
		"\u00fb\u0101\u0107\u010e\u0118\u0120\u012c\u0134\u013b\u0143\u0147\u014c"+
		"\u0152\u015d\u016a\u0174\u0182\u018f\u0191\u01a0\u01a2\u01ac\u01b2\u01b7"+
		"\u01bd\u01ca\u01d0\u01d7\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}