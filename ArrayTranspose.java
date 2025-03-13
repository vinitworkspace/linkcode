import java.util.Scanner;
public class ArrayTranspose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr1[][] = new int[row][col];
        int result[][]=new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Transpose: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[i][j]=arr1[j][i];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}