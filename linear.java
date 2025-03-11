import java.util.Scanner;
public class linear {
    public static void main(String[]args){
        int n,key,i;
        int a[]=new int[100];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n=sc.nextInt();

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter A Key To Find: ");
        key=sc.nextInt();
        int flag=0;
        for(i=0;i<n;i++) {
            if (key == a[i]) {
                flag = 1;
                break;
            }
        }

            if(flag==1)
            {
                System.out.print(+key+" KEY FOUND IN ARRAY");
            }
            else
            {
                System.out.print(+key+" KEY NOT FOUND IN ARRAY");
            }
        }
    }
