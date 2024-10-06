import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String arr[]=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])==true)
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            map.put(arr[i],1);
        }
        System.out.println(map);
        Set<String> key=map.keySet();
        for(String b:key)
        {
            int a=map.get(b);
            System.out.println(b+" "+a);
        }
    }
}