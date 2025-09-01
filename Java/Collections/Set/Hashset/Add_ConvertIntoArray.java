package Collections.Set.Hashset;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;

public class Add_ConvertIntoArray {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        System.out.println(h);
        Integer[] arr = h.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
