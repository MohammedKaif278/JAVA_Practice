package Stream_API.Advanced_Coding_Questions;


import java.util.Arrays;
import java.util.Comparator;

public class Find_Second_Highest_Word_Length
{
    public static void main(String[] args) {
        String s = "I am learning streams API in Java";

        int result= Arrays.stream(s.split(" "))
                //Step 1: Words
                //[I, am, learning, streams, API, in, Java]

                .map(String::length)
                 //Step 2: Lengths
                //[1, 2, 8, 7, 3, 2, 4]

                .distinct()
                //Remove duplicates
                //[1, 2, 8, 7, 3, 4]

                .sorted(Comparator.reverseOrder())
                //Step 4: Sort DESC
                //[8, 7, 4, 3, 2, 1]

                .skip(1)
                //Step 5:
                //skip(1) → 7

                .findFirst()
                .orElse(0);

        System.out.println(result);
    }
}
