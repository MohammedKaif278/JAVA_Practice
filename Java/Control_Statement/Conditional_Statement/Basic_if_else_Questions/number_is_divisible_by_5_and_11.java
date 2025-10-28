package Control_Statement.Conditional_Statement.Basic_if_else_Questions;

import java.util.Scanner;

public class number_is_divisible_by_5_and_11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("The Number is Divisible By 5 and 11");
        }
        else
        {
            System.out.println("The Number is Not Divisible by 5 and 11");
        }
    }
}
