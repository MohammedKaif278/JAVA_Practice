package Stream_API.Advanced_Coding_Questions;

import java.util.*;
import java.util.stream.*;
public class Range_Grouping_Problem
{
    public static void main(String[] args) {
        int []arr= {2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54};

        Map<Integer,List<Integer>> result=Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n->(n/10)*2));

        System.out.println(result);
    }
}

/*

🔥 Internal Working
🔹 Step 1: Stream
[2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54]
🔹 Step 2: Apply Formula
(n / 10) * 10
Number	Calculation	Key
2	(2/10)*10 = 0	0
3	(3/10)*10 = 0	0
10	(10/10)*10 = 10	10
14	(14/10)*10 = 10	10
24	(24/10)*10 = 20	20
...	...	...
🔹 Step 3: Grouping

👉 Creates:

0  → [2, 3]
10 → [10, 14]
20 → [20, 24]
30 → [30, 34]
40 → [40, 44]
50 → [50, 54]
✅ Output
{0=[2, 3], 10=[10, 14], 20=[20, 24], 30=[30, 34], 40=[40, 44], 50=[50, 54]}
 */