package lesson3;

import java.util.Scanner;

public class hellouser {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello! please enter your name:");
        String name = sc.nextLine();
        System.out.println("enter your lucky number: ");
        int lucky= sc.nextInt();
        System.out.println("Hello! " + name + " your lucky number is " + lucky);
    }
    
}
