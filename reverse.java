import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
       int d=0,rev=0;
       int n1=n;
       while(n>0)
       {
           d=n%10;
           rev=(rev*10)+d;
           n=n/10;
       }
       System.out.println("reverse is "+rev);
       if(n1==rev)
       System.out.println("palindrome");
    }
}