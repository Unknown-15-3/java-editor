package lesson9;

interface face{
    public void method1();
    public void mehtod2();
}

class MyInterface implements face{

    public void method1() {
    System.out.println("implemention method 1");
    }

    public void mehtod2() {
    System.out.println("implemention method 2");
    
    }

    public static void main(String args[]) {
        MyInterface obj = new MyInterface();
        obj.method1();
        obj.mehtod2();
    }
}
