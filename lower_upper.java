import java.util.*;
public class lower_upper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int n=s.length();
        String s2="";
        for(int i=0;i<n;i++)
        {
            if((Character.isLowerCase(s.charAt(i)))==true)
            {
                char ch=((char)(s.charAt(i)-32));
                s2=s2+ch;
            }
            else if((Character.isUpperCase(s.charAt(i)))==true)
            {
                char ch1=((char)(s.charAt(i)+32));
                s2=s2+ch1;
            }
            else if (s.charAt(i)==' ')
            {
            s2=s2+(char)(s.charAt(i));
            }
        }
        System.out.println(s2);
    }
}