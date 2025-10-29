package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class largest_among_four_numbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();

        if(num1>=num2 && num1>=num3 && num1>=num4)
        {
            System.out.println(num1+" is largest");
        }
        else if(num2>=num3 && num2>=num4)
        {
            System.out.println(num2+" is largest");
        }
        else if(num3>num4)
        {
            System.out.println(num3+" is largest");
        }
        else {
            System.out.println(num4+" is largest");
        }
    }
}
