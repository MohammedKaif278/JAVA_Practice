package Collections.Set.Hashset;

import java.util.HashSet;

public class HashSetAddMehod {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(5);
        h.add(5);//Duplicate should be ignored
        System.out.println(h);
    }
}

//Duplication is ignored due to the nature of sets.
