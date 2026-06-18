package lesson5;

class Parent{
    int age, id;
    String name;
    void naming(String name){
        System.out.println("Name: " + name);
    }
}

class Child extends Parent{
    void ageN(int age){
        System.out.println("Age of student" + age);
    }
}

public class Student {

    public static void main(String[] args){
        Child s= new Child();
        s.naming("John");
        s.ageN(20);
    }
    
}
