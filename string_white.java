import java.util.*;
public class string_white
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sting");
        String s=sc.nextLine();
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}