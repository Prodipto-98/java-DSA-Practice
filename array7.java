import java.util.*;
public class array7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int temp=0,temp2=0;
        
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr1[temp]=arr[i];
                temp++;
            }
            else if(arr[i]==0)
            temp2++;
        }
        System.out.println("tempis"+temp);
        for(int i=temp;i<arr.length;i++)
        {
            arr1[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(+arr1[i]+ ",");
        }
    }
}