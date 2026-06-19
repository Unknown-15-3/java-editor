package lesson6;

class parent{
    protected void protect(){
        System.out.println("I am inside protected method");
    }
}

class child extends parent{
    private void privateMethod(){
        System.out.println("I am inside private method");
    }
}
public class access {

    public static void main(String[] args){
        child c = new child();
        c.privateMethod();
        System.out.println("hello world");
    }
    
}
