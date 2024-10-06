// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class array8 {
    public static void main(String[] args) {
        int[] arr={6,0,5,0,2,3,0};
        int[] arr1=new int[arr.length];
        int temp=0,c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr1[temp]=arr[i];
                temp++;
            }
            else 
            c++;
        }
        for(int i=temp;i<arr.length;i++)
        {
            arr1[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ,");
        }
    }
}