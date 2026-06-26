package arrat;

class subject{
    String name;
    int numb=100;
    public subject(String name, int numb){
        this.name = name;
        this.numb = numb;
    }
}

public class semister {
    
    public static void main(String[] args){
        subject s1 = new subject("Maths", 76);
        subject s2 = new subject("science", 78);
        subject s3 = new subject("english", 67);
        subject s4 = new subject("Social science", 81);
        subject s5 = new subject("Hindi", 51);
        subject s6 = new subject("A.I",90);
        System.out.println(s1.name + "|" + s1.numb);
        System.out.println(s2.name + "|" + s2.numb);
        System.out.println(s3.name + "|" + s3.numb);
        System.out.println(s4.name + "|" + s4.numb);
        System.out.println(s5.name + "|" + s5.numb);
        System.out.println(s6.name + "|" + s6.numb);
    }
}
