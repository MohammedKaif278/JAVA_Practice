package String;

public class Count_Number_of_Substrings_String
{
    public static void main(String[] args) {
        String str="abc";

        int n=str.length();

        int totalSubstrings=n*(n+1)/2;
        System.out.println("Total SubStrings : "+totalSubstrings);
    }
}
