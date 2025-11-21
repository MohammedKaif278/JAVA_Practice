package OOPs.Encapsulation.Practice_Example;

class StudentDetails
{
    private String name;
    private int marks;

    public StudentDetails(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
}
public class Student_Management_App
{
    public static void main(String[] args) {
        StudentDetails s1=new StudentDetails("Mohammed Kaif",89);
        System.out.println("Name : "+s1.getName());
        System.out.println("Marks : "+s1.getMarks());
    }
}
