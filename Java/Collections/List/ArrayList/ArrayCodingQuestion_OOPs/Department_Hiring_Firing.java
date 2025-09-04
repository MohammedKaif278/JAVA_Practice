package Collections.List.ArrayList.ArrayCodingQuestion_OOPs;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class Department_Hiring_Firing
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Department dept=new Department();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\tNaresh IT");
        System.out.println("-------------------------------------------------------------------------");
        while(true)
        {
        System.out.println("Enter 1 for Hiring");
        System.out.println("Enter 2 for Firing");
        System.out.println("Enter 3 for Department Employees Information");
        System.out.println("Enter 4 for Exit");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Enter Your Choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                System.out.println("Hiring Process");
                System.out.println("Enter Employee name");
                String name=sc.next();
                int id=sc.nextInt();
                dept.hire(name,id);
                System.out.println("Employee "+name+" Hired Successfully ");
            }
            break;

            case 2:
            {
                System.out.println("Firing Process");
                System.out.println("Enter Employee Id");
                int id=sc.nextInt();
                dept.fire(id);
                System.out.println("Employee "+id+" Fired Successsfully");
            }
            break;

            case 3:
            {
                System.out.println("Department Employees Information");
                System.out.println(dept.staff);
            }
            break;
            case 4:
            {
                System.out.println("Thank You Visit Again!");
                return;
            }
            default:

                System.out.println("Enter Valid Choice");

        }
        }


    }

}

class Department
{
    ArrayList<Employee> staff = new ArrayList<>();
    public void hire(String name,int id)
    {
        staff.add(new Employee(name,id));
    }


    public void fire(int id)
    {
        for(int i=0;i<staff.size();i++)
        {
            if(staff.get(i).id==id)
            {
                staff.remove(i);
                break;
            }
        }
    }
}

class Employee
{
    String name;
    int id;
    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public String toString()
    {
        return "{name : "+name+ ", id : "+id+"}";
    }
}