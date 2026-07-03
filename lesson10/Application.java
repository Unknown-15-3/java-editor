package lesson10;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter two number");

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = x/y;

            System.out.println("Result: " + z);
        }
        catch(ArithmeticException ex) {
            System.out.println("----catch block----");
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("----finally block----");
            System.out.println("Application design and developed by: ");
            System.out.println("team @ cogingal");
            scanner.close();
        }
        System.out.println("----DONE----");
    }
}
