import java.util.*;
public class ArrayListm {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a.contains(10));
        System.out.println(a.contains(15));
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
