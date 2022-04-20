public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailID;

    public String getName() {

        return name;
    }

    public double getCreditLimit() {

        return creditLimit;
    }

    public String getEmailID() {

        return emailID;
    }

    public VipCustomer(){
        // empty constructor-> Default values
        this("Default Name", 2341, "xyzwqerty@greddit.in");
    }
    public VipCustomer(String name, double creditLimit){

        this(name, creditLimit, "Unkown@gmail.com");
    }
    public VipCustomer(String name, double creditLimit, String emailID){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailID = emailID;
    }
}
