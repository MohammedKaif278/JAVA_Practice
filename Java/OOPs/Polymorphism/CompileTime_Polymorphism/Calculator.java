package OOPs.Polymorphism.CompileTime_Polymorphism;

class Operation
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class Calculator
{
    public static void main(String[] args)
    {
        Operation op=new Operation();
        System.out.println(op.add(1,2));
        System.out.println(op.add(2.0,3.0));
        System.out.println(op.add(1,5,7));
    }

}
