import java.util.Scanner;
public class elseif {
    public static void main(String[]args){
        System.out.println("ENTER YOUR MARKS:");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90)
        {
            System.out.println("A+");
        }
        else if(marks>85)
        {
            System.out.println("A");
        }
        else if(marks>80)
        {
            System.out.println("B");
        }
        else if(marks>75)
        {
            System.out.println("C");
        }
        else if(marks>35)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
