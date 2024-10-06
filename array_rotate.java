// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class array_rotate {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {   
            if(i+1<arr.length)
            arr1[i+1]=arr[i];
            else
            arr1[0]=arr[arr.length-1];
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr1[i]);
    }
}