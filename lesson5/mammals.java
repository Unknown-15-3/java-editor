package lesson5;

class mam{
    mam(){
        System.out.println("Inside Mammal class");
    }
}

class Lion extends mam{
    Lion(){
        System.out.println("Inside Lion class");
    }
}

class humans extends mam{
    humans(){
        System.out.println("Inside human class");
    }
}
public class mammals {
    
    public static void main(String[] args){
        Lion obj = new Lion();
        obj.mam();
        obj.Lion();
        obj.humans();
    }
}
