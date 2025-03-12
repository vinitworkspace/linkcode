import java.util.Scanner;
public class Fibonacci {
    public static void Fibo(int n,int first,int second)
    {
        System.out.println(first+" ");
        if(n==0){
            return;
        }
        Fibo(--n,second,first+second);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Range To Which You Want To Find Fibonacci Series: ");
        int n=sc.nextInt();
        Fibo(n,0,1);
    }
    
}
