import java.util.TreeMap;

public class ClassDefine {
	
	public String className, paraentClassName;
	public TreeMap<String, String> variables;
	public TreeMap<String, MethodDefine> methods;
	
	public ClassDefine() {
		className = "";
		paraentClassName = "";
		variables = new TreeMap<String, String>();
		methods = new TreeMap<String, MethodDefine>();
	}
	
	public void addVariable(String type, String name) {
		variables.put(name, type);
	}
	
	public void addMethod(MethodDefine methodObject) {
		methods.put(methodObject.methodName, methodObject);
	}
	
	public boolean containMethod(String methodName) {
		return methods.containsKey(methodName);
	}
	
	public boolean containVariable(String variableName) {
		return variables.containsKey(variableName);
	}
}
