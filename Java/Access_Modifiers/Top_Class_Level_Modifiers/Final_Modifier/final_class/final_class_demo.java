package Access_Modifiers.Top_Class_Level_Modifiers.Final_Modifier.final_class;

public class final_class_demo
{

}


final class Parent
{


}

/*

final Class:-
    If the Parent Class is declared as final then we can't create child class for that class ,
    i.e inheritance is not possible for final class.

===================================================================================
 Note:-
    final class Parent
    {
        ==> Every method present inside final class is always by default final whether we are
         decalring or not.
         But every variable present inside a final class is not be final

        void m1()  [By default - final]
        {

        }
    }
======================================================================================

class child extends Parent
{
    [ Compile time error ] : cannot inherits from final Parent class
}

 */