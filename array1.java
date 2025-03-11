import java.util.Scanner;
public class array1 {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Elements: ");
        int n=sc.nextInt();
        int a[]=new int[100];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("ELEMENTS ARE: ");

//      NORMAL FOR LOOP
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(a[i]);
//        }

//        FOR EACH LOOP
        for(int x:a)
        {
            System.out.println(x);
        }

    }
}
