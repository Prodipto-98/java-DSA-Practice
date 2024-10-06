//program to check first prime and last prime in a range and give their sum as output
import java.util.*;
public class prime
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the starting limit");
        int s=sc.nextInt();
        System.out.println("enter ending limit");
        int e=sc.nextInt();
        int c=0,c1=0;
        int s1=0,e1=0,sum=0;
        for(int j=s;j<=e;j++)
        {
            c=0;
            for(int i=1;i<=j;i++)
            {
                if (j%i==0)
                    c++;
            }
            if(c==2)
            {
            s1=j;
            break;
        }
        }
        for(int j1=e;j1>=s;j1--)
        {
            c1=0;
            for(int i1=1;i1<=j1;i1++)
            {
                if (j1%i1==0)
                    c1++;
            }
            if(c1==2)
            {
            e1=j1;
            break;//breaks if and whole loop
        }
        }
        System.out.println("starting prime is"+s1);
        System.out.println("ending prime is"+e1);
        sum=s1+e1;
        System.out.println("the sum is"+sum);
    }
}