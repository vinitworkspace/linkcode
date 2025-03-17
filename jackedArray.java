import java.util.Scanner;
public class jackedArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int row=sc.nextInt();

        int a[][]=new int[row][];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter Value for Column in "+(i+1)+" Row");
            a[i]=new int[sc.nextInt()];
        }
        System.out.println("Enter Values: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Values From Jacked Array: ");
//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<a[i].length;j++)
        for(int x[]:a)
        {
            for(int b:x)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
