import java.util.*;
public class string_new
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        s=s.trim()+" ";
        String s1="";
        String arr[]=new String[s.length()];
        int temp=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                arr[temp]=s1;
                temp++;
                s1="";
            }
        }
        //to break string into individual words
        String max=" ";
        for(int i=0;i<temp;i++)
        {
            if(arr[i].length()>max.length())
            max=arr[i];
        }
        System.out.println(max);
        //finds largest words*/
    }
}