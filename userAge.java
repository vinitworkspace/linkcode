import java.util.Scanner;
public class userAge {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible to vote!");
        }
        else
        {
            System.out.println("!! You are Not eligible to vote !!");
        }
    }
}
