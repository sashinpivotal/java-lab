package _18_design_patterns.singleton;

class Main {

    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();
        boolean b = (instance1 == instance2);
        System.out.println(b);
    }
}
