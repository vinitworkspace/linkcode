import java.util.Scanner;
public class Method {
    static Scanner sc=new Scanner(System.in);
    static int row;
    static int col;
    static int i,j,k;
    public static void addition(){
        System.out.println("Enter Number of rows and columns: ");
        row=sc.nextInt();
        col=sc.nextInt();
        int a1[][]=new int[row][col];
        int a2[][]=new int[row][col];
        int result[][]=new int[row][col];
        System.out.println("Enter Your Elements For Matrix 1: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Your Elements For Matrix 2: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition Matrix Is: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                    result[i][j]=a1[i][j]+a2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void substraction(){
        System.out.println("Enter Number of rows and columns: ");
        row=sc.nextInt();
        col=sc.nextInt();
        int a1[][]=new int[row][col];
        int a2[][]=new int[row][col];
        int result[][]=new int[row][col];
        System.out.println("Enter Your Elements For Matrix 1: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Your Elements For Matrix 2: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Substraction Matrix Is: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                result[i][j]=a1[i][j]-a2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Multiplication() {
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
    public static void Transpose()
    {
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
    public static void main(String[]args){
        int n;
        System.out.println("OPERATIONS : ");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Transpose");
        System.out.println("Enter Your Choice: ");
        n=sc.nextInt();

        switch(n){
            case 1:addition();break;
            case 2:substraction();break;
            case 3:Multiplication();break;
            case 4:Transpose();break;
        }
    }
}
