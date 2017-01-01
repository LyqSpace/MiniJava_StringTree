class MultipleDefinition {
    public static void main(String[] args) {
    	System.out.println(new ClassC());
    }
} // main

class classA {
	int apple;
	boolean apple; // multiple definition of variables

	public int sum() {
		return 1;
	}
	public boolean sum() { // multiple definition of methods
		return 1;
	}
	public int check(int a, int a) { // multiple definition of parameters
		return 1;
	}
}

class classA { // multiple definition of classes
}