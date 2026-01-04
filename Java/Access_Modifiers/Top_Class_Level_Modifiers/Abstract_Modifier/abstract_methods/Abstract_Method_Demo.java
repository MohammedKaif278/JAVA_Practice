package Access_Modifiers.Top_Class_Level_Modifiers.Abstract_Modifier.abstract_methods;

public class Abstract_Method_Demo
{

}

/*
Abstract Modifier:-
    ==> Abstract Modifier is applicable for methods and classes but not for variables.

* Abstract Method *
    ==> Abstract method have declaration but not implementation.
    ==> Abstract method declaration is ends with semicolon " ; " .
    ==> Child class is responsible to provide implementation for parent class abstract method.

 */

abstract  class Vehicle
{
    abstract public int getNoOfWheels();
}

class Bus extends Vehicle
{
    public int  getNoOfWheels()
    {
        return 7;
    }
}

class Auto extends Vehicle
{
    public int getNoOfWheels()
    {
        return 3;
    }
}

