class LoopDetection {
    public static void main(String[] args) {
    	System.out.println(new ClassC());
    }
} // main

class ClassA extends ClassC {
}

class ClassB extends ClassA {
}

class ClassC extends ClassB {
}