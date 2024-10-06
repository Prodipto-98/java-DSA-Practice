import java.util.*;
public class tech
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to check");
        int n=sc.nextInt();
        int n1=n;
        int c=0,c1=0;
        while(n1>0)
        {
            c++;
            n1=n1/10;
        }
         c1=c/2;
        int num=n/(int)(Math.pow(10,c1));
        int num1=n%(int)(Math.pow(10,c1));
        System.out.println("the numbers are "+num+" "+num1);
        if((int)(Math.pow((num+num1),2))==n)
        System.out.println("tech no "+n);
    }
}