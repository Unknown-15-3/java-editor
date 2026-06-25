package lesson5;


class BasicCalculator {
    double add(double x, double y) {
        return x + y;
    }

    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return x / y;
    }
}
public class calculator {

    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        double a = 12.5;
        double b = 3.0;

            System.out.println("Basic operations using inheritance:");
            System.out.println(a + " + " + b + " = " + calc.add(a, b));
            System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
            System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
    }
}









