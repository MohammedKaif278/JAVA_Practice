package Control_Statement.BasicCodingQuestion;

import java.util.Scanner;

public class ASCII_value_of_each_character
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=sc.nextLine();

        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int ascii=(int) ch;
            System.out.println("Character : "+input+"\nASCII : "+ascii);
        }
    }
}
