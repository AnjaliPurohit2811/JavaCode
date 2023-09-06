import java.util.Scanner;

public class Perimeterofcircle {
    public static void main(String[] args)
    {
        byte radius;
        float pi=3.14F,a;

        Scanner input = new Scanner(System.in);

        System.out.println("radius=");
        radius= input.nextByte();

        a= (float) (2*3.14*radius);
        System.out.println("perimeter of circle=");
        System.out.println(a);

    }
}