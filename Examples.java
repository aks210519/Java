import java.sql.SQLOutput;
import java.util.Scanner;


//Input:
//Enter the first number: 10
//Enter the second number: 25
//Enter the third number: 15
//
//Output:
//The largest number is: 25

public class Examples {

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number:");
       int a=sc.nextInt();
       System.out.println("Enter the Second number:");
       int b=sc.nextInt();
       System.out.println("Enter the Third number:");
       int c =sc.nextInt();
       if(a>=b && a>=c){
           System.out.println("The largest number is:"+" "+a);
       }

       else if (b>=a && b>=c) {
           System.out.println("The largest number is:"+" "+b);
       }

       else{
           System.out.println("The largest number is:"+" "+c);
       }


   }
}
