import java.util.TreeMap;

public class MethodDefine {

	public String methodName;
	public TreeMap<String, String> variables;
	public TreeMap<String, String> parameters;

	public MethodDefine() {
		methodName = "";
		variables = new TreeMap<String, String>();
		parameters = new TreeMap<String, String>();
	}

	public void addVariable(String type, String name) {
		variables.put(name, type);
	}
	
	public boolean containVariable(String name) {
		return variables.containsKey(name);
	}
	
	public void addParameter(String type, String name) {
		parameters.put(name, type);
	}
	
	public boolean containParameter(String name) {
		return parameters.containsKey(name);
	}
	
}
