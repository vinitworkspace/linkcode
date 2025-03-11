import java.util.*;
public class ArrayMethod {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int choice, n, i;

        System.out.println("Enter the number of elements in array: ");
        n = sc.nextInt();
        System.out.println("Enter Elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        int flag = 0;
        boolean bool = true;
        do {
            System.out.println("CHOOSE A OPTION: ");
            System.out.println("1.Linear Search\n 2.Binary Search\n 3.Maximum Number\n 4.Minimum Average\n 5.Average");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter A Element to find: ");
                    int key = sc.nextInt();
                    for (int x : a) {
                        if (key == x) {
                            flag = 1;
                            break;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Element " + key + " Found");
                    } else {
                        System.out.println(+key + " NOT FOUND");
                    }
                    break;
                }
                case 2: {
                    int key;
                    System.out.print("Enter A Key To Found: ");
                    key = sc.nextInt();
                    int high = n - 1, low = 0;

                    flag = 0;
                    while (low <= high) {
                        int mid = (high + low / 2);
                        if (key == a[mid]) {
                            flag++;
                            break;
                        } else if (key < a[mid]) {
                            high = mid - 1;
                        } else if (key > a[mid]) {
                            low = mid + 1;
                        }
                    }
                    if (flag == 1) {
                        System.out.print("KEY FOUND!");
                    } else {
                        System.out.print("NOT FOUND!");
                    }
                    break;
                }
                case 3: {
                    int max = a[0];
                    for (int x : a) {
                        if (max < a[x]) {
                            max = a[x];
                        }
                    }
                    System.out.println("MAXIMUM NUMBER IN ARRAY IS:" + max);
                    break;
                }
                case 4: {
                    int min = a[0];
                    for (int x : a) {
                        if (min > a[x]) {
                            min = a[x];
                        }
                    }
                    System.out.println("MINIMUM NUMBER IN ARRAY IS:" + min);
                    break;
                }
                case 5:
                    int sum = 0;
                    int avg = 0;
                    for (int x : a) {
                        sum += x;
                    }
                    avg = (sum / n);
                    System.out.println("AVERAGE OF THE ELEMENTS IS:" + avg);
                    break;
            }
            System.out.println("\nDO YOU WANT TO CONTINUE: \n1.YES\n 2.NO\n");
            int ch1=sc.nextInt();
            if(ch1==2)
                bool=false;
        }
        while(bool);
    }
}
