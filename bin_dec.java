// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class bin_dec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int n1=0,temp=0,sum=0;
        int []arr=new int[100];
        while(n>0)
        {
           temp=n%10;
           sum=sum+(temp*(int)(Math.pow(2,n1)));
           n=n/10;
           n1++;
        }
        System.out.print(sum);
       
    }
}