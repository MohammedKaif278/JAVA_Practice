package Stream_API.Advanced_Coding_Questions;

import java.util.*;
public class Sum_Of_Unique_elements
{
    public static void main(String[] args) {
        int []arr = {1,6,7,8,1,1,8,8,7};

        int sum=Arrays.stream(arr)
                .distinct()
                .sum();

        System.out.println(sum);
    }
}

/*

🧠 Step-by-Step Working
🔹 Step 1: Stream
[1,6,7,8,1,1,8,8,7]
🔹 Step 2: distinct()

👉 Removes duplicates

[1,6,7,8]
🔹 Step 3: sum()
1 + 6 + 7 + 8 = 22
✅ Output
22
 */