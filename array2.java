import java.util.*;
public class array2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        int c=0;
        for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            if(c>1)
            {
                System.out.println("repeat elements  "+arr[i]+"frequency is  "+c);
                arr[i]=0;
            }
        }
    }
}