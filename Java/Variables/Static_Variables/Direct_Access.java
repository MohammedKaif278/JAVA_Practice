package Variables.Static_Variables;

public class Direct_Access
{
    static int i=10;
    public static void main(String[] args) {
    Direct_Access da=new Direct_Access();
        System.out.println(da.i);
        System.out.println(Direct_Access.i);
        System.out.println(i);
    }
}

//We can access static Variable by using
//  1) object name
//  2) class name
//  3) variable name