package Access_Modifiers.Inner_Class_Level_Modifiers.Public_Modifier.Pack1;

public class A
{
    public void m1()
    {
        System.out.println("A class method");
    }
}
/*
public member:-
==> If the member declared as then we can that member from anywhere but corrensponding
    class should be visible (public) that is before checking member visibility we have to check
    class visibility.


==> If the m1() method is declared as public but the class is not declared as public then we
    can't access m1() method in class B
    i.e both classes and methods are public then only we can access that m1() method in class B
    or outside package.

 */