package Control_Statement.Looping_Statement;

import java.util.Scanner;

public class Sum_of_digit_of_num
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int sum=0;

        while(num!=0)
        {
            int last_digit=num%10;
            sum=sum+last_digit;
            num=num/10;
        }
        System.out.println("The Sum of the digit of number : "+sum);
    }
}
