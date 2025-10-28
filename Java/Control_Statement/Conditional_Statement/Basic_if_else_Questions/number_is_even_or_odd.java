package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class number_is_even_or_odd
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
