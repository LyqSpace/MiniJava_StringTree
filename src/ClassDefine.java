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
	
	public void addMethod(MethodDefine type, String name) {
		methods.put(name, type);
	}
}
