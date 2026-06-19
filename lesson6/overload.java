package lesson6;

class student{
    int id;
    String name;
    float stipends;

    student(){}

    student(int id,String name){
        this.id = id;
        this.name=name;
        }
    student(int id, String name, float stipends){
        this.id = id;
        this.name=name;
        this.stipends=stipends;
    }



void displaydetails(){
    System.out.println(this.id+ "|" + this.name + "|" + this.stipends);
}

}
public class overload {
    
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student( 222, "Alice");
        student s3 = new student(223, "bob", 34530);
        s1.displaydetails();
        s2.displaydetails();
        s3.displaydetails();
    }
}
