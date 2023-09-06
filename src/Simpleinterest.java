import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args)
    {
        short p,si;
        byte r,t;

        Scanner input = new Scanner(System.in);

        System.out.println("price=");
        p= input.nextShort();
        System.out.println("rate=");
        r= input.nextByte();
        System.out.println("time=");
        t= input.nextByte();

        si= (short) ((p*r*t)/100);
        System.out.println("simple interest=");
        System.out.println(si);

    }
}