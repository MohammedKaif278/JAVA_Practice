package List.Vector.Stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        //        Difference of using List or LinkedList at reference point

//        1)By using Stack as refference point:-

//        Stack<Integer> s = new Stack<>();
//        LinkedList<Integer> list2=new LinkedList<>();
//
//        s.add(1);
//        list2=s;
//
//        System.out.println(list2);

//        2)By using List as refference point:-

//        List<Integer> s = new Stack<>();
//        List<Integer> list4 = new LinkedList<>();
//
//        s.add(1);
//        list4=s;
//
//        System.out.println(list4);


//        2 ways of Adding element in ArrayList
//    1)
        Stack<String> s = new Stack<>();
        s.push("apple");
        s.push("orange");
        s.push("pear");
        s.push("mango");

//   2)
//        Stack<Integer> s=new Stack<>();
//        s.addAll(Arrays.asList(1,2,3,4));

        System.out.println(s.peek());
        System.out.println(s);
    while(!s.isEmpty())
    {
        System.out.println(s.pop());
    }
    }
}
