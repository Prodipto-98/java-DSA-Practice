// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
3 4 
3 4 -7 1 3 3 
1 3 3 
3 3 1 */
import java.util.*;
public class array9
{
    public static void main(String[] args)
    {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int N = arr.length;
        int target = 7;
        bruteForce(arr, N, target);
    }
    public static void  bruteForce(int arr[],int  N, int target)
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=0;
            for(int j=i;j<N;j++)
            {
                sum=sum+arr[j];
                if(sum==target)
                {
                    for(int k=i;k<=j;k++)//all sub array being created here
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}