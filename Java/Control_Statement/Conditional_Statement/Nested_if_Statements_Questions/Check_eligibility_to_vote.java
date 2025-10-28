package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class Check_eligibility_to_vote
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }

    }
}
