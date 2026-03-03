package String;

public class Compare_Two_Strings_Without_Using_equals_Method
{
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";

        boolean isEqual=true;
        if(s1.length()!=s2.length())
        {
            isEqual=false;
        }
        else{
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    isEqual=false;
                    break;
                }
            }
        }

        System.out.println("Strings are Equal : "+isEqual);
    }
}
