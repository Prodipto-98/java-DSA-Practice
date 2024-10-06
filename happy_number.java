import java.util.*;
class happy_number
{
    public static boolean happy(int n)
    {
        int d=0,sum=0;
        for(int i=0;i<10;i++)
        {
            sum=0;
            while(n>0)
            {
                d=n%10;
                sum=sum+(int)(Math.pow(d,2));
                n=n/10;
            }
            if(sum==1)
            {
                return true;
            }
            else
                n=sum;
        } 
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(happy(n));
    }
}