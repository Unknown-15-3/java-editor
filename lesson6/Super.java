package lesson6;

class superclass{
    int number = 56;
}

class Subclass extends superclass{
    int number = 78;

    void printnumber(){
        System.out.println(super.number);
    }
}

public class Super {
    
    public static void main(String[] args){
        Subclass obj = new Subclass();
        obj.printnumber();
    }
}
