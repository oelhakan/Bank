public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
       //THIS CALLS TO THE CONSTRUCTOR WITH THE PARAMETER VALUES WITH PARAMETERS AS DEFAULT VALUES
        this("defaultAccountNumber",0,"defaultCustomerName","defaultEmailAddress","defaultPhoneNumber");
        System.out.println("Empty Constructor is Called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with Parameters is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " was made. Balance after transaction : " + this.balance);
        }else{
            System.out.println("Insufficient Funds. Available Balance : " + this.balance);
        }
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " was made. Balance after transaction : " + this.balance);
    }
}
