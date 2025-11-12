package Control_Statement.Conditional_Statement.MixedConcept;

import java.util.Scanner;

public class Validate_simple_login
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username : ");
        String inputuser=sc.nextLine();
        System.out.println("Enter Password : ");
        String inputpass=sc.nextLine();

        if(inputuser.equals("admin")&&inputpass.equals("admin"))
        {
            System.out.println("Login Sucessful");
        }
        else {
            System.out.println("Invalid Username or Password");
        }

    }
}
