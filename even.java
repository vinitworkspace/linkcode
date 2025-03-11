import java.util.Scanner;
public class even {
    public static void main(String[]args)
    {
        System.out.println("Enter A Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("EVEN NUMBER!!");
        }
        else
            System.out.println("ODD NUMBER!!");;



    }
}
