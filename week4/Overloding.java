class Calculator {
    // Sum of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Sum of double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.add(2, 3));
        System.out.println("Sum (double, double): " + calc.add(2.5, 3.5));
    }
}
