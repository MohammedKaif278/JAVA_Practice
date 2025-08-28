package List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

//        Difference of using List or LinkedList at reference point

//        1)By using LinkedList as refference point:-

//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList<Integer> list2=new LinkedList<>();
//
//        list.add(1);
//        list2=list;

//        System.out.println(list2);

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
        LinkedList<String> list=new LinkedList();
        list.add("Apple");
        list.add("Banana");
        list.add("mango");
        list.add("kiwi");

        list.addFirst("orange");
        list.addLast("pear");

//    2)
//        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple","Banana","mango","kiwi"));
        System.out.println("Original list : "+list);
        System.out.println("Last Element : "+list.getLast());
        for (String fruit:list)
        {
            System.out.println(fruit);
        }
    }
}
