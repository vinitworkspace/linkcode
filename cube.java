import java.util.Scanner;
class cube
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		int number=sc.nextInt();

		int square=number*number*number;

		System.out.println("SQUARE OF NUMBER "+number+" IS "+square);
	}
}
