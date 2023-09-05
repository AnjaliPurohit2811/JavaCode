import java.util.Scanner;

public class Formula3 {
    public static void main(String[] args)
    {
        short x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of x=");
        x= input.nextShort();
        System.out.println("enter the value of y=");
        y= input.nextShort();

        z= (short) ((x*x*x) + ((3*x*y)*(x+y)) + (y*y*y));
        System.out.println("(x+y)^3=");
        System.out.println(z);
    }
}