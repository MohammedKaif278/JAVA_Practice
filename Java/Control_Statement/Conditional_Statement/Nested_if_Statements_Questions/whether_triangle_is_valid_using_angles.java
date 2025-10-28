package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class whether_triangle_is_valid_using_angles
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Angle of Traingle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b+c)==180 && a>0 && b>0 && c>0)
        {
            System.out.println("Valid Traingle");
        }
        else {
            System.out.println("Invalid Traingle");
        }
    }
}
