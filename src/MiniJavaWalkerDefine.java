
public class MiniJavaWalkerDefine extends MiniJavaBaseListener {

	GoalDefine goal;
	ClassDefine currentClass;
	MethodDefine currentMethod;
	String location;
	
	@Override
	public void enterGoal(MiniJavaParser.GoalContext ctx) {
		goal = new GoalDefine();
		location = "Goal";
	}

	@Override
	public void exitGoal(MiniJavaParser.GoalContext ctx) {
		ClassExtendLoop.check(goal);
	}

	@Override
	public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
		location = "MainClass";
	}

	@Override
	public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
		location = "Goal";
	}

	@Override
	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		currentClass = new ClassDefine();
		currentClass.className = ctx.name.getText();
		if (ctx.extendName != null) {
			currentClass.paraentClassName = ctx.extendName.getText();
		}
		if (goal.containClass(currentClass.className)) {
			String errorMessage = "Class " + currentClass.className + " has existed!";
			MiniJavaCheck.printError(ctx.name, errorMessage);
		} else {
			goal.addClass(currentClass);
		}
		location = "Class";
	}
	
	@Override
	public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		currentClass = null;
		location = "Goal";
	}
	
	@Override
	public void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
		String variableType = ctx.type.getText();
		String variableName = ctx.name.getText();
		if (location == "Class") { // Class
			if (currentClass.containVariable(variableName)) {
				String errorMessage = "Variable " + variableName + " has existed!";
				MiniJavaCheck.printError(ctx.name, errorMessage);
			} else {
				currentClass.addVariable(variableType, variableName);
			}
		} else { // Method
			if (currentMethod.containVariable(variableName)) {
				String errorMessage = "Variable " + variableName + " has existed!";
				MiniJavaCheck.printError(ctx.name, errorMessage);
			} else {
				currentMethod.addVariable(variableType, variableName);
			}
		}
	}

	@Override
	public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
		currentMethod = new MethodDefine();
		currentMethod.methodName = ctx.name.getText();
		if (currentClass.containMethod(currentMethod.methodName)) {
			String errorMessage = "Method " + currentMethod.methodName + " has existed!";
			MiniJavaCheck.printError(ctx.name, errorMessage);
		} else {
			currentClass.addMethod(currentMethod);
		}
		location = "Method";
	}

	@Override
	public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
		currentMethod = null;
		location = "Class";
	}
	
	@Override
	public void enterParameterList(MiniJavaParser.ParameterListContext ctx) {
		String parameterName = ctx.name.getText();
		String parameterType = ctx.type.getText();
		if (currentMethod.containParameter(parameterName)) {
			String errorMessage = "Parameter " + parameterName + " has existed!";
			MiniJavaCheck.printError(ctx.name, errorMessage);
		} else {
			currentMethod.addParameter(parameterType, parameterName);
		}
	}

}
