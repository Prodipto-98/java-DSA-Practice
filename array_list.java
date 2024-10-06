import java.util.*;
public class array_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(9);
        arr.add(8);
        System.out.println(arr);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        Collections.sort(arr);
        System.out.println(arr);
        arr.add(1,99);
        System.out.println(arr);
        arr.set(0,98);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.contains(90));
    }
}