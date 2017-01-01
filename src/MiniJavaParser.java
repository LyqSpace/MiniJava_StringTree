// Generated from .\src\MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, Letter=37, Digit=38, 
		WS=39, COMMENT_BLOCK=40, COMMENT_LINE=41;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_typeDeclaration = 5, RULE_parameterList = 6, 
		RULE_statement = 7, RULE_expression = 8;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"typeDeclaration", "parameterList", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
		"'int'", "'boolean'", "','", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Identifier", "Letter", "Digit", "WS", "COMMENT_BLOCK", "COMMENT_LINE"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainClass();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				classDeclaration();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(24);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			((MainClassContext)_localctx).name = match(Identifier);
			setState(28);
			match(T__1);
			setState(29);
			match(T__2);
			setState(30);
			match(T__3);
			setState(31);
			match(T__4);
			setState(32);
			match(T__5);
			setState(33);
			match(T__6);
			setState(34);
			match(T__7);
			setState(35);
			match(T__8);
			setState(36);
			match(T__9);
			setState(37);
			match(Identifier);
			setState(38);
			match(T__10);
			setState(39);
			match(T__1);
			setState(40);
			statement();
			setState(41);
			match(T__11);
			setState(42);
			match(T__11);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token extendName;
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			((ClassDeclarationContext)_localctx).name = match(Identifier);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(46);
				match(T__12);
				setState(47);
				((ClassDeclarationContext)_localctx).extendName = match(Identifier);
				}
			}

			setState(50);
			match(T__1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << Identifier))) != 0)) {
				{
				{
				setState(51);
				varDeclaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(57);
				methodDeclaration();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__11);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext type;
		public Token name;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((VarDeclarationContext)_localctx).type = typeDeclaration();
			setState(66);
			((VarDeclarationContext)_localctx).name = match(Identifier);
			setState(67);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext returnType;
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(70);
			((MethodDeclarationContext)_localctx).returnType = typeDeclaration();
			setState(71);
			((MethodDeclarationContext)_localctx).name = match(Identifier);
			setState(72);
			match(T__6);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << Identifier))) != 0)) {
				{
				setState(73);
				parameterList();
				}
			}

			setState(76);
			match(T__10);
			setState(77);
			match(T__1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					varDeclaration();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__14);
			setState(91);
			expression(0);
			setState(92);
			match(T__13);
			setState(93);
			match(T__11);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDeclaration);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__15);
				setState(96);
				match(T__8);
				setState(97);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(Identifier);
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

	public static class ParameterListContext extends ParserRuleContext {
		public TypeDeclarationContext type;
		public Token name;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((ParameterListContext)_localctx).type = typeDeclaration();
				setState(104);
				((ParameterListContext)_localctx).name = match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((ParameterListContext)_localctx).type = typeDeclaration();
				setState(107);
				((ParameterListContext)_localctx).name = match(Identifier);
				setState(108);
				match(T__17);
				setState(109);
				parameterList();
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__1);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(114);
					statement();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__18);
				setState(122);
				match(T__6);
				setState(123);
				expression(0);
				setState(124);
				match(T__10);
				setState(125);
				statement();
				setState(126);
				match(T__19);
				setState(127);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(T__20);
				setState(130);
				match(T__6);
				setState(131);
				expression(0);
				setState(132);
				match(T__10);
				setState(133);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__21);
				setState(136);
				match(T__6);
				setState(137);
				expression(0);
				setState(138);
				match(T__10);
				setState(139);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(Identifier);
				setState(142);
				match(T__22);
				setState(143);
				expression(0);
				setState(144);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(T__8);
				setState(148);
				expression(0);
				setState(149);
				match(T__9);
				setState(150);
				match(T__22);
				setState(151);
				expression(0);
				setState(152);
				match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(MiniJavaParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MiniJavaParser.Digit, i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Letter() { return getTokens(MiniJavaParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MiniJavaParser.Letter, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(158); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(157);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(160); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(162);
				match(T__30);
				}
				break;
			case 3:
				{
				setState(163);
				match(T__31);
				}
				break;
			case 4:
				{
				setState(164);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(165);
				match(T__32);
				}
				break;
			case 6:
				{
				setState(166);
				match(T__33);
				setState(167);
				match(T__15);
				setState(168);
				match(T__8);
				setState(169);
				expression(0);
				setState(170);
				match(T__9);
				}
				break;
			case 7:
				{
				setState(172);
				match(T__33);
				setState(173);
				match(Identifier);
				setState(174);
				match(T__6);
				setState(175);
				match(T__10);
				}
				break;
			case 8:
				{
				setState(176);
				match(T__34);
				setState(177);
				expression(3);
				}
				break;
			case 9:
				{
				setState(178);
				match(T__6);
				setState(179);
				expression(0);
				setState(180);
				match(T__10);
				}
				break;
			case 10:
				{
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182);
						match(Letter);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						match(T__8);
						setState(194);
						expression(0);
						setState(195);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(198);
						match(T__28);
						setState(199);
						match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						match(T__28);
						setState(202);
						match(Identifier);
						setState(203);
						match(T__6);
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << Identifier) | (1L << Letter) | (1L << Digit))) != 0)) {
							{
							setState(204);
							expression(0);
							setState(209);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__17) {
								{
								{
								setState(205);
								match(T__17);
								setState(206);
								expression(0);
								}
								}
								setState(211);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(214);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(219);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3\4"+
		"\7\4\67\n\4\f\4\16\4:\13\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13"+
		"\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\7\tv\n"+
		"\t\f\t\16\ty\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\6\n\u00a1\n\n\r\n\16\n\u00a2\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\6\n\u00ba\n\n\r\n\16\n\u00bb\5\n\u00be\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n"+
		"\f\n\16\n\u00d5\13\n\5\n\u00d7\n\n\3\n\7\n\u00da\n\n\f\n\16\n\u00dd\13"+
		"\n\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\3\3\2\32\36\u00f7\2\24\3\2\2\2"+
		"\4\34\3\2\2\2\6.\3\2\2\2\bC\3\2\2\2\nG\3\2\2\2\fg\3\2\2\2\16q\3\2\2\2"+
		"\20\u009c\3\2\2\2\22\u00bd\3\2\2\2\24\26\5\4\3\2\25\27\5\6\4\2\26\25\3"+
		"\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7"+
		"\2\2\3\33\3\3\2\2\2\34\35\7\3\2\2\35\36\7&\2\2\36\37\7\4\2\2\37 \7\5\2"+
		"\2 !\7\6\2\2!\"\7\7\2\2\"#\7\b\2\2#$\7\t\2\2$%\7\n\2\2%&\7\13\2\2&\'\7"+
		"\f\2\2\'(\7&\2\2()\7\r\2\2)*\7\4\2\2*+\5\20\t\2+,\7\16\2\2,-\7\16\2\2"+
		"-\5\3\2\2\2./\7\3\2\2/\62\7&\2\2\60\61\7\17\2\2\61\63\7&\2\2\62\60\3\2"+
		"\2\2\62\63\3\2\2\2\63\64\3\2\2\2\648\7\4\2\2\65\67\5\b\5\2\66\65\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\n\6\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\16\2\2B\7"+
		"\3\2\2\2CD\5\f\7\2DE\7&\2\2EF\7\20\2\2F\t\3\2\2\2GH\7\5\2\2HI\5\f\7\2"+
		"IJ\7&\2\2JL\7\t\2\2KM\5\16\b\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\r\2\2"+
		"OS\7\4\2\2PR\5\b\5\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2"+
		"US\3\2\2\2VX\5\20\t\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2"+
		"\2[Y\3\2\2\2\\]\7\21\2\2]^\5\22\n\2^_\7\20\2\2_`\7\16\2\2`\13\3\2\2\2"+
		"ab\7\22\2\2bc\7\13\2\2ch\7\f\2\2dh\7\23\2\2eh\7\22\2\2fh\7&\2\2ga\3\2"+
		"\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2ij\5\f\7\2jk\7&\2\2kr\3\2"+
		"\2\2lm\5\f\7\2mn\7&\2\2no\7\24\2\2op\5\16\b\2pr\3\2\2\2qi\3\2\2\2ql\3"+
		"\2\2\2r\17\3\2\2\2sw\7\4\2\2tv\5\20\t\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\u009d\7\16\2\2{|\7\25\2\2|}\7\t\2\2}~"+
		"\5\22\n\2~\177\7\r\2\2\177\u0080\5\20\t\2\u0080\u0081\7\26\2\2\u0081\u0082"+
		"\5\20\t\2\u0082\u009d\3\2\2\2\u0083\u0084\7\27\2\2\u0084\u0085\7\t\2\2"+
		"\u0085\u0086\5\22\n\2\u0086\u0087\7\r\2\2\u0087\u0088\5\20\t\2\u0088\u009d"+
		"\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\22\n\2"+
		"\u008c\u008d\7\r\2\2\u008d\u008e\7\20\2\2\u008e\u009d\3\2\2\2\u008f\u0090"+
		"\7&\2\2\u0090\u0091\7\31\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\20\2\2"+
		"\u0093\u009d\3\2\2\2\u0094\u0095\7&\2\2\u0095\u0096\7\13\2\2\u0096\u0097"+
		"\5\22\n\2\u0097\u0098\7\f\2\2\u0098\u0099\7\31\2\2\u0099\u009a\5\22\n"+
		"\2\u009a\u009b\7\20\2\2\u009b\u009d\3\2\2\2\u009cs\3\2\2\2\u009c{\3\2"+
		"\2\2\u009c\u0083\3\2\2\2\u009c\u0089\3\2\2\2\u009c\u008f\3\2\2\2\u009c"+
		"\u0094\3\2\2\2\u009d\21\3\2\2\2\u009e\u00a0\b\n\1\2\u009f\u00a1\7(\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00be\3\2\2\2\u00a4\u00be\7!\2\2\u00a5\u00be\7\"\2\2\u00a6"+
		"\u00be\7&\2\2\u00a7\u00be\7#\2\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\7\22\2"+
		"\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7\f\2\2\u00ad"+
		"\u00be\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b0\7&\2\2\u00b0\u00b1\7\t\2"+
		"\2\u00b1\u00be\7\r\2\2\u00b2\u00b3\7%\2\2\u00b3\u00be\5\22\n\5\u00b4\u00b5"+
		"\7\t\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7\r\2\2\u00b7\u00be\3\2\2\2"+
		"\u00b8\u00ba\7\'\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u009e\3\2\2\2\u00bd"+
		"\u00a4\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd\u00a6\3\2\2\2\u00bd\u00a7\3\2"+
		"\2\2\u00bd\u00a8\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00db\3\2\2\2\u00bf\u00c0\f\20"+
		"\2\2\u00c0\u00c1\t\2\2\2\u00c1\u00da\5\22\n\21\u00c2\u00c3\f\17\2\2\u00c3"+
		"\u00c4\7\13\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6\7\f\2\2\u00c6\u00da\3"+
		"\2\2\2\u00c7\u00c8\f\16\2\2\u00c8\u00c9\7\37\2\2\u00c9\u00da\7 \2\2\u00ca"+
		"\u00cb\f\r\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\7&\2\2\u00cd\u00d6\7\t"+
		"\2\2\u00ce\u00d3\5\22\n\2\u00cf\u00d0\7\24\2\2\u00d0\u00d2\5\22\n\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\r\2\2\u00d9\u00bf\3\2"+
		"\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00ca\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\23\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\24\30\628>LSYgqw\u009c\u00a2\u00bb\u00bd\u00d3"+
		"\u00d6\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}