package lesson8;

class hs{
    void location(){
        System.out.println("Location is: ");
    }
    void famousfor(){
        System.out.println("Famouse for: ");
    }
}

class manali extends hs{
    void location(){
        System.out.println("Manali is in Himachael Pradesh");
    }
    void famousfor(){
        System.out.println("It is famous for habimta temple and adventure sports");
    }
}
class mussoorie extends hs{
    void location(){
        System.out.println("Mussoorie is in uttrakand");
    }
    void famousfor(){
        System.out.println("Famous for education institutions");
    }
}
class shimla extends hs{
    void location(){
        System.out.println("Shimla is in himachael pradesh");
    }
    void famousfor(){
        System.out.println("For views and nature");
    }
}
public class HillStation {

    public static void main(String[] args){
        
        hs obj = new hs();
        hs obj1 =  new manali();
        hs obj2 = new mussoorie();
        hs obj3 = new shimla();

        obj1.location();
        obj1.famousfor();

        obj2.location();
        obj2.famousfor();

        obj3.location();
        obj3.famousfor();

        obj.location();
        obj.famousfor();
    }

}
