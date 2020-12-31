public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234",500,"Onur","onur@icloud.com","+48516336091");
        System.out.println("*********************************");
        System.out.println("Account Number : " + bankAccount.getAccountNumber());
        System.out.println("Customer Name : " + bankAccount.getCustomerName());
        System.out.println(("Email Address : " + bankAccount.getEmail()));
        System.out.println("Phone Number : " + bankAccount.getPhoneNumber());
        System.out.println("Balance : " + bankAccount.getBalance());
        System.out.println("*********************************");
        bankAccount.withdraw(10);
        bankAccount.withdraw(70);
        bankAccount.deposit(570);
        bankAccount.withdraw(400);
        bankAccount.withdraw(300);
        bankAccount.withdraw(90);
        bankAccount.withdraw(5);
    }
}
