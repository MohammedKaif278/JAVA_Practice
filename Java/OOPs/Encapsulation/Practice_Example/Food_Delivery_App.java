package OOPs.Encapsulation.Practice_Example;

class Order
{
    private int orderId;
    private String status;

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId=orderId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        if(status.equals("Placed")||status.equals("Dispached")||status.equals("Delivered"))
        {
        this.status=status;
        }
        else {
            System.out.println("Invalid Status");
        }
    }

}
public class Food_Delivery_App
{
    public static void main(String[] args) {
        Order o1=new Order();
        o1.setOrderId(101);
        o1.setStatus("Placed");


        System.out.println("Order ID : "+o1.getOrderId());
        System.out.println("Status : "+o1.getStatus());
    }
}