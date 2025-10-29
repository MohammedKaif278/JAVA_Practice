package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class largest_of_three_numbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
        int num1= sc.nextInt();
        System.out.println("Enter The Second Number");
        int num2= sc.nextInt();
        System.out.println("Enter The Third Number");
        int num3= sc.nextInt();


        if(num1>num2 && num1>num3)
        {
            System.out.println("The largest Number is "+num1);
        }
        else if(num2>num3)
        {
            System.out.println("The largest Number is "+num2);
        }
        else {
            System.out.println("The largest Number is "+num3);
        }

    }
}
