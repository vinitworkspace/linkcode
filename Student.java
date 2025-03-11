import java.util.Scanner;
class Student
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);

		System.out.println("ENTER YOUR NAME: ");
		String name=sc.nextLine();

		System.out.println("ENTER YOUR ROLL NUMBER: ");
		int rollno=sc.nextInt();

		System.out.println("ENTER YOUR MARKS:");

		System.out.println("ENTER SUB1 MARKS:");
		float sub1=sc.nextFloat();

		System.out.println("ENTER SUB2 MARKS:");
		float sub2=sc.nextFloat();

		System.out.println("ENTER SUB3 MARKS:");
		float sub3=sc.nextFloat();

		System.out.println("ENTER SUB4 MARKS:");
		float sub4=sc.nextFloat();

		System.out.println("ENTER SUB5 MARKS:");
		float sub5=sc.nextFloat();

		float Percentage=(sub1+sub2+sub3+sub4+sub5)/500*100;


		System.out.println("---------------------------------------------------------------");
		System.out.println("MARKS LIST");
		System.out.println("Roll Number:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+Percentage);







	}
}
