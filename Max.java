
import java.util.Scanner;
class Max 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Values: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int max=a>b?a:b;
	System.out.println("MAX IS "+max);
	}
}
