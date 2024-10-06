import java.util.*;
public class array1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=arr[0],b=arr[0], a1=0;
        System.out.println("array values are as follows");
        System.out.println();
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+",");
        }
        System.out.println();
        for(int i1=0;i1<n;i1++)
        {
            if(arr[i1]>a)
                a=arr[i1];
        }
        for(int i11=0;i11<n;i11++)
        {
            if(arr[i11]<b)
            b=arr[i11];
        }
        for(int j1=0;j1<n;j1++)
        {
            if(arr[j1]>a1 && arr[j1]!=a)
                a1=arr[j1];
        }
        
            System.out.println("the greatest digit of the array is"+a);
            System.out.println("the samllest digit is"+b);
            System.out.println("second greatest"+a1);

        }
    }