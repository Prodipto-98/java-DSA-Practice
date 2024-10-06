// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
        String ss="3.14,hello,42;2.71,world,24;5.78,earth,78";
        String []arr=ss.split(";");
        ArrayList<String> s=new ArrayList<>(); 
        ArrayList<Float> f=new ArrayList<>();
        ArrayList<Integer> i=new ArrayList<>();
        for(String a:arr)
        {
            String [] arr1=a.split(",");
            f.add(Float.parseFloat(arr1[0]));
            s.add(arr1[1]);
            i.add(Integer.parseInt(arr1[2]));
        }
        for(int j=0;j<i.size();j++)
        {
            System.out.println("float is:"+f.get(j)+"string is"+s.get(j)+"integer is"+i.get(j));
        }
        
    }
}