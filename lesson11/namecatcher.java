package lesson11;

import java.util.ArrayList;

public class namecatcher {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String searchName = "Bob";
        names.forEach((name) -> {
            if (name.equals(searchName)) {
                System.out.println("Found: " + name);
            }
        });
    }
}
