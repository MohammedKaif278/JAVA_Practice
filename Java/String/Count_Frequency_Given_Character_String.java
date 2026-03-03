package String;

public class Count_Frequency_Given_Character_String
{
    public static void main(String[] args) {
        String str = "Welcome to Naresh IT";
        char ch = 'e';
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                c++;
            }
        }

        System.out.println("Frequency of "+ch+" : "+c);
    }
}
