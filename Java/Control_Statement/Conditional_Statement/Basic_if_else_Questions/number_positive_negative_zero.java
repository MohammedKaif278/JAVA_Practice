package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class number_positive_negative_zero
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}
