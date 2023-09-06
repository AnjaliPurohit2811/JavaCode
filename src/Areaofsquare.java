import java.util.Scanner;

public class Areaofsquare {
    public static void main(String[] args)
    {
        byte length;
        float a;
        Scanner input = new Scanner(System.in);

        System.out.println("Area of square=");
        length= input.nextByte();
        a= length*length;
        System.out.println("area of the square=");
        System.out.println(a);

    }
}