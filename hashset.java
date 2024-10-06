import java.util.*;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        //same as arraylist
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        //search
        if(set.contains(1)== true)
        {//returns true of false
            System.out.println("set contains 1");
        }
        if(set.contains(6)== false)
        {
            System.out.println("set does not habe 6");
        }
        //delete
        set.remove(1);
        if(!set.contains(1))//same as if(set.contains(1)==false)
        System.out.println("1 has been deleted from set");
        //size of set
        System.out.println("set size is"+set.size());
        //print all elements of set
        System.out.println(set);
        //iteration in set
        Iterator it=set.iterator();
        while(it.hasNext()== true)
        {
            System.out.print(it.next());
        }
    }
}