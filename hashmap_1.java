import java.util.*;
public class hashmap_1
{
    public static void main(String[] args)
    {
        int arr[]={2,4,6,8,10,4,2};
        int a=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int comp=a-arr[i];
            if(map.containsKey(comp)==true)
            {
            System.out.println(map.get(comp)+""+i);
        }
        map.put(arr[i],i);
        
        }
    }
}