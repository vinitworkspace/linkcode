import java.util.Scanner;
public class Method {
    static Scanner sc=new Scanner(System.in);
    static int row=sc.nextInt();
    static int col=sc.nextInt();
    static int i,j,k;
    public static void input(int a[][])
    {

    }
    public static void addition(int a1[][],int a2[][],int result[][]){
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

    public static void substraction(int a1[][],int a2[][],int result[][]){
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
    public static void Multiplication(int a1[][],int a2[][],int result[][]) {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<row;k++)
                {
                    result[i][j]+=a1[i][k]*a2[k][j];

                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Transpose(int a1[][],int result[][])
    {


        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Transpose: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[i][j]=a1[j][i];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        System.out.println("Enter Number of rows and columns : ");
        int a1[][] = new int[row][col];
        int a2[][]=new int[row][col];
        int result[][]=new int[row][col];
        int n;
        System.out.println("OPERATIONS : ");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Transpose");
        System.out.println("Enter Your Choice: ");
        n=sc.nextInt();

        switch(n){
            case 1:addition(a1[][],a2[][],result[][]);break;
            case 2:substraction(a1[][],a2[][],result[][]);break;
            case 3:Multiplication(int a1[][],int a2[][],result[][]);break;
            case 4:Transpose();break;
        }
    }
}
