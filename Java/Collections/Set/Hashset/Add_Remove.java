package Collections.Set.Hashset;

import java.util.HashSet;

public class Add_Remove {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(4);
        Boolean remove=h.remove(2);
        System.out.println(remove);
        System.out.println(h);
    }
}
