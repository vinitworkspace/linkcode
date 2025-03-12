import java.util.Scanner;
public class TwoDArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Rows For Matrix 1: ");
        int row1=sc.nextInt();
        System.out.println("Enter Number Of Columns For Matrix 2: ");
        int col1=sc.nextInt();

        int a[][]=new int[row1][col1];
        System.out.println("Enter Elements in Matrix: ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter Number of Rows For Matrix 2: ");
         row1=sc.nextInt();
        System.out.println("Enter Number of Columns For Matrix 2: ");
         col1=sc.nextInt();
        int b[][]=new int[row1][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
