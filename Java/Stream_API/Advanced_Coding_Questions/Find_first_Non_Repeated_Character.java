package Stream_API.Advanced_Coding_Questions;

public class Find_first_Non_Repeated_Character
{
    public static void main(String[] args) {
        String s = "Hello World";

        Character result=s.chars()
                .mapToObj(c->(char)c)
                .filter(ch->s.indexOf(ch)==s.lastIndexOf(ch))
                        .findFirst()
                                .orElse(null);

        System.out.println(result);
    }
}
/*

🧠 Super Simple Explanation
🔹 Step 1
s.chars()

👉 Convert string → characters

🔹 Step 2
.mapToObj(c -> (char) c)

👉 Convert int → char

🔹 Step 3 (MAIN LOGIC)
s.indexOf(ch) == s.lastIndexOf(ch)

👉 Meaning:

indexOf(ch) → first position
lastIndexOf(ch) → last position

👉 If both same → appears only once ✅

🔹 Step 4
.findFirst()

👉 Get first non-repeating character

✅ Output
H
 */