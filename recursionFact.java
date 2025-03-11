import java.util.Scanner;
public class recursionFact {
    static Scanner sc=new Scanner(System.in);

    public static void fact(int number,int fact){

        if(number==0)
        {
            System.out.println(fact);
            return;
        }
        fact=fact*number;

        fact(--number,fact);
    }
    public static void main(String[]args){
        System.out.println("Enter A Number:");
        int number=sc.nextInt();
        int fact=1;
        fact(number,fact);
    }
}
