package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class Character_is_alphabet_digit_or_special_character
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Input");
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println(ch+" : The Input is Alphabet");
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println(ch+" : The Input is Number");
        }
        else
        {
            System.out.println(ch+" : The input is Special Character");
        }
    }
}
