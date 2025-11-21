package OOPs.Abstraction.Practice_Examples;

abstract class Device
{
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Device
{
    void turnOn()
    {
        System.out.println("Fan is spining");
    }

    void turnOff()
    {
        System.out.println("Fan is Stopped");
    }
}

class Tv extends Device
{
    void turnOn()
    {
        System.out.println("Tv is On");
    }

    void turnOff()
    {
        System.out.println("Tv is off");
    }
}

class LightBulb extends Device
{
    void turnOn()
    {
        System.out.println("Light bulb is On");
    }

    void turnOff()
    {
        System.out.println("Ligth Bulb is Off");
    }
}


 class HelperClass
{
    public static Device getObject(String dvc)
    {
        switch (dvc)
        {
            case "Fan": return new Fan();
            case "Tv": return new Tv();
            case "LightBulb": return new LightBulb();
            default: return null;
        }
    }
}


public class Device_turnON_or_turnOFF
{
    public static void main(String[] args) {
    Device d1=HelperClass.getObject("Fan");
    Device d2=HelperClass.getObject("Tv");
    d1.turnOn();
    d1.turnOff();
    d2.turnOn();
    d2.turnOff();
    }
}
