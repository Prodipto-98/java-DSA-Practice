import java.util.*;
public class automorphic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int num=sc.nextInt();
        int store=num;
        int c=0;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        int square=(int)(Math.pow(store,2));
        if((int)square%(Math.pow(10,c))==store)
        {
            System.out.print("automorphic number"+square);
        }
    }
}