package String;

public class Reverse_String
{
    public static void main(String[] args) {

        //This is loop approach

        String input="kaif";
        String rev="";
        for(int i=input.length()-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        System.out.println("Reverse String with loops : "+rev);

        //Using StringBuilder Object

        StringBuilder sb=new StringBuilder(input);
        String reveresed = sb.reverse().toString();
        System.out.println("Reverse String with inbuilt method: "+reveresed);
    }
}
