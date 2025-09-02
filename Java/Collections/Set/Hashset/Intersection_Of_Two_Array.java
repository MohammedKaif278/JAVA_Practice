package Collections.Set.Hashset;

import java.util.HashSet;

public class Intersection_Of_Two_Array {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2={3,4,5,6};

        HashSet<Integer> h=new HashSet<>();
        for(Integer i :arr1)
        {
            h.add(i);//[1,2,3,4]
        }

        HashSet<Integer> result=new HashSet<>();
        for(Integer i:arr2)
        {
            if(h.contains(i))
            {
                result.add(i);
            }

        }

        System.out.println(result);
    }
}
