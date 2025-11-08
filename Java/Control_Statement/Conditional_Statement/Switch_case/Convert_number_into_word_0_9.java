package Control_Statement.Conditional_Statement.Switch_case;

import java.util.Scanner;

public class Convert_number_into_word_0_9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (1 - 9)");
        int num=sc.nextInt();

        switch (num)
        {
        case 1:
        System.out.println("one");
            break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("give number between 1 to 9");



        }

    }
}
