package Variables.Instance_Variables_non_static;

public class How_to_Access
{
    int i=10;
    public static void main(String[] args) { // ==> Static Method
        //But Instance Variable cannot accessed directly from static area.
                //System.out.println(i);

        // by using object reference we can access directly

        How_to_Access obj=new How_to_Access();
        System.out.println(obj.i);
        obj.m1();
    }

    public void m1()// ==> Instance Method
    {
        //Instance Variable can be accessed directly from Instance area
        System.out.println(i);
    }
}
