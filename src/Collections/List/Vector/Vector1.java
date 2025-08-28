package List.Vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {

//        Difference of using List or vector at reference point

//        1)By using LinkedList as refference point:-

//        Vector<Integer> v = new Vector<>();
//        LinkedList<Integer> list2=new LinkedList<>();
//
//        v.add(1);
//        list2=v;
//
//        System.out.println(list2);


//        2)By using List as refference point:-

//        List<Integer> v1 = new Vector<>();
//        List<Integer> list4 = new LinkedList<>();
//
//        v1.add(1);
//        list4=v1;
//
//        System.out.println(list4);


//        2 ways of Adding element in ArrayList
//    1)
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

//    2)
//        Vector<Integer> v = new Vector<>(Arrays.asList(1,3,4,5));
        System.out.println("original list :"+v);
        System.out.println("Last element : "+v.get(2));
        for(Integer i : v)
        {
            System.out.println(i);
        }

    }
}
