package String;

public class Check_String_Contains_Only_Digits
{
    public static void main(String[] args) {
        String str="123";
        boolean isDigitOnly=true;

        if(str.length()==0)
        {
            isDigitOnly=false;
        }
        else{
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch<'0' || ch>'9')
                {
                    isDigitOnly=false;
                    break;
                }
            }
        }

        System.out.println("isDigitOnly : "+isDigitOnly);
    }
}
