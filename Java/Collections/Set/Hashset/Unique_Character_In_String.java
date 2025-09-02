package Collections.Set.Hashset;

import java.util.HashSet;

public class Unique_Character_In_String {
    public static void main(String[] args) {
        String str="programming";
        HashSet<Character> h=new HashSet<>();
        for(char c : str.toCharArray())
        {
            h.add(c);
        }
        System.out.println(h);
    }
}
