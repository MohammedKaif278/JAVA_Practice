package Control_Statement.Looping_Statement;

import java.util.Scanner;

public class Armstrong_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int sum=0;

        while(temp>0)
        {
            int last_digit=temp%10;
            sum=sum+(last_digit*last_digit*last_digit);
            temp=temp/10;
        }

        if(sum==number)
        {
            System.out.println("The Given Number is Armstrong");
        }
        else
        {
            System.out.println("the given Number is not Armstrong");
        }

    }
}
