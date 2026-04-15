package Stream_API.Advanced_Coding_Questions;

import java.util.*;
import java.util.stream.*;

public class Divide_List_Into_Even_Odd_List
{
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8};

      List<List<Integer>> result=Arrays.stream(arr)
              .boxed()
              .collect(Collectors.collectingAndThen(
                      Collectors.partitioningBy(n->n%2==0),
                      m->List.of(m.get(false),m.get(true))));
        System.out.println(result);
    }
}

/*
🔹 Step 1: Arrays.stream(arr)
int[] arr = {1,2,3,4,5,6,7,8};

👉 Converts array → IntStream

1, 2, 3, 4, 5, 6, 7, 8
🔹 Step 2: .boxed()

👉 Converts primitive int → Integer

[1, 2, 3, 4, 5, 6, 7, 8]

👉 Required because:

Collections work with objects, not primitives
🔹 Step 3: collect(...)

👉 Terminal operation
👉 Starts data processing + aggregation

🔥 Step 4: partitioningBy(n -> n % 2 == 0)

👉 Core logic

For each number:

Number	Condition (n % 2 == 0)	Group
1	false	odd
2	true	even
3	false	odd
4	true	even
5	false	odd
6	true	even
7	false	odd
8	true	even

👉 Internally builds:

Map<Boolean, List<Integer>>

false → [1, 3, 5, 7]
true  → [2, 4, 6, 8]
🔹 Step 5: collectingAndThen(...)

👉 This is the magic step ✨

collectingAndThen(collector, finisher)
Two parts:
✅ Part 1: Collector
Collectors.partitioningBy(...)

👉 Produces:

{false=[1,3,5,7], true=[2,4,6,8]}
✅ Part 2: Finisher Function
m -> List.of(m.get(false), m.get(true))

👉 Takes the Map m and converts it:

m.get(false) → [1,3,5,7]
m.get(true)  → [2,4,6,8]

👉 Final:

[[1,3,5,7], [2,4,6,8]]
 */