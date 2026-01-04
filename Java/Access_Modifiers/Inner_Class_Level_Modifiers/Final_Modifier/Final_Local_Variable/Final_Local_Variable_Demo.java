package Access_Modifiers.Inner_Class_Level_Modifiers.Final_Modifier.Final_Local_Variable;

public class Final_Local_Variable_Demo
{
    public static void main(String[] args) {

        int i; // --> JVM won't Provide Default For Local Variables
               //     Before using it we have to perform initialization

        System.out.println("Hello World");

        /*

    * Final Local Variable *

     System.out.println(i); --> Here we will get Compile time error.

  ==> If the local variable is declared as final then before using only we should perform
      initialization that is if we are not using then it is not required to perform initialization
      even though it is final

       public static void main(String[] args) {
            final int i;
            System.out.println("Hello World");
       }


  ==> The only Applicable Modifier for Local Variable is final.
  ==> If we are not declaring any modifier then by default it is default but this rule is applicable
      for static and innstance variables.

         */
    }
}
