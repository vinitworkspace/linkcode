import java.util.Scanner;
public class MarriageAge {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Age: ");
    int age=sc.nextInt();

    if(age>=21)
    {
        System.out.println("Oh Shit!!! You are eligible to marry");
    }
    else
    {
        System.out.println("Hoorayyy!!!  You are not eligible to marry");
    }
    }
}
