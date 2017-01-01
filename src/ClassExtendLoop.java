import java.util.Iterator;
import java.util.TreeMap;

public class ClassExtendLoop {
	
	public static boolean check(GoalDefine goal) {
		
		Iterator<String> it = goal.classes.keySet().iterator();
		TreeMap<String, Boolean> classVisited = new TreeMap<String, Boolean>();
		TreeMap<String, Boolean> currentClassVisited;
		
		while (it.hasNext()) {
			
			ClassDefine currentClass = goal.classes.get(it.next());
			if (classVisited.containsKey(currentClass.className)) {
				continue;
			}
			
			ClassDefine lastClass = null;
			String classLoop = "";
			Boolean loopFound = false;
			currentClassVisited = new TreeMap<String, Boolean>();
			
			while (currentClass != null) {
				
				classLoop += currentClass.className;
				currentClassVisited.put(currentClass.className, true);
				classVisited.put(currentClass.className, true);
				
				if (currentClass.paraentClassName == "") break;
				
				if (currentClassVisited.containsKey(currentClass.paraentClassName)) {
					classLoop += ".";
					loopFound = true;
					break;
				} else {
					classLoop += ", ";
				}
				
				if (classVisited.containsKey(currentClass.paraentClassName)) break;
				
				lastClass = currentClass;
				currentClass = goal.classes.get(currentClass.paraentClassName);
				
			}
			
			if (currentClass == null) {
				String errorMessage = "Class inheritance unfound. Unfound class " + lastClass.paraentClassName;
				MiniJavaCheck.printError(null, errorMessage);
			}
			
			if (loopFound) {
				String errorMessage = "Class inheritance loop found. Loop circle: " + classLoop;
				MiniJavaCheck.printError(null, errorMessage);
			}
			
		}
		
		return true;
	}
	
}
