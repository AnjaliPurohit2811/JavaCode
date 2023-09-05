import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args)
    {
        short x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of x=");
        x= input.nextShort();
        System.out.println("enter the value of y=");
        y= input.nextShort();

        z= (short) ((x*x) + (2*x*y) + (y*y));
        System.out.println("(x+y)^2=");
        System.out.println(z);
    }
}