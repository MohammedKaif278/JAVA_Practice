package List.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

//        Difference of using List or ArrayList at reference point

//        1)By using ArrayList as refference point:-

//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList<Integer> list2=new LinkedList<>();
//
//        list.add(1);
//        list2=list;

//        System.out.println(list2);
//
//        2)By using List as refference point:-

//        List<Integer> list3 = new ArrayList<>();
//        List<Integer> list4 = new LinkedList<>();
//
//        list3.add(1);
//        list4=list3;
//
//        System.out.println(list4);


//        2 ways of Adding element in ArrayList
//    1)
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("mango");
        list.add("pear");

        list.addFirst("graphes");

//    2)
//      ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "orange", "mango", "pear"));
        System.out.println("First Element:"+list.get(0));
        for (String fruit : list)
        {
        System.out.println(fruit);

        }
    }
}
