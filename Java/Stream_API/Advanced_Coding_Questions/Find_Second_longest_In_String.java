package Stream_API.Advanced_Coding_Questions;

import java.util.Arrays;

public class Find_Second_longest_In_String
{
    public static void main(String[] args) {
        String s = "I am learning streams API in Java";

        String secondLongest= Arrays.stream(s.split(" "))
                //[I, am, learning, streams, API, in, Java]

                .sorted((w1,w2)->Integer.compare(w2.length(),w1.length()))
                //[learning(8), streams(7), Java(4), API(3), am(2), in(2), I(1)]

                .skip(1)
                //skip(1) → remove "learning"

                .findFirst()
                //streams

                .orElse("");
        System.out.println(secondLongest);
    }
}
