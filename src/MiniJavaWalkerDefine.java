

public class MiniJavaWalkerDefine extends MiniJavaBaseListener {

	public GoalDefine goalDefine;
	public ClassDefine currentClass;
	public MethodDefine MethodDefine;
	
	@Override
	public void enterGoal(MiniJavaParser.GoalContext ctx) {
		goalDefine = new GoalDefine();		
	}

	@Override
	public void exitGoal(MiniJavaParser.GoalContext ctx) {
	}

	@Override
	public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
	}

	@Override
	public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
	}

	@Override
	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		currentClass = new ClassDefine();
		currentClass.className = ctx.name.getText();
		if (ctx.extendName != null) {
			currentClass.paraentClassName = ctx.extendName.getText();
		}
		goalDefine.addClass(type, currentClass);
	}
	
	@Override
	public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterType(MiniJavaParser.TypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitType(MiniJavaParser.TypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStatement(MiniJavaParser.StatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStatement(MiniJavaParser.StatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterExpression(MiniJavaParser.ExpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitExpression(MiniJavaParser.ExpressionContext ctx) {
	}
}
