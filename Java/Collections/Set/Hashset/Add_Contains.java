package Collections.Set.Hashset;

import java.util.HashSet;

public class Add_Contains {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println(h.contains(3));
    }
}
