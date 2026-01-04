package Variables.Static_Variables;

public class Class_Level_Variables
{
    static  int x=10;
    int y=20;
    public static void main(String[] args) {
        Class_Level_Variables obj=new Class_Level_Variables();
        obj.x=888;
        obj.y=999;
        Class_Level_Variables obj2=new Class_Level_Variables();
        System.out.println(obj2.x+"......."+obj2.y);
    }
}
