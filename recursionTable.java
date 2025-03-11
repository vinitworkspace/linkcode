import java.util.Scanner;
public class recursionTable {
    static Scanner sc=new Scanner(System.in);

    public static void table(int number,int n)
    {
        int a=number*n;//2
        if(n==11)
        {
            return;
        }
        System.out.println(number+"*"+n+"="+a);
        table(number,++n);
    }
    public static void main(String[]args){
        System.out.println("Enter A Number:");
        int number=sc.nextInt();//2
        int n=1;
        table(number,n);

    }
}
