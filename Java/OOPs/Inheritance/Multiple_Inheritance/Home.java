package Inheritance.Multiple_Inheritance;

interface Father{
    void show();
}

interface Mother{
    void display();
}


class Child implements Father,Mother{
    @Override
    public void show(){
        System.out.println("Father Method");
    }

    public void display() {
        System.out.println("Mother Method");
    }


}
public class Home {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
        c.display();
    }
}
