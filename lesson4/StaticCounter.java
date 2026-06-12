package lesson4;

class Counter{
    static int number=10;
    void increment(){
        number=number+1;
    }

public static void main(String[] args){
    Counter ob1= new Counter();
    Counter ob2= new Counter();
    Counter ob3= new Counter();

    ob1.increment();
    ob2.increment();
    ob3.increment();
    System.out.println(ob1.number);
    System.out.println(ob2.number);
    System.out.println(ob3.number);
}
}