import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args)
    {
        byte b;
        byte h;
        byte a;
        Scanner input = new Scanner(System.in);

        System.out.println("base=");
        b= input.nextByte();
        System.out.println("height=");
        h= input.nextByte();
        a= (byte) ((b*h)/2);
        System.out.println("area of the triangle=");
        System.out.println(a);

    }
}