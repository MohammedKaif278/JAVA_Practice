package Collections.Set.Hashset;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(4);

        HashSet<Integer> s2=new HashSet<>();
        s2.add(2);
        s2.add(4);
        s2.add(1);

        s1.addAll(s2);
        System.out.println(s1);
    }
}
