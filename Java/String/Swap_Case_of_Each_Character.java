package String;

public class Swap_Case_of_Each_Character
{
    public static void main(String[] args) {
        String str = "Welcome To Java 123";
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>'A' && ch<'Z')
            {
                result.append((char) (ch+32));
            }
            else if(ch>'a'&& ch<'z')
            {
                result.append((char)(ch-32));
            }
            else {
                result.append(ch);
            }
        }

        System.out.println("After Swap case : "+result);

    }
}
