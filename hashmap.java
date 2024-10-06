import java.util.*;
public class hashmap
{
    public static void main(String[] args)
    {
        //country key,population value
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("india",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        //the population value of china will be updated
        System.out.println(map);
        if(map.containsKey("china")== true)//returns true or false
            System.out.println("key present");
        else
            System.out.println("key not present");
        //search operation
        System.out.println(map.get("china"));//returns the key value
        System.out.println(map.get("japan"));//returns null
        if(map.containsKey("china")== true)
        {
            System.out.println("key present");
        }
        if(map.containsKey("japan")==false)
            System.out.println("key not present");
        //to check key present or not 
        //traversing in an array
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }
        map.remove("china");
        System.out.println(map);
    }
}