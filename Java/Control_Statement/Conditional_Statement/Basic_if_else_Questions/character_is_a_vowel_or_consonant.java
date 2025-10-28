package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class character_is_a_vowel_or_consonant
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch>='a'&& ch<='z')
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("Character is Vowel");
            }
            else {
                System.out.println("Character is Consonent");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
