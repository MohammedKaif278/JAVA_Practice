package Control_Statement.Conditional_Statement.Switch_case;

import java.util.Scanner;

public class Traffic_light_color
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Color");
        String color=sc.nextLine().toLowerCase();

        switch (color)
        {
            case "red":
                System.out.println("Stop ! THE COLOR IS RED");
                break;

            case "yellow":
                System.out.println("Caution ! THE COLOR IS YELLOW . GET READY TO STOP");
                break;

            case "green":
                System.out.println("Go ! THE COLOR IS GREEN");
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}
