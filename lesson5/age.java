package lesson5;

public class age {

    int age1;
    age(int age){
        this.age1 = age;
    }
    
    public static void main(String[] args){
        age obj = new age(25);
        System.out.println("obj. age:" + obj.age1);
    }
}
