package lesson6;

class parent{
    public void sayHello(){
        System.out.println("Hello from parent class");
    }
}

class child extends parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from child class");
    }
}

public class OR {
    public static void main(String[] args){
        parent p = new child();
        p.sayHello();


    }
}
