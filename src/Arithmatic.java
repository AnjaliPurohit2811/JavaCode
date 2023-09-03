import java.util.Scanner;

public class Arithmatic {
     public static void main(String[] args) {

         byte num1 , num2;
         byte sum,sub,multi,div,mod=0;
         Scanner input = new Scanner(System.in);
         System.out.println("enter the num1=");
         num1 = input.nextByte();
         System.out.println("enter the num2=");
         num2 = input.nextByte();

         System.out.println("num1 + num2 = " + (num1 + num2));
         System.out.println("num1 - num2 = " + (num1 - num2));
         System.out.println("num1 * num2 = " + (num1 * num2));
         System.out.println("num1 / num2 = " + (num1 / num2));
         System.out.println("num1 % num2 = " + (num1 % num2));

     }
}