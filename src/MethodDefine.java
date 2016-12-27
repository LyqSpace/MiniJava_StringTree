import java.util.TreeMap;

public class MethodDefine {

	public String methodName, returnType;
	public TreeMap<String, String> variables;
	public TreeMap<String, String> parameters;

	public MethodDefine() {
		methodName = "";
		returnType = "";
		variables = new TreeMap<String, String>();
		parameters = new TreeMap<String, String>();
	}

	public void addVariable(String type, String name) {
		variables.put(name, type);
	}
}
