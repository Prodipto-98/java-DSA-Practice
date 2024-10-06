import java.util.*;
public class array_new
{
    public static void main(String[] args)
    {
        int arr[]={2,3,6,15,8,9,2,10};
        int n=4;
        int sum=0,num=0,k=0,l=n;
        for(int i=0;i<n;i++)
        {   
            sum=0;
            if(l<=arr.length)
            {
                k++;
                l++;
            }
            for(int j=k;j<l;j++)
            {
                sum=sum+arr[j];   
            }
            if(sum>num)
            {
                num=sum;
            }
        }
        System.out.println("sum is"+num);
    }
}