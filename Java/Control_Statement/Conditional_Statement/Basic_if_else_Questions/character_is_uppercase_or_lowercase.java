package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class character_is_uppercase_or_lowercase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z')
        {
            System.out.println("The Character is in UpperCase");
        }
        else if(ch>='a'&& ch<='z')
        {
            System.out.println("The Character is in LowerCase");
        }
        else {
            System.out.println("Invalid Character");
        }
    }
}
