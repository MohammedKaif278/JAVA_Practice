package Access_Modifiers.Top_Class_Level_Modifiers.Final_Modifier.final_method;

public class final_method_demo
{

}

class Parent
{
    public void property()
    {
        System.out.println("Cash+land+Gold");
    }

    public final void marry()
    {
        System.out.println("abc");
    }
}

class Child extends Parent
{
    /*
    ==> we cant override marry() method because in parent class marry is declared as final.

    public void marry()
    {
        System.out.println("pqr");
    }

     */
}

/*
final method :-
    If the parent class method is declared as final then we can't override that method in
    child class because it's implementation is final.
 */