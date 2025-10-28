package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class grade_of_a_student_based_on_marks
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of student:");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("Grade : O");
        }
        else if(marks>80 && marks<=89)
        {
            System.out.println("Grade : A");
        }
        else if(marks>70 && marks<=79)
        {
            System.out.println("Grade : B");
        }
        else if(marks>50 && marks<=69)
        {
            System.out.println("Grade : C");
        }
        else if(marks>35 && marks<=49)
        {
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
