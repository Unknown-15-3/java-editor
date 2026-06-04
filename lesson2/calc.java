package lesson2;

public class calc {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int sum= a+b;
        int diff = a-b;
        int mult = a*b;
        int div = a/b;

        String magic= "===MAGIC===";
        System.out.println("===METHOD 1===");
        System.out.println("Addition of a and b is " + sum);
        System.out.println("Subtraction of a and b is " + diff);
        System.out.println("Multiplication of a and b is " + mult);
        System.out.println("Division of a and b is " + div);

        System.out.println("===METHOD 2===");
        System.out.println("Addition of a and b is " + (a+b));
        System.out.println("Subtraction of a and b is " + (a-b));
        System.out.println("Multiplication of a and b is " + (a*b));
        System.out.println("Division of a and b is " + (a/b));
        System.out.println("remainder of a and b is " + (a%b));
        System.out.println(magic);
        System.out.println("Addition " + (a+b) + " subtraction " + (a-b) + " multiplication " + (a*b) + " division " + (a/b));
    }
    
}
