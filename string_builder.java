import java.util.*;
public class string_builder
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Prodipto");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'R');
        System.out.println(sb);
        sb.insert(1,'z');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.append("f");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        
        
    }
}