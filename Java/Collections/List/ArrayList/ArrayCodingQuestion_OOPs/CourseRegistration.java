package Collections.List.ArrayList.ArrayCodingQuestion_OOPs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CourseRegistration
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    Course c= new Course();
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\tWelcome to Java Course");
        System.out.println("---------------------------------------------------------------");
        while(true)
        {
            System.out.println("Enter 1 for student Registration");
            System.out.println("Enter 2 for student Drop");
            System.out.println("Enter 3 for student list");
            System.out.println("Enter 4 for Exit");
            System.out.println("---------------------------------------------------------------");
            int  choice=sc.nextInt();
            if(choice==4)
            {
                break;
            }
            switch(choice) {
                case 1: {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Enter Student Details");
                    c.enroll(sc.next(), sc.nextInt());
                    System.out.println("Student Registered Successfully");
                    System.out.println("---------------------------------------------------------------");
                }
                break;

                case 2:{
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Enter Student Id");
                    c.drop(sc.nextInt());
                    System.out.println("Student Drop Successfully");
                    System.out.println("---------------------------------------------------------------");
                }break;




                case 3:
                {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Student List");
                    System.out.println(c.list);
                    System.out.println("---------------------------------------------------------------");
                }
                break;

                default:
                    System.out.println("Enter valid Choice");
                    System.out.println("---------------------------------------------------------------");

            }
        }
        System.out.println("Thank You for Checkout");
        System.out.println("---------------------------------------------------------------");

    }
}

class Course
{
    ArrayList<Student> list =new ArrayList<>();

    public void enroll(String name,int id)
    {
        list.add(new Student(name,id));
    }

    public void drop(int id)
    {
        if(list.isEmpty()==false)
        {
            Iterator<Student> i=list.iterator();
            while(i.hasNext())
            {
                Student e=i.next();
                if(e.id==id)
                {
                    i.remove();
                }
            }
        }
    }
}

class Student
{
    String name;
    int id;

    public Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public String toString()
    {
        return "{name : "+name+", id : "+id+"}";
    }
}
