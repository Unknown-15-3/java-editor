package lesson2;

public class mindriddler {

    public static void main(String[] args){

        int a=10;
        int b=5;

        System.out.println("===Guess the answer===");
        System.out.println("unary operator " +(a++));
        System.out.println("unary operator " +(++b));

        System.out.println("binary operator");
        System.out.println("1+2" +1+2);
        System.out.println("1+2" +(1+2));
        System.out.println(1+2 + "=3");
        int increment = ++a*b++;
        System.out.println(increment);

        System.out.println("current value of a " +a);
        System.out.println("current value of b " +b);
        System.out.println("ternary operator");
        int largestnumber = (a>b) ? a : b;
        System.out.println("largest two numbers are " + largestnumber);
    }
    
}
