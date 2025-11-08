package Control_Statement.Conditional_Statement.Ladder_If_Else_Else_if_Block;

import java.util.Scanner;

public class Temperature_check_hot_cold_moderate
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature");
        int temp=sc.nextInt();
        if(temp<=15)
        {
            System.out.println("Cold");
        }
        else if(temp>=16 && temp<=30)
        {
            System.out.println("Moderate");
        }
        else
        {
            System.out.println("Hot");
        }
    }
}
