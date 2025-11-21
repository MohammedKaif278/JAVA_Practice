package OOPs.Abstraction.Practice_Examples;

abstract class Animal
{
    abstract void sound();
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("I am Dog");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("I am Cat");
    }
}
public class Animal_Sound
{
    public static void main(String[] args)
    {
        Animal a1=new Dog();
        a1.sound();
        Animal a2=new Cat();
        a2.sound();
    }
}
