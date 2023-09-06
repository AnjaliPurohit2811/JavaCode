import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args)
    {
        byte r;
        float pi= 3.14F,a;
        Scanner input = new Scanner(System.in);

        System.out.println("Area of circle=");
        r= input.nextByte();
        a= pi*r*r;
        System.out.println("area of the circle=");
        System.out.println(a);

    }
}