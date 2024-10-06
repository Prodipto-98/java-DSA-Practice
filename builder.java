import java.util.*;
public class builder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        StringBuilder sb = new  StringBuilder(s);
        StringBuilder sb1 = new StringBuilder("");
        for(int i = sb.length()-1; i>=0; i--){
            sb1.append(sb.charAt(i));
        }
        System.out.println("the reversed string is  "+sb1);
    }
}