
import java.util.Scanner;
class evenodd 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Value: ");
	int a=sc.nextInt();
	String num=a%2==0?"EVEN":"ODD";
	System.out.println("NUMBER IS "+num);
	}
}
