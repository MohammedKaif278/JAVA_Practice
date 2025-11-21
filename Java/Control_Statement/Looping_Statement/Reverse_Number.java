package Control_Statement.Looping_Statement;

import java.util.Scanner;

public class Reverse_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
            int last_digit=temp%10;
            rev=rev*10+last_digit;
            temp=temp/10;
        }

        System.out.println("Reversed Number of "+num+" : "+rev);
    }
}
