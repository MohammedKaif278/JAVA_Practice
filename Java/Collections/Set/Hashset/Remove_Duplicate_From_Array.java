package Collections.Set.Hashset;

import java.util.HashSet;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,1,2};
        HashSet<Integer> h=new HashSet<>();
        for(Integer i:arr)
        {
            h.add(i);// i=1,2,3,4,5, 1,2//Ignored
        }
        System.out.println(h);
    }
}
