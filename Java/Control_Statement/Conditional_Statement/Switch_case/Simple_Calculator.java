package Control_Statement.Conditional_Statement.Switch_case;

import java.util.Scanner;

public class Simple_Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("1. Substraction");
        System.out.println("1. Multiplication");
        System.out.println("1. Division");

        System.out.println("Enter your Choice");
        int choice=sc.nextInt();

        System.out.println("Enter 1st number");
        int num1=sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition : "+(num1+num2));
                break;
            case 2:
                System.out.println("Substraction : "+(num1-num2));
                break;
            case 3:
                System.out.println("Substraction : "+(num1*num2));
                break;
            case 4:
                System.out.println("Substraction : "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
