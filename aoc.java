import java.util.Scanner;

class aoc
{
    public static void main(String[]args)
    {
        float pi=3.14f;

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS: ");
        int radius=sc.nextInt();

        float Area_of_circle=pi*radius*radius;

        System.out.println("THE AREA OF CIRCLE OF RADIUS " +radius+ " IS "+ Area_of_circle);
    }
}