package lesson7;

class student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class getset {

    public static void main(String[] args){
        student s = new student();
        s.setName("Daniel Riddler");
        System.out.println(s.getName());
    }
    
}
