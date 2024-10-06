import java.util.*;
class fibonacci
{
    public static void cutie(int n)
    {
        int temp=0,sum=0;
        int n1=0,n2=1;
        System.out.print(n1+","+n2);
        for(int i=2;i<n;i++)
        {
            int n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        cutie(n);
    }
}