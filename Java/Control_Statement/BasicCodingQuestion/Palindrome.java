package Control_Statement.BasicCodingQuestion;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int ld=temp%10;
            sum=sum*10+ld;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("Palindrom ");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
