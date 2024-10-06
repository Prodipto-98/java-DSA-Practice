import java.util.*;
public class pattern4
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i1=0;i1<n;i1++)
        {
            for(int j1=n-1;j1>i1;j1--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}