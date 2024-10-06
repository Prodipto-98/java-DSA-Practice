// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//code takes  two input strings removes similar letters in both strings
import java.util.Scanner;
class stringnew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=sc.next();
        int c=1;
        String s1="";
        for(int i=0;i<s.length();i++)
        {   
            c=0;
             for(int j=0;j<a.length();j++)
             {
                 if(s.charAt(i)==a.charAt(j))
                 c=1;
             }
             if(c!=1)
             s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}