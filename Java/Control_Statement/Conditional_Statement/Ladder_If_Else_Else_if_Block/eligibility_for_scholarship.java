package Control_Statement.Conditional_Statement.Ladder_If_Else_Else_if_Block;

import java.util.Scanner;

public class eligibility_for_scholarship
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks (0 - 100)");
        int marks=sc.nextInt();
        System.out.println("Enter Your Annual Income");
        double income=sc.nextDouble();
        if(marks>=85 && income<=200000)
        {
            System.out.println("Your are Eligible for Scholarship");
        }
        else {
            System.out.println("Your are not Eligible for Scholarship");
        }
    }
}
