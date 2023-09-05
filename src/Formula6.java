import java.util.Scanner;

public class Formula6 {
    public static void main(String[] args)
    {
        short x,y,z,a;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of x=");
        x= input.nextShort();
        System.out.println("enter the value of y=");
        y= input.nextShort();
        System.out.println("enter the value of z=");
        z= input.nextShort();

        a= (short) ((x*x*x) - (y*y*y) - (z*z*z) - (3*(x+y))+(3*(y+z))+(3*(z+x)));
        System.out.println("(x-y-z)^3=");
        System.out.println(a);
    }
}