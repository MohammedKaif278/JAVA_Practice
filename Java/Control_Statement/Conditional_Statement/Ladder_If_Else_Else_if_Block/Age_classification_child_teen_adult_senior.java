package Control_Statement.Conditional_Statement.Ladder_If_Else_Else_if_Block;

import java.util.Scanner;

public class Age_classification_child_teen_adult_senior
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age=sc.nextInt();
        if(age>=0 && age<=12)
        {
            System.out.println("Child");
        }
        else if(age>=13 && age<=18)
        {
            System.out.println("Teenager");
        }
        else if(age>=19 && age<=59)
        {
            System.out.println("Adult");
        }
        else if(age>=60)
        {
            System.out.println("Senior");
        }
        else {
            System.out.println("Invalid Age");
        }
    }
}
