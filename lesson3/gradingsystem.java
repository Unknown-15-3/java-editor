package lesson3;

import java.util.*;

public class gradingsystem {
    public static void main(String[] args){
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noofsub= sc.nextInt();
        int marks[]= new int[noofsub];
        System.out.println("Enter the marks of " + noofsub + " subjects. Press enter to give marks of another subject.");
        for(int i = 0; i<noofsub; i++){
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < noofsub; i++){
            sum= sum+marks[i];
        }
        int percentage = sum/noofsub;
        System.out.println(percentage);
        if(percentage>=95){
            result = "You scored grade 0! great work!";
        }else if(percentage>90 && percentage<95){
            result = "You scored grade A! good work!";
        }

        else {
            result = "you passed";
        }
        System.out.println(result);
    }
}
