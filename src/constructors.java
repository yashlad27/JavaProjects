public class constructors {
    public static void main(String[] args){
        account bosAccount = new account();

        account bobsAccount = new account(567732,178293,"BOB brown",
                "yashlad828@gmail", 83203291);
        System.out.println("Account Number: "+bobsAccount.getAccountNumber());
        System.out.println("Account Balance: "+bobsAccount.getBalance());
        System.out.println("Customer Name: "+bobsAccount.getCustomerName());
        System.out.println("Customer Email: "+bobsAccount.getEmail());
        System.out.println("Customer Phone Number: "+bobsAccount.getPhoneNumber());

        System.out.println("--------------------------VIP------------------------------");
        VipCustomer jenAccount = new VipCustomer();
        System.out.println(jenAccount.getName());
        System.out.println(jenAccount.getCreditLimit());
        System.out.println(jenAccount.getEmailID());

        VipCustomer person1 = new VipCustomer("JENNY", 5000);
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailID());

        VipCustomer person2 = new VipCustomer("James", 798000, "james@bond.in");
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailID());

//        bosAccount.setAccountNumber(2355311);
//        bosAccount.setCustomerName("BOB Fletcher");
//
//        bosAccount.withdrawal(100.0);
//        bosAccount.deposit(100000000000.0);
//        bosAccount.withdrawal(693420549);
    }
}
