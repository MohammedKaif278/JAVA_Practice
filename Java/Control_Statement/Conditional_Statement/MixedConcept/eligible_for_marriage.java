package Control_Statement.Conditional_Statement.MixedConcept;

import java.util.Scanner;

public class eligible_for_marriage
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Gender (m/M - f/F)");
        char gender=sc.next().charAt(0);
        System.out.println("Enter your Age : ");
        int age=sc.nextInt();

        if(gender=='M'||gender=='m')
        {
            if(age>=21)
            {
                System.out.println("You are Eligible for Marriage");
            }
            else {
                System.out.println("You are not Eligible For Marriage");
            }
        }
        else if(gender=='F'||gender=='f')
        {
            if(age>=18)
            {
                System.out.println("You are Eligible for MArriage");
            }
            else {
                System.out.println("You are not Eligible For Marriage");
            }
        }
        else {
            System.out.println("Invalid Gender");
        }
    }
}
