import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args)
    {
        byte height;
       byte width;
       byte a;
        Scanner input = new Scanner(System.in);

        System.out.println("height=");
        height= input.nextByte();
        System.out.println("width=");
        width= input.nextByte();
        a= (byte) (width * height);
        System.out.println("area of the rectangle=");
        System.out.println(a);

    }
}