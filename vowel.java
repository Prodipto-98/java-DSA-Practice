import java.util.*;
public class vowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.next();
        System.out.print(s.toLowerCase());
        String s1="";
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)!='a' && s.charAt(i)!='e'&& s.charAt(i)!='i' && s.charAt(i)!='o' &&s.charAt(i)!='u')
          {
             s1=s1+s.charAt(i); 
          }
        }
        System.out.println(s1);
    }
}