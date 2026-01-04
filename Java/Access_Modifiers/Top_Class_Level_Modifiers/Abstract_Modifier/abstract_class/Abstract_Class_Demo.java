package Access_Modifiers.Top_Class_Level_Modifiers.Abstract_Modifier.abstract_class;

public class Abstract_Class_Demo {
    public static void main(String[] args) {
        /*
            abstract_class obj = new abstract_class();

         ==> If the class is declared as abstract then we can't create object for that class.

         ==> If the class can contain atleast one abstract method then copulsory we should
             declared that class as abstract otherwise we will get compile time error.

         ==> If the class does not contain any abstract method still we can declared that
             class as abstract because abstract class can contain zero number of abstract
             method also.

             eg: HttpServlet class is abstract but it doesn't contain abstract method.

         */
    }

}

/*
    Ex . 1 :-
    ========
    class Parent
    {
        public void m1();  --> C.E : missing method body, or declared as abstract
    }

    Ex . 2 :-
    ========
    class Parent
    {
        public abstract void m1()
        {

        }
        --> C.E : abstract method cannot have body

    }





*/
