package OOPs.Abstraction.Practice_Examples;

interface Notifier
{
    void notify(String message);
}

class EmailNotifier implements Notifier
{
    public void notify(String message)
    {
        System.out.println("Email -> "+message);
    }
}

class SmsNotifier implements Notifier
{
    public void notify(String message)
    {
        System.out.println("SMS -> "+message);
    }
}

class NotifierFactory
{
    public static Notifier create(String type) throws IllegalAccessException {
        if(type.equals("Email"))
        {
            return new EmailNotifier();
        }
        if(type.equals("sms"))
        {
            return new SmsNotifier();
        }
        throw new IllegalAccessException("Invalid Type");
    }
}

public class Notification_System
{
    public static void main(String[] args) throws IllegalAccessException {
        Notifier notifier= NotifierFactory.create("Email");
        notifier.notify("Server is Down");
        Notifier notifier2=NotifierFactory.create("sms");
        notifier2.notify("Network Down");
    }
}
