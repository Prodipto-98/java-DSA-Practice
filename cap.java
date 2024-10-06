import java.util.*;
public class cap{
    public static void main(String[] args)
    {
        String s="a";
        String s1="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}