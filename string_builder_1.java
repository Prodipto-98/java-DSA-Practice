import java.util.*;
public class string_builder_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new string");
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder("");
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='z')
            {
                sb1.append("a");
            }
            else
            sb1.append((char)(sb.charAt(i)+1));
        }
        System.out.println(sb1);
    }
}