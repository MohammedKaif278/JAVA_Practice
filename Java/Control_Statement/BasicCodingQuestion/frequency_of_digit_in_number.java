package Control_Statement.BasicCodingQuestion;

import java.util.Scanner;

public class frequency_of_digit_in_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        long number=sc.nextLong();
        System.out.println("Enter the Digit");
        int digit=sc.nextInt();
        int count=0;
        if(number==0 && digit==0) { count=1; }
        else {
            while(number!=0) {
                long lastDigit=number%10;
                if(lastDigit==digit) {
                    count++;
                }
                number=number/10;
            }
        }
        System.out.println("Frequency of "+digit+" is "+count);
    }
}
