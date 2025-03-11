import java.util.Scanner;
public class recursionFact2 {
    static Scanner sc=new Scanner(System.in);

    public static int fact(int number,int fact){

        if(number>1)
        {
            fact=fact*number;
            fact=fact(--number,fact);
        }


        return fact;
    }
    public static void main(String[]args){
        System.out.println("Enter A Number:");
        int number=sc.nextInt();
        int fact=1;
        int a=fact(number,fact);
        System.out.println(a);

    }
}
