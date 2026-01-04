package Access_Modifiers.Inner_Class_Level_Modifiers.Final_Modifier.Final_Local_Variable;

public class Formal_Parameters
{
    public static void main(String[] args) {
      m1(10,20); // ==> Actual Parameter
    }

    public static void m1(final int x,int y) // ==> Formal Parameter
    {
        /*
        Formal Parameter:-
        ==> Formal Parameter of the method are simply acts as a local Variable of that methods
            hence it is possible to declare formal parmeter as final.
        ==> If we declared Formal Parameter as final then we can't reassign it's value within
            that method.

      x=100;
      y=200;

         */
        System.out.println(x+"   "+y);
    }
}
