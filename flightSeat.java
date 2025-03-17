import java.util.Scanner;
public class flightSeat {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        boolean seats[][]={
                new boolean[5], //first
                new boolean[3], //second
                new boolean[2]  //third
        };
        System.out.println("Seats Availability:");
        int num=1;
        for(boolean x[]:seats)
        {
            System.out.print("Class "+num++ +": ");
            for(boolean a:x)
            {
                System.out.print("[]"+" ");
            }
            System.out.println();
        }

        System.out.println("Select Class: ");
        System.out.println("1-Economy 2-Business 3-First");
        int Class=sc.nextInt();

        switch(Class)
        {
            case 1:
            {
                System.out.println("Enter Seat Number(1-5) ");
                int seat=sc.nextInt();break;

            }
            case 2:
            {
                System.out.println("Enter Seat Number(1-3) ");
                int seat=sc.nextInt();break;
            }
            case 3:
            {
                System.out.println("Enter Seat Number(1-2 ");
                int seat=sc.nextInt();break;
            }
        }
    }

}
