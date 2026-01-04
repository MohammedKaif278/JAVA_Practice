package Access_Modifiers.Inner_Class_Level_Modifiers.Protected_Modifier.Pack1;

public class Protected_Modifier_Demo
{

}

class Parent
{
    protected void m1()
    {
        System.out.println("This is a protected method");
    }
}

class Child extends Parent
{
    public static void main(String[] args) {

        Parent obj=new Parent();
        obj.m1();

        Child obj2=new Child();
        obj2.m1();

        Parent obj3=new Child();
        obj3.m1();
    }
}

/*
Protected Modifier:-
==> If the method is declared as prrotected then we can access that method within the current Package
    anywhere either by using Parent reference or by child reference .

==> But we access protected method in outsidde the package only in child class by using
    child reference only that is parent class reference cannot be used to access protected method
    from outside package.


 */