package Stream_API.Advanced_Coding_Questions;

public class Remove_Duplicate_From_String
{
    public static void main(String[] args) {
        String s = "dabcadefg";

        String duplicate=s.chars()  //Converts string → IntStream
                //"dabcadefg" → [100, 97, 98, 99, 97, 100, 101, 102, 103]
                //👉 These are ASCII values

                .mapToObj(c->String.valueOf((char) c)) //Convert int → String
                //chars() gives int
                //We need characters as String

                //👉 After conversion:
                //["d", "a", "b", "c", "a", "d", "e", "f", "g"]

                .reduce("",(acc,ch)->{
                    if (acc.contains(ch)) {
                        return acc;
                    }
                    else{
                        return acc+ch;
                    }
                });

                //"" → initial value (empty string)
                //(acc, ch) → accumulator function

                //👉 Think of it like:
                //result = (((("" + d) + a) + b) + c) ...


        System.out.println(duplicate);


    }
}
