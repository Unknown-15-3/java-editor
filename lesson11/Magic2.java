package lesson11;

import java.util.ArrayList;

public class Magic2 {
    public static void main(String[] args){

        System.out.println("----lamdass----");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(21);
        numbers.add(49);

        numbers.forEach((x) -> {
            System.out.println(x);
        });
        numbers.forEach(n ->{if (n == 49)
            System.out.println("found 49");
        });
    }
}
