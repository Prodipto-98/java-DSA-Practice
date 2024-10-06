import java.util.*;
public class string_subsets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check");
        String s=sc.next();
        int l=s.length();
        int l1=(l*(l+1)/2);
        String[] a=new String[l1];
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                a[temp]=s.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("the subsets are");
        for(int i1=0;i1<a.length;i1++)
        {
            System.out.print(a[i1]+",");
        }
    }
}