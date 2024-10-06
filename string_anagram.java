import java.util.*;
public class string_anagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string");
        System.out.println("enter 2nd string");
        String a=sc.next();
        String b=sc.next();
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        if(a1.length()!=b1.length())
        System.out.println("they are not anagram string");
        char[] string1=a1.toCharArray();
        char[] string2=b1.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        if(Arrays.equals(string1,string2)==true)
            System.out.println("strings are anagram");
        else
            System.out.println("strings are not anagram");
    }
}