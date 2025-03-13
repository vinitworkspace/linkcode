import java.util.Scanner;
public class ArrayMultiply {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows and columns for matrix 1: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr1[][]=new int[row][col];
        int result[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Number of rows and columns for matrix 2: ");
        row=sc.nextInt();
        col=sc.nextInt();
        int arr2[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<row;k++)
                {
                    result[i][j]+=arr1[i][k]*arr2[k][j];

                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
