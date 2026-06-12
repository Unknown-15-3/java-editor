package lesson4;

public class Stringmethodsinjava {
    public static void main(String[] args){
        String first="Cod";
        String second="ingal";
        String codingal=first+second;
        String codingaltrick="welcome"+"to"+"condingal";
        String codingalcapital= codingal.toUpperCase();
        String codingalsmall= codingal.toLowerCase();

        int lenghtofcodingal= codingal.length();
        int lenghtofcodingaltrick= codingaltrick.length();
        int sum = lenghtofcodingal + lenghtofcodingaltrick;

        System.out.println(codingal);
        System.out.println(codingaltrick);
        System.out.println(codingalcapital);
        System.out.println(codingalsmall);
        System.out.println(sum);
    }
    
}
