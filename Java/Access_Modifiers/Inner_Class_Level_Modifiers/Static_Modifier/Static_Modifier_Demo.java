package Access_Modifiers.Inner_Class_Level_Modifiers.Static_Modifier;

public class Static_Modifier_Demo
{
    public static void main(String[] args) {
        System.out.println("String[] method");
    }

    public static void main(int[] args) {
        System.out.println("int[] method");
    }
}

/*
    Static Modifier:-
    ==> Static Modifier is applicable for methods , variables , blocks but not for classes.
    ==> we can't declare a class with static modifier but inner classes ( Static nested Classes )
        can be declare as static .

Overloading Concept is applicable for static method including main method also , But JVM will
always call String[] args main method.

The other Overloaded method we have to call explicitly then it will be executed just like the
normal method
 */
