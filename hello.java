//System.out.print(String.format("%.2f", d));
// avg = Math.round(avg*100.0)/100.0;
import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine().trim();
        a=a.substring(1,a.length()-1);
        System.out.println(a);
        String arr[]=a.split(",");
        int temp=0;
        int [] arr1=new int[arr.length];
        for(String s:arr)
        {
            arr1[temp]=Integer.parseInt(s);
            temp++;
        }
        int d=0;
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
            d=arr1[0]+arr1[2];
        }
        System.out.println("sum is"+d);
    }
}