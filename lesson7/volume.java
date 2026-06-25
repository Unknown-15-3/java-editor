package lesson7;

class figure{
    public double getVolume(){
        return 0;
    }
}

class cube extends figure{
    private double side;
    public cube(double side){
        this.side = side;
    }
    public double getVolume(){
        return side*side*side;
    }
}

class cylinder extends figure{
    private double radius;
    private double height;

    public cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
}

public class volume {

    public static void main(String[] args){
        figure[] fig = new figure[2];
        fig[0] = new cube(3);
        fig[1] = new cylinder(3, 2);
        System.out.println("Volume of cube: " + fig[0].getVolume());
        System.out.println("Volume of cylinder: " + fig[1].getVolume());
    }
    
}
