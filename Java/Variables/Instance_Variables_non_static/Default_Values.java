package Variables.Instance_Variables_non_static;

public class Default_Values
{
    int i;
    double d;
    boolean b;
    String s;

    public static void main(String[] args) {
        Default_Values obj=new Default_Values();
        System.out.println(obj.i);
        System.out.println(obj.d);
        System.out.println(obj.b);
        System.out.println(obj.s);

    }
}
