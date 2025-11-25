package OOPs.Inheritance.Single_Level_Inheritance;

class User
{
    public String name;
    public String mailId;
    public String mobileNo;


    public User(String name,String mailId,String mobileNo)
    {
        this.name=name;
        this.mailId=mailId;
        this.mobileNo=mobileNo;
    }

    public void login()
    {
        System.out.println("Hello "+name+" you have Loggedin Seccessfully");
    }

    public void logout()
    {
        System.out.println("Thankyou "+name+" you have Loggedout Sucessfully");
    }
}


class DeliveryBoy extends User
{
    public String vehicleNumber;
    public String deliveryAddress;

    public DeliveryBoy(String name,String mailId,String mobileNo,String vehicleNumber,String deliveryAddress)
    {
        super(name,mailId,mobileNo);
        this.vehicleNumber=vehicleNumber;
        this.deliveryAddress=deliveryAddress;
    }

    public void pickOrder()
    {
        System.out.println("Order is pickedup.Delivery Boy Vehicle Number "+vehicleNumber+"\nDelivery Boy Mobile Number "+mobileNo);
    }

    public void deliveryOrder()
    {
        System.out.println("Order is Successfully delivered to this location "+deliveryAddress);
    }
}
public class Swiggy_App
{
    public static void main(String[] args) {
    DeliveryBoy xyz=new DeliveryBoy("xyz","xyz@gmail.com","1234567890","MH 08 2456","HYD");
    xyz.login();
        System.out.println("---------------------");
    xyz.pickOrder();
        System.out.println("---------------------");
    xyz.deliveryOrder();
        System.out.println("---------------------");
    xyz.logout();
    }
}
