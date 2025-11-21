package OOPs.Encapsulation.Practice_Example;

class BankAccount
{
    private String AccountHolderName;
    private double balance;

    public String getAccountHolderName()
    {
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName)
    {
        this.AccountHolderName=AccountHolderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Amount Deposit : "+amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if(amount>0)
        {
            balance=balance-amount;
            System.out.println("Amount Withdraw : "+amount);
        }
        else
        {
            System.out.println("Invalid withdraw amount");
        }
    }
}

public class BankApp
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        account.setAccountHolderName("Mohammed Kaif ");
        System.out.println("Amount Holder : "+account.getAccountHolderName());
        account.deposit(5000);


        System.out.println("Balance : "+account.getBalance());

        account.withdraw(2000);

        System.out.println("Amount Holder : "+account.getAccountHolderName());
        System.out.println("Balance : "+account.getBalance());


    }
}
