package com.example;

// Use static method with no internal state
class Calculator1 {
    public static int add(int x, int y) {
        return x+y;
    }
}

// Use instance method with object-specific state
class Calculator2 {

    int x, y;

    public int add() {
        return x+y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

// Use static method with class-wide state
class Calculator3 {

    static int x, y;

    public static int add() {
        return x+y;
    }
    public static void setX(int x1) {
        x = x1;
    }
    public static void setY(int y1) {
        y = y1;
    }
}

public class Main {
    public static void main(String[] args) {

        // Use static method with no internal state
        int result1 = Calculator1.add(2, 3);
        System.out.println(result1);

        // Use instance method with object-specific state
        Calculator2 calculator2
                = new Calculator2();
        calculator2.setX(2);
        calculator2.setY(3);
        int result2 = calculator2.add();
        System.out.println(result2);

        // Use static method with class-wide state - DON"T DO THIS
        Calculator3.setX(2);
        Calculator3.setY(3);
        int result3 = Calculator3.add();
        System.out.println(result3);

    }
}







