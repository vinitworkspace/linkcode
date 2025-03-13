import java.util.Scanner;
public class Days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter A NUmber: ");
        n = sc.nextInt();

        switch(n){
            case 1:System.out.println("JANUARY");
            case 3:System.out.println("MARCH");
            case 5:System.out.println("MAY");
            case 7:System.out.println("JULY");
            case 8:System.out.println("AUGUST");
            case 10:System.out.println("OCTOBER");
            case 12:System.out.println("31 Days");break;
            case 4:System.out.println("APRIL");
            case 6:System.out.println("JUNE");
            case 9:System.out.println("SEPTEMBER");
            case 11:System.out.println("30 Days");break;
            case 2:System.out.println("FEBRUARY");System.out.println("28 Days");break;


            default:System.out.println("PLEASE ENTER A VALID CHOICE!!");break;

        }
    }
}
