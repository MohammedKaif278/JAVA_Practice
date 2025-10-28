package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class year_is_a_leap_year_or_not
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| year%400==0)
        {
            System.out.println("The Year is leap year");
        }
        else {
            System.out.println("The Year is not a Leap Year");
        }
    }
}
