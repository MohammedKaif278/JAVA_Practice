package Control_Statement.Conditional_Statement.Ladder_If_Else_Else_if_Block;

import java.util.Scanner;

public class Calculate_body_mass_index_BMI_and_classify
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Weight (KG) : ");
        double weight=sc.nextDouble();
        System.out.println("Enter your Height (m) : ");
        double height=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("Your BMI  is : "+bmi);
        if(bmi<18.5)
        {
            System.out.println("UnderWeight");
        }
        else if(bmi>=18.5 && bmi<=24.9)
        {
            System.out.println("Normal Weight");
        }
        else if(bmi>=25 && bmi<=29.9)
        {
            System.out.println("OverWeight");
        }
        else
        {
            System.out.println("obese");
        }
    }
}
