package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class profit_or_loss
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost Prize");
        double cp=sc.nextDouble();
        System.out.println("Enter the Selling Prize");
        double sp=sc.nextDouble();
        if(sp>cp)
        {
            double profit=sp-cp;
            System.out.println("Your Profit is "+profit);
        }
        else if(sp<cp)
        {
            double loss=cp-sp;
            System.out.println("Your Loss is "+loss);
        }
        else
        {
            System.out.println("No profit No loss");
        }
    }
}
