import java.util.*;
public class dec_binary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int arr[]=new int[100];
        int temp=0;
        while(n>0)
        {
            arr[temp]=n%2;
            n=n/2;
            temp++;
        }
        for(int i=temp-1;i>=0;i--)
        System.out.print(arr[i]);
        
    }
}