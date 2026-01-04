package Access_Modifiers.Top_Class_Level_Modifiers.Strictfp;

strictfp class Strictfp_Demo
{
    public static strictfp void main(String[] args) {
        System.out.println(10.0/3);
    }
}

/*
Strictfp Modifier:-
==> If a method declared as strictfp then all the floaatinf point calculations in that
    method follows IEEE 754 standards

==> If a class is declared as strictfp then all the method present in that class follow
IEEE 754 standard for floting point arithmetic.

 */
