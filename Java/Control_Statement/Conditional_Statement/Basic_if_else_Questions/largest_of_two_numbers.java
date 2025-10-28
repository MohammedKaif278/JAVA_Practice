package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class largest_of_two_numbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("The largest number is "+num1);
        }
        else {
            System.out.println("The largest number is "+num2);
        }
    }
}
