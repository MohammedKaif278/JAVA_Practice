package Control_Statement.Conditional_Statement.MixedConcept;

import java.util.Scanner;

public class Check_if_year_century_year
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year");
        int year=sc.nextInt();
        if(year%100==0)
        {
            System.out.println("The year is Century Year");
        }
        else {
            System.out.println("The year is not Century Year");
        }
    }
}
