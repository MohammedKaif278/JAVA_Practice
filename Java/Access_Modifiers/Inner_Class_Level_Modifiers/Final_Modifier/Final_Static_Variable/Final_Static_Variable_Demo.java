package Access_Modifiers.Inner_Class_Level_Modifiers.Final_Modifier.Final_Static_Variable;

public class Final_Static_Variable_Demo
{
    static int i; // --> JVM Provide Default For Static Variables

     /*
    * Final Static Variable *

     final static int j;  C.E :- [ Variable j might not has been initialized ]

  ==> If the static variable is declared as final then compulsory we should perform
      initialization explicitly , JVM won't provide any default values.
      whether we using or not.

  ==> For final static vaariable we have to perform initialization before class loading complition.

      * This is the following are various Possible Places for this :

        1) At the time of declaration :-
        =============================
        class Test
        {
          final static int i=10;
        }


        2) Inside static Block :-
        =============================
        class Test
        {
            final int i;
           static
            {
                i=10;
            }
        }


      ==> If we are performing initialization anywhere else then we will get Compile time error


     */

    public static void main(String[] args) {
        System.out.println(i);
    }
}
