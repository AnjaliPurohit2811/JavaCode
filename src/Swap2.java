import java.util.Scanner;

public class Swap2
{
    public static void main(String[] args)
    {
        byte x,y,z;
        Scanner input = new Scanner(System.in);
        x = input.nextByte();
        y = input.nextByte();

        System.out.println("Before swapping x=");
        System.out.println(x);
        System.out.println("Before swapping y=");
        System.out.println(y);

        z = (byte)  x;
        x = (byte)  y;
        y = (byte)  z;

        System.out.println("After swapping x=");
        System.out.println(x);
        System.out.println("After swapping y=");
        System.out.println(y);
    }
}