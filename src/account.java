public class account {
    private int accountNumber;
    private double balance;
    private String CustomerName;
    private String email;
    private int phoneNumber;

    public account(){
        // setting default values here:-
        this(270002, 4567.99, "Default Name",
                "Default Address", (100)-999022);
       // System.out.println("empty constructor called");
    }
    public account(int accountNumber,double balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.CustomerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. New balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed.");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed. Remaining Balance= "
                    +this.balance
            );
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
