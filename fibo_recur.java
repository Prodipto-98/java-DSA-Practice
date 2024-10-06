/*import java.util.*;
public class fibo_recur
{
    public static int fibo(int n)
    {
       if(n<2)
       return n;
       else
       return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int k=fibo(n);
        System.out.println("the number is"+k);
    }
}*/
//0,1,1,2,3,5,8,13....
import java.util.*;
public class fibo_recur
{
    public static int fibo(int n)
    {
       if(n<2)
       return n;
       else
       return n*fibo(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int k=fibo(n);
        System.out.println("the number is"+k);
    }
}
