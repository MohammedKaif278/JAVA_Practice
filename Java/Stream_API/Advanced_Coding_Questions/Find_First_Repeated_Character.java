package Stream_API.Advanced_Coding_Questions;

public class Find_First_Repeated_Character
{
    public static void main(String[] args) {
        String s = "Hello World";

        Character result=s.chars()
                .mapToObj(c->(char)c)
                .filter(ch->s.indexOf(ch)!=s.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
/*

🧠 Step-by-Step (Very Simple)
🔹 Step 1
s.chars()

👉 Convert string → characters

🔹 Step 2
.mapToObj(c -> (char) c)

👉 Convert int → char

🔹 Step 3 (MAIN LOGIC)
s.indexOf(ch) != s.lastIndexOf(ch)

👉 Meaning:

Appears more than once ✅
🔹 Step 4
.findFirst()

👉 Get first repeated character

🔥 Dry Run
Char	indexOf	lastIndexOf	Repeated?
H	0	0	❌
e	1	1	❌
l	2	9	✅ ← FIRST
✅ Output
l
 */