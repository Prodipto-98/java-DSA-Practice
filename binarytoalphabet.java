 import java.util.*;
public class binarytoalphabet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        String s=sc.next()+"0";
        String s1="";
        String arr[]=new String[s.length()];
        s1="";
        int temp=0;
        for(int j=0;j<s.length();j++)
        { 
            if(s.charAt(j)!='0')
            {
                s1=s1+s.charAt(j);
            }
            else if(s.charAt(j)== '0')
            {
                arr[temp]=s1;
                temp++;
                s1="";
            }
        }
        System.out.println(arr[0]+" "+arr[1]);
        System.out.println(arr[0].length());
        for(int i=0;i<temp;i++)
        {
            if(arr[i].length()==1)
                System.out.println("A");
            else if(arr[i].length()==2)
                System.out.println("B");
            else if(arr[i].length()==3)
                System.out.println("C");
            else if(arr[i].length()==4)
                System.out.println("D");
            else if(arr[i].length()==5)
                System.out.println("E");
            else if(arr[i].length()==6)
                System.out.println("F");
            else if(arr[i].length()==7)
                System.out.println("G");
            else if(arr[i].length()==8)
                System.out.println("H");
            else if(arr[i].length()==9)
                System.out.println("I");
            else if(arr[i].length()==10)
                System.out.println("J");
            else if(arr[i].length()==11)
                System.out.println("K");
            else if(arr[i].length()==12)
                System.out.println("L");
            else if(arr[i].length()==13)
                System.out.println("M");
            else if(arr[i].length()==14)
                System.out.println("N");
            else if(arr[i].length()==15)
                System.out.println("O");
            else if(arr[i].length()==16)
                System.out.println("P");
            else if(arr[i].length()==17)
                System.out.println("Q");
            else if(arr[i].length()==18)
                System.out.println("R");
            else if(arr[i].length()==19)
                System.out.println("S");
            else if(arr[i].length()==20)
                System.out.println("T");
            else if(arr[i].length()==21)
                System.out.println("U");
            else if(arr[i].length()==22)
                System.out.println("V");
            else if(arr[i].length()==23)
                System.out.println("W");
            else if(arr[i].length()==24)
                System.out.println("X");
            else if(arr[i].length()==25)
                System.out.println("Y");
            else if(arr[i].length()==26)
                System.out.println("Z");
        }
    }
}