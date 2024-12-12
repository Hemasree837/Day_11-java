import java.util.*;
public class SortArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(32);
        a.add(65);
        a.add(45);
        Collections.sort(a);
        System.out.println(a);
    }
}
