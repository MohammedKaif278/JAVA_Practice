package Stream_API.Advanced_Coding_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Occurence_Of_Each_Character
{
    public static void main(String[] args) {
        String s = "Mississippi";

        Map<Character,Long> result=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        ch->ch,
                        Collectors.counting()
                ));
        System.out.println(result);
    }
}

/*
🔥 Internal Working
🔹 Step 1: s.chars()
"M i s s i s s i p p i"

👉 Actually becomes ASCII values:

[77, 105, 115, 115, 105, 115, 115, 105, 112, 112, 105]
🔹 Step 2: Convert to Character
.mapToObj(c -> (char) c)

👉 Now:

[M, i, s, s, i, s, s, i, p, p, i]
🔹 Step 3: Grouping
groupingBy(ch -> ch)

👉 Groups like:

M → [M]
i → [i, i, i, i]
s → [s, s, s, s]
p → [p, p]
🔹 Step 4: Counting
Collectors.counting()

👉 Final Map:

{M=1, i=4, s=4, p=2}
✅ Output
{M=1, i=4, s=4, p=2}
 */