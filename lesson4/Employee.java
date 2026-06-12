package lesson4;

class Emp{
       int empno;
    String name;
    float sal;

    Emp(){
        System.out.println("*******");
        empno = 1001;
        name= "abc";
        sal = 25565555f;

    }
    void displaydetails(){
        System.out.println(empno + "|" + name + "|" + sal);
    }
}

public class Employee {
    public static void main(String[] args){
        Emp emp1= new Emp();
        Emp emp2 = new Emp();
        Emp emp3 = new Emp();
        emp1.displaydetails();
        emp2.displaydetails();
        emp3.displaydetails();
    }
}
