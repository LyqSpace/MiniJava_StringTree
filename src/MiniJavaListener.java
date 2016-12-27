// Generated from MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#paraList}.
	 * @param ctx the parse tree
	 */
	void enterParaList(MiniJavaParser.ParaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#paraList}.
	 * @param ctx the parse tree
	 */
	void exitParaList(MiniJavaParser.ParaListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeSystem}.
	 * @param ctx the parse tree
	 */
	void enterTypeSystem(MiniJavaParser.TypeSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeSystem}.
	 * @param ctx the parse tree
	 */
	void exitTypeSystem(MiniJavaParser.TypeSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#errorStatements}.
	 * @param ctx the parse tree
	 */
	void enterErrorStatements(MiniJavaParser.ErrorStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#errorStatements}.
	 * @param ctx the parse tree
	 */
	void exitErrorStatements(MiniJavaParser.ErrorStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(MiniJavaParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(MiniJavaParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicexpr(MiniJavaParser.LogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicexpr(MiniJavaParser.LogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#andlogicexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndlogicexpr(MiniJavaParser.AndlogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#andlogicexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndlogicexpr(MiniJavaParser.AndlogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#cmpexpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpexpr(MiniJavaParser.CmpexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#cmpexpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpexpr(MiniJavaParser.CmpexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#sumTerm}.
	 * @param ctx the parse tree
	 */
	void enterSumTerm(MiniJavaParser.SumTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#sumTerm}.
	 * @param ctx the parse tree
	 */
	void exitSumTerm(MiniJavaParser.SumTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(MiniJavaParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(MiniJavaParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#callList}.
	 * @param ctx the parse tree
	 */
	void enterCallList(MiniJavaParser.CallListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#callList}.
	 * @param ctx the parse tree
	 */
	void exitCallList(MiniJavaParser.CallListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MiniJavaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MiniJavaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#nonBase}.
	 * @param ctx the parse tree
	 */
	void enterNonBase(MiniJavaParser.NonBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#nonBase}.
	 * @param ctx the parse tree
	 */
	void exitNonBase(MiniJavaParser.NonBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#rightvalue}.
	 * @param ctx the parse tree
	 */
	void enterRightvalue(MiniJavaParser.RightvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#rightvalue}.
	 * @param ctx the parse tree
	 */
	void exitRightvalue(MiniJavaParser.RightvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MiniJavaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MiniJavaParser.ArrayContext ctx);
}