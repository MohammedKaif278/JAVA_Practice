package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class number_is_a_multiple_of_3_or_7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%3==0 || num%7==0)
        {
            System.out.println("The number is a multiple of 3 or 7");
        }
        else {
            System.out.println("The number is not a multiple of 3 or 7");
        }
    }
}
