package Stream_API.Advanced_Coding_Questions;

import java.util.*;
public class Create_List_Contains_Only_Integers
{
    public static void main(String[] args) {
        String[] s = {"abc", "123", "456", "xyz"};

        List<Integer> result=Arrays.stream(s)
                .filter(str->str.matches("\\d+"))
                .map(Integer::parseInt)
                .toList();

        System.out.println(result);
    }
}

/*

🔍 Step-by-Step Working
🔹 Step 1: Stream
["abc", "123", "456", "xyz"]
🔹 Step 2: Filter
str.matches("\\d+")

👉 Meaning:

\\d+ → only digits
String	Match?
abc	❌
123	✅
456	✅
xyz	❌

👉 Remaining:

["123", "456"]
🔹 Step 3: Convert to Integer
Integer.parseInt()
[123, 456]
✅ Output
[123, 456]
 */