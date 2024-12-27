import java.util.Scanner;

public class Votiing {
    int serialNum;
    String Name;
    int age;
    char gender;
    public void voterEligibility(){
        if (age>=18){
            System.out.println(Name+" "+"You can vote");
        }
        else{
            System.out.println(Name+" "+"You cannot vote");

        }
    }
    public static void main(String[] args){
    Votiing p1 = new Votiing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
       p1.Name= sc.next();
        System.out.println("Enter your Age: ");
        p1.age=sc.nextInt();
        System.out.println("Enter your gender: ");
        p1.gender=sc.next().charAt(0);




        p1.voterEligibility();

    }
}
