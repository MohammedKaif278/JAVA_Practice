package Control_Statement.Conditional_Statement.MixedConcept;

import java.util.Scanner;

public class Convert_marks_into_GPA
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("GPA : 4.0");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("GPA : 3.5");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("GPA : 3.0");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("GPA : 2.5");
        }
        else
        {
            System.out.println("GPA : 2.0");
        }

    }
}
