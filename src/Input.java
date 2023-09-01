import java.util.Scanner;

public class Input
{
    public static void main(String[]args)
    {
        String name;
        byte age;
        long phn;
        String edu;
        String fn;
        String mn;
        long bd;
        String lang;



        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name=");
        name = input.nextLine();

        System.out.println("Enter the age=");
        age = input.nextByte();

        System.out.println("Enter the phone number=");
        phn = input.nextLong();

        System.out.println("Degree=");
        edu = input.next();

        System.out.println("Father name=");
        fn = input.next();

        System.out.println("Mother Name=");
        mn = input.next();

        System.out.println("Enter the Birth date=");
        bd = input.nextLong();

        System.out.println("Known language=");
        lang = input.nextLine();







    }
}