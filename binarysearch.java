import java.util.*;
public class binarysearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the number to search");
        int num=sc.nextInt();
        int first=0;
        int last=arr[arr.length-1];
        int mid = (first + last)/2;  
        while( first <= last )
        {  
            if ( arr[mid] < num )
            {  
                first = mid + 1;     
            }
            else if ( arr[mid] == num )
            {  
                System.out.println("Element is found at index: " +mid);  
                break;  
            }
            else
            {  
                last = mid - 1;  
            }  
            mid=(first+last)/2;
        }  
        if ( first > last ){  
            System.out.println("Element is not found!");  
        }  
    }  
}

