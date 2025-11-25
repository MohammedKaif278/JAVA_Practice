package OOPs.Inheritance.Hierarchical_Inheritance;

class Employee
{
    public String empName;
    public int empId;
    public double empSalary;

    public Employee(String empName,int empId,double empSalary)
    {
        this.empName=empName;
        this.empId=empId;
        this.empSalary=empSalary;
    }

    public void empDetails()
    {
        System.out.println("Employee name : "+empName);

        System.out.println("Employee Id : "+empId);

        System.out.println("Employee Salary : "+empSalary );
    }
}

class Tester extends Employee
{
    public String testingRole;

    public Tester(String empName,int empId,double empSalary,String testingRole)
    {
        super(empName,empId,empSalary);
        this.testingRole=testingRole;
    }

    public void testerDetails()
    {
        empDetails();
        System.out.println("Testing Role : "+testingRole);
    }
}

class Developer extends Employee
{
    public String programmingLanguage;

    public Developer(String empName,int empId,double empSalary,String programmingLanguage)
    {
        super(empName,empId,empSalary);
        this.programmingLanguage=programmingLanguage;
    }

    public void developerDetails()
    {
        empDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
}



public class Employee_Details
{
    public static void main(String[] args) {
    Tester t1=new Tester("mk",101,25000,"Automation");
    t1.testerDetails();
        System.out.println("==============================");
    Developer sde=new Developer("Mohammed Kaif",102,30000,"Java");
    sde.developerDetails();
    }
}
