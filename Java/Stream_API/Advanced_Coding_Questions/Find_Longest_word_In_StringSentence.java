package Stream_API.Advanced_Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Longest_word_In_StringSentence
{
    public static void main(String[] args) {
        String s = "I am learning streams API in Java";


        //(Using max + Comparator)
       String longestWord1=Arrays.stream(s.split(" "))
               .max(Comparator.comparingInt(String::length))
               .orElse("");
        System.out.println(longestWord1);


        //(Using reduce)
        String LongestWord2=Arrays.stream(s.split(" "))
                .reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
                .orElse("");
        System.out.println(LongestWord2);


    }
}
