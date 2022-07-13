public class Customer extends Person {

    private String customerNumber;      // Creates a private variable called customer number
    private boolean IsMailingList;      // creates a boolean variable for mailing list

    public Customer(String name, String address, String phone, String customerNumber, boolean IsMailingList) {      // Creates a constructor
        super(name, address, phone);        // Passes these three variables through the super class

        this.customerNumber = customerNumber;
        this.IsMailingList = IsMailingList;

    }

    public String getCustomerNumber() {     // Creates a getter for customer numbers
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {      // Creates a setter for customer number
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {        // Creates a getter for the boolean variable isMailingList
        return IsMailingList;
    }

    public void setMailingList(boolean MailingList) {       // Creates a setter for the boolean variable isMailingList
        IsMailingList = MailingList;

    }
}
