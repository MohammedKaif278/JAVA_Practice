package Access_Modifiers.Inner_Class_Level_Modifiers.Final_Modifier.Final_Instance_Variable;

public class Final_Instance_Variable_Demo
{
    int i; // --> JVM Provide Default For Instance Variables

    /*
    * Final Instance Variable *

     final int j; --> C.E :- [ Variable j might not has been initialized ]

  ==> If the instance variable is declared as final then compulsory we should perform
      initialization explicitly , JVM won't provide any default values.
      whether we using or not.

  ==> For final instance vaariable we have to perform initialization before Constructor complition.

      * This is the following are various Possible Places for this :

        1) At the time of declaration :-
        =============================
        class Test
        {
          final int i=10;
        }


        2) Inside Instance Block :-
        =============================
        class Test
        {
            final int i;
            {
                i=10;
            }
        }


        3) Inside Constructor :-
        =============================
        class Test
        {
            final int i;
            Test()
            {
                i=10;
            }
        }

      ==> If we are performing initialization anywhere else then we will get Compile time error


     */

    public static void main(String[] args) {
        Final_Instance_Variable_Demo obj= new Final_Instance_Variable_Demo();
        System.out.println(obj.i);
    }
}
