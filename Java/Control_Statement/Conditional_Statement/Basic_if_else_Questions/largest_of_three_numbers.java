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

        int max=num1;
        if(num2>num1)
        {
            max=num2;
            System.out.println("The largest Number is "+max);
        }
        else if(num3>num1)
        {
            max=num3;
            System.out.println("The largest Number is "+max);
        }
        else {
            max=num1;
            System.out.println("The largest Number is "+max);
        }

    }
}
