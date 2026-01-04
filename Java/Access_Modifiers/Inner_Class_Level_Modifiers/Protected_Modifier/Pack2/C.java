package Access_Modifiers.Inner_Class_Level_Modifiers.Protected_Modifier.Pack2;

import Access_Modifiers.Inner_Class_Level_Modifiers.Public_Modifier.Pack1.A;

/*
Outside Package only child class Can Access
 */
public class C extends A
{
    public static void main(String[] args) {
        A a=new A();
        a.m1();

        C c=new C();
        c.m1();

        A a1=new C();
        a1.m1();
    }
}

/*
Here we cannot access
class D
{
    A a=new A();
    a.m1();
}

 */
