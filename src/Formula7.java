import java.util.Scanner;

public class Formula7 {
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

        a= (short) ((x*x) + (y*y) + (z*z) + (2*(x*y)+(y*z)+(z*x)));
        System.out.println("(x+y+z)^2=");
        System.out.println(a);
    }
}