import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        int pid, qty;
        String pname;
        float price, total;
        float discount=0f,discountamt=0f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID: ");
        pid = sc.nextInt();
        System.out.println("Enter Product Name: ");
        pname = sc.next();
        System.out.println("Enter Product Quantity: ");
        qty = sc.nextInt();
        System.out.println("Enter Price of Product: ");
        price = sc.nextFloat();

        total = price * qty;

        System.out.println("PRODUCT ID: " + pid);
        System.out.println("PRODUCT NAME: " + pname);
        System.out.println("PRODUCT QUANTITY: " + qty);
        System.out.println("PRODUCT PRICE: " + price);

        if (total > 10000) {
            discount = 10f;
            discountamt = total * 0.1f;
        } else if (total > 8000) {
            discount = 8f;
            discountamt = total * 0.08f;
        }

        System.out.println("TOTAL BILL: " + (total - discountamt)); // Subtract the discount amount from the total
        System.out.println("DISCOUNT: " + discount + "%");
    }
}
