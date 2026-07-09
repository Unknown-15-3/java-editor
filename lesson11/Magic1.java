package lesson11;

import java.util.ArrayList;

public class Magic1 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("cheetah");

        System.out.println("----Printing current list of animals----");
            System.out.println(animals);

        animals.clear();
        System.out.println("----Printing current list of animals after clear()----");
        System.out.println("empty array:" + animals);

        if(animals.isEmpty()){
            System.out.println("Array is empty");
        }
        else{
            System.out.println("Array is not empty");
        }
        animals.add("lion");
        animals.add("tiger");
        animals.add("cheetah");
        System.out.println("The size of array is: " + animals.size());
        System.out.println("adding more elements: " + animals.add("elephant"));
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
    }
}

