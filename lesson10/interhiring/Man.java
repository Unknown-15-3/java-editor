package lesson10.interhiring;

import java.util.Scanner;

public class Man {

    public static candidate getcandidateDetails() throws invalid{
        Scanner s = new Scanner(System.in);
        System.out.println("Name");
        String name = s.next();
        System.out.println("Gender");
        String gender = s.next();
        System.out.println("Enter percentage of 10th");
        int percentage10 = s.nextInt();
        if (percentage10 < 50){
            throw new invalid("failed to complete");
        } else{
            candidate c = new candidate();
            c.setName(name);
            c.setGender(gender);
            c.setPercentage10(percentage10);
            return c;
        }
    }
    
    public static void main(String[] args){
    System.out.println("Welcome to the company hiring process");
        try{
            candidate can = getcandidateDetails();
            System.out.println("Welcome to the company hiring process");
        } catch (invalid e) {
            System.out.println(e.getMessage());
        }
    }
}    
