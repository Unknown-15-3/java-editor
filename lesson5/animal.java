package lesson5;

class ani{
    void eat(){
        System.out.println("eating... Animal class... eating method");
    }
}

class Lion extends ani{
    void roar(){
        System.out.println("roar... Lion Class... roar method");
    }
}

class babylion extends Lion{
    void weep(){
        System.out.println("weeping... babylion class... weep method");
    }
}
public class animal {

    public static void main(String[] args){
        babylion obj= new babylion();
        obj.weep();
        obj.eat();
        obj.roar();
    }
    
}
