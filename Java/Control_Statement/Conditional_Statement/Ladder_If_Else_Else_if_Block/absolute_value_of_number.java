package Control_Statement.Conditional_Statement.Ladder_If_Else_Else_if_Block;

import java.util.Scanner;

public class absolute_value_of_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println(-num);
        }
        else
        {
            System.out.println(num);
        }
    }
}
