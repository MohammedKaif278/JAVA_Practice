package Stream_API.Advanced_Coding_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Occurence_Of_Each_Word
{
    public static void main(String[] args) {
        String s = "I am learning streams API in Java Java";

        Map<String,Long> result= Arrays.stream(s.split(" "))

                .collect(Collectors.groupingBy(
                        word->word,
                        Collectors.counting()));

        System.out.println(result);
    }
}

//Step 1:
//[I, am, learning, streams, API, in, Java, Java]


//Step 2: Grouping
//
//👉 Creates groups like:
//
//I       → [I]
//am      → [am]
//Java    → [Java, Java]
//...

//Step 3: Counting
//
//👉 Applies:
//
//size of each group