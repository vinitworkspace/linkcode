import java.util.Scanner;
public class matrix {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Rows And Columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int x[]:a)
        {
            for(int arr:x){
                System.out.print(arr+" ");
            }
            System.out.println();
        }
    }
}
