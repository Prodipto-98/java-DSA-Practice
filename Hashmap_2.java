// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//code to find the highest frequency character in a string
import java.util.*;
class Hashmap_2 {
    public static void main(String[] args) {
        String s="aabbcabb";
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c)==true)
            {
                map.put(c,map.get(c)+1);
            }
            else
            map.put(c,1); 
        }
        int a=map.get(s.charAt(0));
        char c=' ';
        for(Character key:map.keySet())
        {
            if(map.get(key)>a)
            {
            a=map.get(key);
             c=key;
            }
        }
        System.out.print(c+" value " +a);
    }
}