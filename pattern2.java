import java.util.*;
public class pattern2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}