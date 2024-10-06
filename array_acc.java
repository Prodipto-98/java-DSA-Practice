import java.util.*;
public class array_acc
{
    public static void main(String[] args)
    {
        int arr[]={2,3,6,15,8,9,2,10};
        int money=15,c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%5==0)
            c++;
            else if(money>=arr[i])
            {
                money=money-arr[i];
                c++;
            }
            
        }
        System.out.println(c);
        
    }
}