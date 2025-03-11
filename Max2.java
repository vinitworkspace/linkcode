
import java.util.Scanner;
class Max2 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Five Values: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int max=a>b&&a>c&&a>d&&a>e?a:(b>c&&b>d&&b>e?b:(c>d&&c>e?c:(d>e?d:e)));
	System.out.println("MAX IS "+max);
	}
}
