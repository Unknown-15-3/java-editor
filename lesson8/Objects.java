package lesson8;

abstract class obj{
    abstract void showshape();
    public void shape(){
        System.out.println("I am from abstract class.");
    }
}

class sphere extends obj{
    void showshape(){
        System.out.println("object is sphere");
    }
}

class cuboid extends obj{
    void showshape(){
        System.out.println("object is cuboid");
    }
}

class prism extends obj {
    void showshape() {
        System.out.println("object is prism");
    }
}
public class Objects {

    public static void main(String[] args) {
        obj ob = new sphere();
        ob.showshape();
        ob = new cuboid();
        ob.showshape();
        ob = new prism();
        ob.showshape();
        ob.shape();
    }
    
}
