package lesson9;

interface vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class bicycle implements vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("speed: " + speed + "gear: " +  gear);
    }
}

class car implements vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
    
}

public class Veh{
    public static void main(String args[]){
        bicycle bicycle = new bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(5);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle print state");
        bicycle.printStates();
        car car = new car();
         car.changeGear(3);
         car.speedUp(5);
         car.applyBrakes(3);
         System.out.println("Car print state");
         car.printStates();
    }
}