import java.util.TreeMap;

public class GoalDefine {

	public String mainClassName;
	public TreeMap<String, ClassDefine> classes;

	public GoalDefine() {
		mainClassName = "";
		classes = new TreeMap<String, ClassDefine>();
	}

	public void addClass(ClassDefine type, String name) {
		classes.put(name, type);
	}
}
