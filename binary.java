import java.util.Scanner;
public class binary {
    public static void main(String[]args){
        int n,i;
        int a[]=new int[100];

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key;
        System.out.print("Enter A Key To Found: ");
        key=sc.nextInt();
        int high=n-1,low=0;

        int flag=0;
       while(low<=high)
        {
            int mid=(high+low/2);
            if(key==a[mid])
            {
                flag++;
                break;
            }
            else if(key<a[mid])
            {
                high=mid-1;
            }
            else if(key>a[mid])
            {
                low=mid+1;
            }
        }
       if(flag==1)
       {
           System.out.print("KEY FOUND!");
       }
       else
       {
           System.out.print("NOT FOUND!");
       }
    }
}
