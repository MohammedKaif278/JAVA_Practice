package String;

public class Length_String_Without_Using_length_method
{
    public static void main(String[] args) {
        String str="welcome";
        int c=0;
        char[] carr=str.toCharArray();
        for(char ch:carr)
        {
            c++;
        }
        System.out.println("Length of String : "+c);
    }
}
