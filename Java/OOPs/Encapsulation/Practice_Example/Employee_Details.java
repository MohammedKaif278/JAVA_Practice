package Encapsulation.Practice_Example;

class Employees{
    private int id;
    private String name;
    private double salary;

    // Private variables (Encapsulation) --->  id and name → fixed using constructor
    // Use constructor for required fields.

    Employees(int id, String name) {
        this.id=id;
        this.name=name;
    }

    //Getter Methods
    int getId() {
        return id;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    // Setter Method   ---> salary → changeable using setter
    // Use setter methods for optional or updateable fields.

    void setSalary(double salary)
    {
        this.salary=salary;
    }

    public void display()
    {
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}
public class Employee_Details
{
    public static void main(String[] args) {
    // Object creation using constructor
    Employees emp1=new Employees(1,"mk");

    // Setting salary using setter method
    emp1.setSalary(50000);

    // Display employee details
    emp1.display();

    System.out.println();

    // Accessing values using getters
    System.out.println("Using Getter Methods");
    System.out.println("ID     : " + emp1.getId());
    System.out.println("Name   : " + emp1.getName());
    System.out.println("Salary : " + emp1.getSalary());

    }

}
