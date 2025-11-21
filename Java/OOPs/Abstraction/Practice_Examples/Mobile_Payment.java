package OOPs.Abstraction.Practice_Examples;

abstract class Payment
{
    abstract void paymentProcess(double amount);

    void paymentSuccess()
    {
        System.out.println("PAYMENT SUCCESS");
    }
}

class CreditCard extends Payment
{
    void paymentProcess(double amount)
    {
        System.out.println("Processing Credit Card Paymeny of Rs : "+amount);
    }
}

class UPI extends Payment
{
    void paymentProcess(double amount)
    {
        System.out.println("Processing Upi payment of Rs : "+amount);
    }
}


public class Mobile_Payment
{
    public static void main(String[] args)
    {
    Payment p1=new CreditCard();
    p1.paymentProcess(5000.0);
    p1.paymentSuccess();
    Payment p2=new UPI();
    p2.paymentProcess(25000.0);
    p2.paymentSuccess();
    }
}
