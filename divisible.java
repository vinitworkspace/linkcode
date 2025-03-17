import java.util.Scanner;
public class divisible {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number=sc.nextInt();

        if(number%3==0 | number%7==0)
        {
            System.out.println("Number Is Divisible");
        }
        else
        {
            System.out.println("Number Is Not Divisible");
        }
    }
}
