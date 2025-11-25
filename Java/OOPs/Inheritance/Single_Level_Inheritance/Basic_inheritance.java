package OOPs.Inheritance.Single_Level_Inheritance;

class A
{
    public static void stat()
    {
        System.out.println("A.stat");
    }
    public void inst()
    {
        System.out.println("A.inst");
    }
}

class B extends A
{
    public static void stat()
    {
        System.out.println("B.stat");
    }

    public void inst()
    {
        System.out.println("B.inst");
    }
}
public class Basic_inheritance
{
    public static void main(String[] args)
    {
        A a=new B();
        a.stat();
        a.inst();
        System.out.println("-------------------");
        B b=new B();
        b.stat();
        b.inst();
    }
}
