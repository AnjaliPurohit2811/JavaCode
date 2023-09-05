import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args)
    {
        byte x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextByte();
        y = input.nextByte();

        System.out.println("Before swapping x=");
        System.out.println(x);
        System.out.println("Before swapping y=");
        System.out.println(y);

        x = (byte)  (x+y);
        y = (byte)  (x-y);
        x = (byte)  (x-y);

        System.out.println("After swapping x=");
        System.out.println(x);
        System.out.println("After swapping y=");
        System.out.println(y);
    }
}