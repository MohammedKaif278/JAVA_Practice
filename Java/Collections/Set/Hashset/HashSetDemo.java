package Collections.Set.Hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        System.out.println(hash.add(4));//Duplicate Values Not Allowwed
        System.out.println(hash);
    }
}
