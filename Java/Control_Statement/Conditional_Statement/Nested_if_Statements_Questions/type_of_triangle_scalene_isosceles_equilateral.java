package Control_Statement.Conditional_Statement.Nested_if_Statements_Questions;

import java.util.Scanner;

public class type_of_triangle_scalene_isosceles_equilateral
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angles of Triangle : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            if(a==b && b==c)
            {
                System.out.println("Equilateral Traingle");
            }
            else if(a==b || b==c || a==c)
            {
                System.out.println("Isosceles Traingle");
            }
            else {
                System.out.println("Scalene Traingle");
            }
        }
        else {
            System.out.println("The sides do not form a valid traingle");
        }


    }
}
