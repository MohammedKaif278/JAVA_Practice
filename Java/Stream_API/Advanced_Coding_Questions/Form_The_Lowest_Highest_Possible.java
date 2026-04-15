package Stream_API.Advanced_Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Form_The_Lowest_Highest_Possible
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};

        String lowest= Arrays.stream(arr)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        String highest=Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(lowest);
        System.out.println(highest);
    }
}

/*

🔍 Step-by-Step Internal Working
🔵 PART 1: LOWEST NUMBER
🔹 Step 1: Arrays.stream(arr)
Input array:
[1, 2, 3, 5, 4]

👉 Converts to IntStream

1 → 2 → 3 → 5 → 4
🔹 Step 2: .sorted()

👉 Uses Dual-Pivot QuickSort (internally for primitives)

Before: [1, 2, 3, 5, 4]
After : [1, 2, 3, 4, 5]
🔹 Step 3: .mapToObj(String::valueOf)

👉 Converts each number → String

1 → "1"
2 → "2"
3 → "3"
4 → "4"
5 → "5"

👉 Now stream becomes:

["1", "2", "3", "4", "5"]
🔹 Step 4: .collect(Collectors.joining())

👉 This is the most important part 🔥

Internally:
Creates StringBuilder
Adds each string one by one
Returns final string
Flow:
""
+ "1" → "1"
+ "2" → "12"
+ "3" → "123"
+ "4" → "1234"
+ "5" → "12345"
✅ Final Output
12345
🔴 PART 2: HIGHEST NUMBER
🔹 Step 1: .boxed()

👉 Converts primitive → object

int → Integer
[1, 2, 3, 5, 4] → [1, 2, 3, 5, 4]

👉 Required because:

Comparator.reverseOrder() works only with objects
🔹 Step 2: .sorted(Comparator.reverseOrder())

👉 Sort in descending order

Before: [1, 2, 3, 5, 4]
After : [5, 4, 3, 2, 1]

👉 Internally uses:

TimSort (for objects)
🔹 Step 3: .map(String::valueOf)
5 → "5"
4 → "4"
3 → "3"
2 → "2"
1 → "1"
🔹 Step 4: .collect(Collectors.joining())
""
+ "5" → "5"
+ "4" → "54"
+ "3" → "543"
+ "2" → "5432"
+ "1" → "54321"
✅ Final Output
54321
 */