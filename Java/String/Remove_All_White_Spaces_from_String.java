package String;

public class Remove_All_White_Spaces_from_String
{
    public static void main(String[] args) {
        String str = " Welcome to Naresh IT ";
        String result = "";

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                result+=ch;
            }
        }
        System.out.println("After removing spaces : "+result);
    }
}
