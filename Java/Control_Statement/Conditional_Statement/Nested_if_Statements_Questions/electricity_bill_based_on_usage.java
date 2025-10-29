package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class electricity_bill_based_on_usage
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter usage of electricity in units : ");
        int unit=sc.nextInt();
        if(unit>0)
        {
            System.out.println(unit*10);
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
