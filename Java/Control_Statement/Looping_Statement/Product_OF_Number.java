package Control_Statement.Looping_Statement;

import java.util.Scanner;

public class Product_OF_Number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int temp=num;
        int product=1;
        while(temp!=0)
        {
            int last_digit=temp%10;
            product=last_digit*product;
            temp=temp/10;
        }

        System.out.println("Product of "+num+ " is "+product);
    }
}

