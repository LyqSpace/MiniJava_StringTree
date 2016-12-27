// Generated from MiniJava.g4 by ANTLR 4.6
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
		T__31=32, T__32=33, T__33=34, This=35, New=36, Int=37, BoolValue=38, Identifier=39, 
		Integer=40, WS=41, LineComment=42, BlockComment=43, Digit=44, Lowercase=45, 
		Uppercase=46, Alphabet=47;
	public static final int
		RULE_goal = 0, RULE_program = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_paraList = 5, RULE_varDeclaration = 6, 
		RULE_typeSystem = 7, RULE_statement = 8, RULE_errorStatements = 9, RULE_printStatement = 10, 
		RULE_ifStatement = 11, RULE_whileStatement = 12, RULE_assignment = 13, 
		RULE_arrayAssignment = 14, RULE_expression = 15, RULE_logicexpr = 16, 
		RULE_andlogicexpr = 17, RULE_cmpexpr = 18, RULE_sumTerm = 19, RULE_product = 20, 
		RULE_callList = 21, RULE_atom = 22, RULE_nonBase = 23, RULE_rightvalue = 24, 
		RULE_array = 25;
	public static final String[] ruleNames = {
		"goal", "program", "mainClass", "classDeclaration", "methodDeclaration", 
		"paraList", "varDeclaration", "typeSystem", "statement", "errorStatements", 
		"printStatement", "ifStatement", "whileStatement", "assignment", "arrayAssignment", 
		"expression", "logicexpr", "andlogicexpr", "cmpexpr", "sumTerm", "product", 
		"callList", "atom", "nonBase", "rightvalue", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "'return'", "';'", 
		"','", "'boolean'", "'if'", "'System.out.println'", "'else'", "'while'", 
		"'='", "'||'", "'&&'", "'<'", "'>'", "'=='", "'+'", "'-'", "'*'", "'/'", 
		"'.'", "'length'", "'!'", "'this'", "'new'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "This", 
		"New", "Int", "BoolValue", "Identifier", "Integer", "WS", "LineComment", 
		"BlockComment", "Digit", "Lowercase", "Uppercase", "Alphabet"
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			mainClass();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(55);
				classDeclaration();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			((MainClassContext)_localctx).name = match(Identifier);
			setState(65);
			match(T__1);
			setState(66);
			match(T__2);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
			setState(69);
			match(T__5);
			setState(70);
			match(T__6);
			setState(71);
			match(T__7);
			setState(72);
			match(T__8);
			setState(73);
			match(T__9);
			setState(74);
			match(Identifier);
			setState(75);
			match(T__10);
			setState(76);
			match(T__1);
			setState(77);
			statement();
			setState(78);
			match(T__11);
			setState(79);
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
		public Token ext;
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
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			((ClassDeclarationContext)_localctx).name = match(Identifier);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(83);
				match(T__12);
				setState(84);
				((ClassDeclarationContext)_localctx).ext = match(Identifier);
				}
			}

			setState(87);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				{
				setState(88);
				varDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(94);
				methodDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeSystemContext type;
		public Token name;
		public RightvalueContext rightvalue() {
			return getRuleContext(RightvalueContext.class,0);
		}
		public TypeSystemContext typeSystem() {
			return getRuleContext(TypeSystemContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParaListContext paraList() {
			return getRuleContext(ParaListContext.class,0);
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
			setState(102);
			match(T__2);
			setState(103);
			((MethodDeclarationContext)_localctx).type = typeSystem();
			setState(104);
			((MethodDeclarationContext)_localctx).name = match(Identifier);
			setState(105);
			match(T__6);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Int) | (1L << Identifier))) != 0)) {
				{
				setState(106);
				paraList();
				}
			}

			setState(109);
			match(T__10);
			setState(110);
			match(T__1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					varDeclaration();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << Identifier))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__13);
			setState(124);
			rightvalue();
			setState(125);
			match(T__14);
			setState(126);
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

	public static class ParaListContext extends ParserRuleContext {
		public TypeSystemContext type;
		public Token name;
		public TypeSystemContext typeSystem() {
			return getRuleContext(TypeSystemContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParaListContext paraList() {
			return getRuleContext(ParaListContext.class,0);
		}
		public ParaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParaList(this);
		}
	}

	public final ParaListContext paraList() throws RecognitionException {
		ParaListContext _localctx = new ParaListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paraList);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((ParaListContext)_localctx).type = typeSystem();
				setState(129);
				((ParaListContext)_localctx).name = match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((ParaListContext)_localctx).type = typeSystem();
				setState(132);
				((ParaListContext)_localctx).name = match(Identifier);
				setState(133);
				match(T__15);
				setState(134);
				paraList();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeSystemContext type;
		public Token name;
		public TypeSystemContext typeSystem() {
			return getRuleContext(TypeSystemContext.class,0);
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
		enterRule(_localctx, 12, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((VarDeclarationContext)_localctx).type = typeSystem();
			setState(139);
			((VarDeclarationContext)_localctx).name = match(Identifier);
			setState(140);
			match(T__14);
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

	public static class TypeSystemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeSystem(this);
		}
	}

	public final TypeSystemContext typeSystem() throws RecognitionException {
		TypeSystemContext _localctx = new TypeSystemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeSystem);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(Int);
				setState(143);
				match(T__8);
				setState(144);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public ErrorStatementsContext errorStatements() {
			return getRuleContext(ErrorStatementsContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__1);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << Identifier))) != 0)) {
					{
					{
					setState(151);
					statement();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				arrayAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				errorStatements();
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

	public static class ErrorStatementsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ErrorStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterErrorStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitErrorStatements(this);
		}
	}

	public final ErrorStatementsContext errorStatements() throws RecognitionException {
		ErrorStatementsContext _localctx = new ErrorStatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_errorStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__17);
			setState(167);
			match(T__6);
			setState(168);
			expression();
			setState(169);
			match(T__10);
			setState(170);
			statement();
			notifyErrorListeners("Miss 'else' statement!");
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

	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__18);
			setState(174);
			match(T__6);
			setState(175);
			expression();
			setState(176);
			match(T__10);
			setState(177);
			match(T__14);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__17);
			setState(180);
			match(T__6);
			setState(181);
			expression();
			setState(182);
			match(T__10);
			setState(183);
			statement();
			setState(184);
			match(T__19);
			setState(185);
			statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__20);
			setState(188);
			match(T__6);
			setState(189);
			expression();
			setState(190);
			match(T__10);
			setState(191);
			statement();
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
		public Token id;
		public RightvalueContext rightvalue() {
			return getRuleContext(RightvalueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((AssignmentContext)_localctx).id = match(Identifier);
			setState(194);
			match(T__21);
			setState(195);
			rightvalue();
			setState(196);
			match(T__14);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public Token id;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAssignment(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((ArrayAssignmentContext)_localctx).id = match(Identifier);
			setState(199);
			match(T__8);
			setState(200);
			expression();
			setState(201);
			match(T__9);
			setState(202);
			match(T__21);
			setState(203);
			expression();
			setState(204);
			match(T__14);
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
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public AndlogicexprContext andlogicexpr() {
			return getRuleContext(AndlogicexprContext.class,0);
		}
		public CmpexprContext cmpexpr() {
			return getRuleContext(CmpexprContext.class,0);
		}
		public SumTermContext sumTerm() {
			return getRuleContext(SumTermContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				logicexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				andlogicexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				cmpexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				sumTerm(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				product(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				atom();
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

	public static class LogicexprContext extends ParserRuleContext {
		public List<AndlogicexprContext> andlogicexpr() {
			return getRuleContexts(AndlogicexprContext.class);
		}
		public AndlogicexprContext andlogicexpr(int i) {
			return getRuleContext(AndlogicexprContext.class,i);
		}
		public List<CmpexprContext> cmpexpr() {
			return getRuleContexts(CmpexprContext.class);
		}
		public CmpexprContext cmpexpr(int i) {
			return getRuleContext(CmpexprContext.class,i);
		}
		public List<SumTermContext> sumTerm() {
			return getRuleContexts(SumTermContext.class);
		}
		public SumTermContext sumTerm(int i) {
			return getRuleContext(SumTermContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public LogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLogicexpr(this);
		}
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		return logicexpr(0);
	}

	private LogicexprContext logicexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicexprContext _localctx = new LogicexprContext(_ctx, _parentState);
		LogicexprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logicexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				andlogicexpr(0);
				}
				break;
			case 2:
				{
				setState(216);
				cmpexpr();
				}
				break;
			case 3:
				{
				setState(217);
				sumTerm(0);
				}
				break;
			case 4:
				{
				setState(218);
				product(0);
				}
				break;
			case 5:
				{
				setState(219);
				atom();
				}
				break;
			}
			setState(222);
			match(T__22);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(223);
				andlogicexpr(0);
				}
				break;
			case 2:
				{
				setState(224);
				cmpexpr();
				}
				break;
			case 3:
				{
				setState(225);
				sumTerm(0);
				}
				break;
			case 4:
				{
				setState(226);
				product(0);
				}
				break;
			case 5:
				{
				setState(227);
				atom();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicexpr);
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231);
					match(T__22);
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(232);
						andlogicexpr(0);
						}
						break;
					case 2:
						{
						setState(233);
						cmpexpr();
						}
						break;
					case 3:
						{
						setState(234);
						sumTerm(0);
						}
						break;
					case 4:
						{
						setState(235);
						product(0);
						}
						break;
					case 5:
						{
						setState(236);
						atom();
						}
						break;
					}
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AndlogicexprContext extends ParserRuleContext {
		public List<CmpexprContext> cmpexpr() {
			return getRuleContexts(CmpexprContext.class);
		}
		public CmpexprContext cmpexpr(int i) {
			return getRuleContext(CmpexprContext.class,i);
		}
		public List<SumTermContext> sumTerm() {
			return getRuleContexts(SumTermContext.class);
		}
		public SumTermContext sumTerm(int i) {
			return getRuleContext(SumTermContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AndlogicexprContext andlogicexpr() {
			return getRuleContext(AndlogicexprContext.class,0);
		}
		public AndlogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andlogicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndlogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndlogicexpr(this);
		}
	}

	public final AndlogicexprContext andlogicexpr() throws RecognitionException {
		return andlogicexpr(0);
	}

	private AndlogicexprContext andlogicexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndlogicexprContext _localctx = new AndlogicexprContext(_ctx, _parentState);
		AndlogicexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_andlogicexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(245);
				cmpexpr();
				}
				break;
			case 2:
				{
				setState(246);
				sumTerm(0);
				}
				break;
			case 3:
				{
				setState(247);
				product(0);
				}
				break;
			case 4:
				{
				setState(248);
				atom();
				}
				break;
			}
			setState(251);
			match(T__23);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(252);
				cmpexpr();
				}
				break;
			case 2:
				{
				setState(253);
				sumTerm(0);
				}
				break;
			case 3:
				{
				setState(254);
				product(0);
				}
				break;
			case 4:
				{
				setState(255);
				atom();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndlogicexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andlogicexpr);
					setState(258);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(259);
					match(T__23);
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(260);
						cmpexpr();
						}
						break;
					case 2:
						{
						setState(261);
						sumTerm(0);
						}
						break;
					case 3:
						{
						setState(262);
						product(0);
						}
						break;
					case 4:
						{
						setState(263);
						atom();
						}
						break;
					}
					}
					} 
				}
				setState(270);
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

	public static class CmpexprContext extends ParserRuleContext {
		public List<SumTermContext> sumTerm() {
			return getRuleContexts(SumTermContext.class);
		}
		public SumTermContext sumTerm(int i) {
			return getRuleContext(SumTermContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public CmpexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCmpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCmpexpr(this);
		}
	}

	public final CmpexprContext cmpexpr() throws RecognitionException {
		CmpexprContext _localctx = new CmpexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmpexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271);
				sumTerm(0);
				}
				break;
			case 2:
				{
				setState(272);
				product(0);
				}
				break;
			case 3:
				{
				setState(273);
				atom();
				}
				break;
			}
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(277);
				sumTerm(0);
				}
				break;
			case 2:
				{
				setState(278);
				product(0);
				}
				break;
			case 3:
				{
				setState(279);
				atom();
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

	public static class SumTermContext extends ParserRuleContext {
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public SumTermContext sumTerm() {
			return getRuleContext(SumTermContext.class,0);
		}
		public SumTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSumTerm(this);
		}
	}

	public final SumTermContext sumTerm() throws RecognitionException {
		return sumTerm(0);
	}

	private SumTermContext sumTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumTermContext _localctx = new SumTermContext(_ctx, _parentState);
		SumTermContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_sumTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(283);
				product(0);
				}
				break;
			case 2:
				{
				setState(284);
				atom();
				}
				break;
			}
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(288);
				product(0);
				}
				break;
			case 2:
				{
				setState(289);
				atom();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumTermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumTerm);
					setState(292);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(293);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(294);
						product(0);
						}
						break;
					case 2:
						{
						setState(295);
						atom();
						}
						break;
					}
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ProductContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		return product(0);
	}

	private ProductContext product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProductContext _localctx = new ProductContext(_ctx, _parentState);
		ProductContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_product, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			atom();
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProductContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_product);
					setState(308);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(309);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(310);
					atom();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class CallListContext extends ParserRuleContext {
		public RightvalueContext rightvalue() {
			return getRuleContext(RightvalueContext.class,0);
		}
		public CallListContext callList() {
			return getRuleContext(CallListContext.class,0);
		}
		public CallListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCallList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCallList(this);
		}
	}

	public final CallListContext callList() throws RecognitionException {
		CallListContext _localctx = new CallListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callList);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				rightvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				rightvalue();
				setState(318);
				match(T__15);
				setState(319);
				callList();
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

	public static class AtomContext extends ParserRuleContext {
		public Token id;
		public Token met;
		public TerminalNode Integer() { return getToken(MiniJavaParser.Integer, 0); }
		public TerminalNode BoolValue() { return getToken(MiniJavaParser.BoolValue, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonBaseContext nonBase() {
			return getRuleContext(NonBaseContext.class,0);
		}
		public CallListContext callList() {
			return getRuleContext(CallListContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(BoolValue);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				array();
				setState(326);
				match(T__31);
				setState(327);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				array();
				setState(330);
				match(T__8);
				setState(331);
				atom();
				setState(332);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				((AtomContext)_localctx).id = match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(T__6);
				setState(336);
				expression();
				setState(337);
				match(T__10);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				nonBase(0);
				setState(340);
				match(T__31);
				setState(341);
				((AtomContext)_localctx).met = match(Identifier);
				setState(342);
				match(T__6);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__33) | (1L << This) | (1L << New) | (1L << BoolValue) | (1L << Identifier) | (1L << Integer))) != 0)) {
					{
					setState(343);
					callList();
					}
				}

				setState(346);
				match(T__10);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(348);
				match(T__33);
				setState(349);
				atom();
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

	public static class NonBaseContext extends ParserRuleContext {
		public Token id;
		public Token nid;
		public Token met;
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode This() { return getToken(MiniJavaParser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode New() { return getToken(MiniJavaParser.New, 0); }
		public NonBaseContext nonBase() {
			return getRuleContext(NonBaseContext.class,0);
		}
		public CallListContext callList() {
			return getRuleContext(CallListContext.class,0);
		}
		public NonBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNonBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNonBase(this);
		}
	}

	public final NonBaseContext nonBase() throws RecognitionException {
		return nonBase(0);
	}

	private NonBaseContext nonBase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonBaseContext _localctx = new NonBaseContext(_ctx, _parentState);
		NonBaseContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_nonBase, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(353);
				((NonBaseContext)_localctx).id = match(Identifier);
				}
				break;
			case This:
				{
				setState(354);
				match(This);
				}
				break;
			case T__6:
				{
				setState(355);
				match(T__6);
				setState(356);
				expression();
				setState(357);
				match(T__10);
				}
				break;
			case New:
				{
				setState(359);
				match(New);
				setState(360);
				((NonBaseContext)_localctx).nid = match(Identifier);
				setState(361);
				match(T__6);
				setState(362);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonBaseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonBase);
					setState(365);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(366);
					match(T__31);
					setState(367);
					((NonBaseContext)_localctx).met = match(Identifier);
					setState(368);
					match(T__6);
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__33) | (1L << This) | (1L << New) | (1L << BoolValue) | (1L << Identifier) | (1L << Integer))) != 0)) {
						{
						setState(369);
						callList();
						}
					}

					setState(372);
					match(T__10);
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class RightvalueContext extends ParserRuleContext {
		public NonBaseContext nonBase() {
			return getRuleContext(NonBaseContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterRightvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitRightvalue(this);
		}
	}

	public final RightvalueContext rightvalue() throws RecognitionException {
		RightvalueContext _localctx = new RightvalueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rightvalue);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				nonBase(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				expression();
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

	public static class ArrayContext extends ParserRuleContext {
		public Token id;
		public Token met;
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public NonBaseContext nonBase() {
			return getRuleContext(NonBaseContext.class,0);
		}
		public CallListContext callList() {
			return getRuleContext(CallListContext.class,0);
		}
		public TerminalNode New() { return getToken(MiniJavaParser.New, 0); }
		public TerminalNode Int() { return getToken(MiniJavaParser.Int, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				((ArrayContext)_localctx).id = match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				nonBase(0);
				setState(385);
				match(T__31);
				setState(386);
				((ArrayContext)_localctx).met = match(Identifier);
				setState(387);
				match(T__6);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__33) | (1L << This) | (1L << New) | (1L << BoolValue) | (1L << Identifier) | (1L << Integer))) != 0)) {
					{
					setState(388);
					callList();
					}
				}

				setState(391);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(New);
				setState(394);
				match(Int);
				setState(395);
				match(T__8);
				setState(396);
				expression();
				setState(397);
				match(T__9);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return logicexpr_sempred((LogicexprContext)_localctx, predIndex);
		case 17:
			return andlogicexpr_sempred((AndlogicexprContext)_localctx, predIndex);
		case 19:
			return sumTerm_sempred((SumTermContext)_localctx, predIndex);
		case 20:
			return product_sempred((ProductContext)_localctx, predIndex);
		case 23:
			return nonBase_sempred((NonBaseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicexpr_sempred(LogicexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andlogicexpr_sempred(AndlogicexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumTerm_sempred(SumTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean product_sempred(ProductContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nonBase_sempred(NonBaseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0194\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\7\5b\n"+
		"\5\f\5\16\5e\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\7\6"+
		"s\n\6\f\6\16\6v\13\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0097\n\t\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d7\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00e7\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\7"+
		"\22\u00f2\n\22\f\22\16\22\u00f5\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00fc"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0103\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u010b\n\23\7\23\u010d\n\23\f\23\16\23\u0110\13\23\3\24\3\24"+
		"\3\24\5\24\u0115\n\24\3\24\3\24\3\24\3\24\5\24\u011b\n\24\3\25\3\25\3"+
		"\25\5\25\u0120\n\25\3\25\3\25\3\25\5\25\u0125\n\25\3\25\3\25\3\25\3\25"+
		"\5\25\u012b\n\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u013a\n\26\f\26\16\26\u013d\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u015b\n\30\3\30\3\30\3\30\3\30\5\30\u0161\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016e\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0175\n\31\3\31\7\31\u0178\n\31\f\31\16\31\u017b\13\31"+
		"\3\32\3\32\3\32\5\32\u0180\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0188"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0192\n\33\3\33\2\7"+
		"\"$(*\60\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2"+
		"\5\3\2\33\35\3\2\36\37\3\2 !\u01c3\2\66\3\2\2\2\48\3\2\2\2\6A\3\2\2\2"+
		"\bS\3\2\2\2\nh\3\2\2\2\f\u008a\3\2\2\2\16\u008c\3\2\2\2\20\u0096\3\2\2"+
		"\2\22\u00a6\3\2\2\2\24\u00a8\3\2\2\2\26\u00af\3\2\2\2\30\u00b5\3\2\2\2"+
		"\32\u00bd\3\2\2\2\34\u00c3\3\2\2\2\36\u00c8\3\2\2\2 \u00d6\3\2\2\2\"\u00d8"+
		"\3\2\2\2$\u00f6\3\2\2\2&\u0114\3\2\2\2(\u011c\3\2\2\2*\u0131\3\2\2\2,"+
		"\u0143\3\2\2\2.\u0160\3\2\2\2\60\u016d\3\2\2\2\62\u017f\3\2\2\2\64\u0191"+
		"\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\28<\5\6\4\29;\5\b\5\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\5\3\2\2\2AB"+
		"\7\3\2\2BC\7)\2\2CD\7\4\2\2DE\7\5\2\2EF\7\6\2\2FG\7\7\2\2GH\7\b\2\2HI"+
		"\7\t\2\2IJ\7\n\2\2JK\7\13\2\2KL\7\f\2\2LM\7)\2\2MN\7\r\2\2NO\7\4\2\2O"+
		"P\5\22\n\2PQ\7\16\2\2QR\7\16\2\2R\7\3\2\2\2ST\7\3\2\2TW\7)\2\2UV\7\17"+
		"\2\2VX\7)\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\7\4\2\2Z\\\5\16\b\2[Z\3"+
		"\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\n\6\2a`"+
		"\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\16\2\2"+
		"g\t\3\2\2\2hi\7\5\2\2ij\5\20\t\2jk\7)\2\2km\7\t\2\2ln\5\f\7\2ml\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2op\7\r\2\2pt\7\4\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\5\22\n\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\20\2\2~\177\5\62\32"+
		"\2\177\u0080\7\21\2\2\u0080\u0081\7\16\2\2\u0081\13\3\2\2\2\u0082\u0083"+
		"\5\20\t\2\u0083\u0084\7)\2\2\u0084\u008b\3\2\2\2\u0085\u0086\5\20\t\2"+
		"\u0086\u0087\7)\2\2\u0087\u0088\7\22\2\2\u0088\u0089\5\f\7\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0085\3\2\2\2\u008b\r\3\2\2\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008e\7)\2\2\u008e\u008f\7\21\2\2\u008f\17\3\2\2"+
		"\2\u0090\u0091\7\'\2\2\u0091\u0092\7\13\2\2\u0092\u0097\7\f\2\2\u0093"+
		"\u0097\7\23\2\2\u0094\u0097\7\'\2\2\u0095\u0097\7)\2\2\u0096\u0090\3\2"+
		"\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\21\3\2\2\2\u0098\u009c\7\4\2\2\u0099\u009b\5\22\n\2\u009a\u0099\3\2\2"+
		"\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a7\7\16\2\2\u00a0\u00a7\5\30\r\2"+
		"\u00a1\u00a7\5\32\16\2\u00a2\u00a7\5\26\f\2\u00a3\u00a7\5\34\17\2\u00a4"+
		"\u00a7\5\36\20\2\u00a5\u00a7\5\24\13\2\u00a6\u0098\3\2\2\2\u00a6\u00a0"+
		"\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\24\2"+
		"\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad"+
		"\5\22\n\2\u00ad\u00ae\b\13\1\2\u00ae\25\3\2\2\2\u00af\u00b0\7\25\2\2\u00b0"+
		"\u00b1\7\t\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7\21"+
		"\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8"+
		"\5 \21\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\26\2\2"+
		"\u00bb\u00bc\5\22\n\2\u00bc\31\3\2\2\2\u00bd\u00be\7\27\2\2\u00be\u00bf"+
		"\7\t\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5\22\n\2"+
		"\u00c2\33\3\2\2\2\u00c3\u00c4\7)\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6"+
		"\5\62\32\2\u00c6\u00c7\7\21\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7)\2\2\u00c9"+
		"\u00ca\7\13\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7"+
		"\30\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7\21\2\2\u00cf\37\3\2\2\2\u00d0"+
		"\u00d7\5\"\22\2\u00d1\u00d7\5$\23\2\u00d2\u00d7\5&\24\2\u00d3\u00d7\5"+
		"(\25\2\u00d4\u00d7\5*\26\2\u00d5\u00d7\5.\30\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00de\b\22\1\2\u00d9\u00df"+
		"\5$\23\2\u00da\u00df\5&\24\2\u00db\u00df\5(\25\2\u00dc\u00df\5*\26\2\u00dd"+
		"\u00df\5.\30\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e6\7\31\2\2\u00e1\u00e7\5$\23\2\u00e2\u00e7\5&\24\2\u00e3\u00e7\5"+
		"(\25\2\u00e4\u00e7\5*\26\2\u00e5\u00e7\5.\30\2\u00e6\u00e1\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00f3\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9\u00ef\7\31\2\2\u00ea"+
		"\u00f0\5$\23\2\u00eb\u00f0\5&\24\2\u00ec\u00f0\5(\25\2\u00ed\u00f0\5*"+
		"\26\2\u00ee\u00f0\5.\30\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00e8\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb\b\23\1\2"+
		"\u00f7\u00fc\5&\24\2\u00f8\u00fc\5(\25\2\u00f9\u00fc\5*\26\2\u00fa\u00fc"+
		"\5.\30\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0102\7\32\2\2\u00fe\u0103\5"+
		"&\24\2\u00ff\u0103\5(\25\2\u0100\u0103\5*\26\2\u0101\u0103\5.\30\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\u010e\3\2\2\2\u0104\u0105\f\4\2\2\u0105\u010a\7\32\2\2\u0106"+
		"\u010b\5&\24\2\u0107\u010b\5(\25\2\u0108\u010b\5*\26\2\u0109\u010b\5."+
		"\30\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u0104\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f%\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0115\5(\25\2\u0112\u0115\5*\26\2\u0113\u0115\5.\30\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u011a\t\2\2\2\u0117\u011b\5(\25\2\u0118\u011b\5*\26\2\u0119"+
		"\u011b\5.\30\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\'\3\2\2\2\u011c\u011f\b\25\1\2\u011d\u0120\5*\26\2\u011e\u0120"+
		"\5.\30\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0124\t\3\2\2\u0122\u0125\5*\26\2\u0123\u0125\5.\30\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0123\3\2\2\2\u0125\u012e\3\2\2\2\u0126\u0127\f\4\2\2\u0127"+
		"\u012a\t\3\2\2\u0128\u012b\5*\26\2\u0129\u012b\5.\30\2\u012a\u0128\3\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0126\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f)\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0132\b\26\1\2\u0132\u0133\5.\30\2\u0133\u0134"+
		"\t\4\2\2\u0134\u0135\5.\30\2\u0135\u013b\3\2\2\2\u0136\u0137\f\4\2\2\u0137"+
		"\u0138\t\4\2\2\u0138\u013a\5.\30\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c+\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u0144\5\62\32\2\u013f\u0140\5\62\32\2\u0140\u0141\7\22"+
		"\2\2\u0141\u0142\5,\27\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0144-\3\2\2\2\u0145\u0161\7*\2\2\u0146\u0161\7(\2\2\u0147"+
		"\u0148\5\64\33\2\u0148\u0149\7\"\2\2\u0149\u014a\7#\2\2\u014a\u0161\3"+
		"\2\2\2\u014b\u014c\5\64\33\2\u014c\u014d\7\13\2\2\u014d\u014e\5.\30\2"+
		"\u014e\u014f\7\f\2\2\u014f\u0161\3\2\2\2\u0150\u0161\7)\2\2\u0151\u0152"+
		"\7\t\2\2\u0152\u0153\5 \21\2\u0153\u0154\7\r\2\2\u0154\u0161\3\2\2\2\u0155"+
		"\u0156\5\60\31\2\u0156\u0157\7\"\2\2\u0157\u0158\7)\2\2\u0158\u015a\7"+
		"\t\2\2\u0159\u015b\5,\27\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\7\r\2\2\u015d\u0161\3\2\2\2\u015e\u015f\7$"+
		"\2\2\u015f\u0161\5.\30\2\u0160\u0145\3\2\2\2\u0160\u0146\3\2\2\2\u0160"+
		"\u0147\3\2\2\2\u0160\u014b\3\2\2\2\u0160\u0150\3\2\2\2\u0160\u0151\3\2"+
		"\2\2\u0160\u0155\3\2\2\2\u0160\u015e\3\2\2\2\u0161/\3\2\2\2\u0162\u0163"+
		"\b\31\1\2\u0163\u016e\7)\2\2\u0164\u016e\7%\2\2\u0165\u0166\7\t\2\2\u0166"+
		"\u0167\5 \21\2\u0167\u0168\7\r\2\2\u0168\u016e\3\2\2\2\u0169\u016a\7&"+
		"\2\2\u016a\u016b\7)\2\2\u016b\u016c\7\t\2\2\u016c\u016e\7\r\2\2\u016d"+
		"\u0162\3\2\2\2\u016d\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0169\3\2"+
		"\2\2\u016e\u0179\3\2\2\2\u016f\u0170\f\4\2\2\u0170\u0171\7\"\2\2\u0171"+
		"\u0172\7)\2\2\u0172\u0174\7\t\2\2\u0173\u0175\5,\27\2\u0174\u0173\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7\r\2\2\u0177"+
		"\u016f\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\61\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0180\5\60\31\2\u017d"+
		"\u0180\5\64\33\2\u017e\u0180\5 \21\2\u017f\u017c\3\2\2\2\u017f\u017d\3"+
		"\2\2\2\u017f\u017e\3\2\2\2\u0180\63\3\2\2\2\u0181\u0192\7)\2\2\u0182\u0183"+
		"\5\60\31\2\u0183\u0184\7\"\2\2\u0184\u0185\7)\2\2\u0185\u0187\7\t\2\2"+
		"\u0186\u0188\5,\27\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\7\r\2\2\u018a\u0192\3\2\2\2\u018b\u018c\7&\2\2\u018c"+
		"\u018d\7\'\2\2\u018d\u018e\7\13\2\2\u018e\u018f\5 \21\2\u018f\u0190\7"+
		"\f\2\2\u0190\u0192\3\2\2\2\u0191\u0181\3\2\2\2\u0191\u0182\3\2\2\2\u0191"+
		"\u018b\3\2\2\2\u0192\65\3\2\2\2&<W]cmtz\u008a\u0096\u009c\u00a6\u00d6"+
		"\u00de\u00e6\u00ef\u00f3\u00fb\u0102\u010a\u010e\u0114\u011a\u011f\u0124"+
		"\u012a\u012e\u013b\u0143\u015a\u0160\u016d\u0174\u0179\u017f\u0187\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}