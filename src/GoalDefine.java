import java.util.TreeMap;

public class GoalDefine {

	public String mainClassName;
	public TreeMap<String, ClassDefine> classes;

	public GoalDefine() {
		mainClassName = "";
		classes = new TreeMap<String, ClassDefine>();
	}

	public void addClass(ClassDefine classObject) {
		classes.put(classObject.className, classObject);
	}
	
	public boolean containClass(String className) {
		return classes.containsKey(className);
	}
	
}
