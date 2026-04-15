package Stream_API.Advanced_Coding_Questions;

import java.util.Arrays;

public class Find_Words_With_Specified_Vowels
{
    public static void main(String[] args) {
        String s = "I am learning streams API in Java";

        Arrays.stream(s.split(" "))
                .filter(word->word.toLowerCase()
                        .chars()
                        .filter(c->"aeiou".indexOf(c)!=-1)
                        .count()==2).forEach(System.out::println);

    }
}
