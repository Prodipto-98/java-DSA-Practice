import java.util.*;
public class peterson
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check");
        int n=sc.nextInt();
        int n1=n;
        int d=0,sum=0,s=1;
        while(n>0)
        {
            d=n%10;
            s=1;
            for(int i=1;i<=d;i++)
            {
              s=s*i;
            }
            sum=sum+s;
            n=n/10;
        }
        if(n1==sum)
        System.out.println("peterson number"+sum);
    }
}