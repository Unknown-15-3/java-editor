package lesson7;

class shape{
    public double getArea(){
        return 0;
    }
}
class triangle extends shape{
    private double base;
    private double height;
    public triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return 0.5 * base * height;
    }
}
class square extends shape{
    private double side;
    public square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
}
public class area {
    public static void main(String[] args){
        shape[] sh=new shape[2];
        sh[0] = new square(5);
        sh[1] = new triangle(2, 2);
        System.out.println("Area of square:" + sh[0].getArea());
        System.out.println("Area of triangle:" + sh[1].getArea());
    }
}
