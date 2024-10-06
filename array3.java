import java.util.*;
public class array3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }

        //sorting logic  
        for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {    
                int tmp=0;
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }    
        }   
        System.out.println("sorted elements are");
        for(int i1=0;i1<n;i1++)
        {
            System.out.println(arr[i1]);
        }
    }
}