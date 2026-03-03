package String;

public class Count_the_Occurrences_Each_Character
{
    public static void main(String[] args) {
        String str="programming";

        for(int i=0;i<str.length();i++)
        {
            int c=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            if(str.indexOf(str.charAt(i))==i)
            {
                System.out.println(str.charAt(i) +" = " +c);
            }
        }
    }
}
