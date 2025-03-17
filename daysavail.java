import java.util.Scanner;
public class daysavail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Month Number(1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter A Date to Check: ");
        int day = sc.nextInt();
        boolean isValid = false;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 1 & day <= 31) isValid = true;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 1 & day <= 30) isValid = true;
                break;

            case 2:
                if (day >= 1 & day <= 28) isValid = true;
                break;

            default:
                System.out.println("INAVLID DAY ENTERED!!");
        }
        if (isValid) {
            System.out.println("month " + month + " has day " + day);
        } else {
            System.out.println("month " + month + " doesn't have day " + day);
        }
    }
}
