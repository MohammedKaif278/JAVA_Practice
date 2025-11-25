package OOPs.Inheritance.Multi_Level_Inheritance;

class Account
{
    public String accountNumber;
    public double balance;

    public Account(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void checkBalance()
    {
        System.out.println("Balance is : "+balance);
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Amount Deposit Successfully");
    }

    public void withdraw(double amount)
    {
        balance=balance-amount;
        System.out.println("Amount withdraw Successfully");
    }

}

class BankAccount extends Account
{
    public String bankName;
    public String ifscCode;

    public BankAccount(String accountNumber,double balance, String bankName,String ifscCode)
    {
        super(accountNumber,balance);
        this.bankName=bankName;
        this.ifscCode=ifscCode;
    }
    public void bankDetails()
    {
        System.out.println("Bank Name is : "+bankName+"\nBank IFSC Code : "+ifscCode);
    }
}

class SavingAccount extends BankAccount
{
    public double interestRate;

    public SavingAccount(String accountNumber,double balance, String bankName,String ifscCode,double interestRate)
    {
        super(accountNumber,balance,bankName,ifscCode);
        this.interestRate=interestRate;
    }

    public void calculateInterest()
    {
        System.out.println("Interest Rate is : "+(balance*interestRate)/100.0);
    }
}

public class PhonePay_App
{
    public static void main(String[] args)
    {
        SavingAccount acc1=new SavingAccount("SBI123456789",5000.00,"StateBank Of India","SBI4040",10);
       acc1.bankDetails();
        acc1.checkBalance();
        System.out.println("===================");
        acc1.deposit(2000);
        acc1.checkBalance();
        System.out.println("===================");
        acc1.withdraw(1000);
        acc1.checkBalance();
        System.out.println("===================");
        acc1.calculateInterest();

    }
}
