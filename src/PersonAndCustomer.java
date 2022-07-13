public class PersonAndCustomer {
    public static void main(String[] args) {        // Java class used to test the programs

        // Creates a customer class that will hold five fields.
        Customer customer = new Customer ("Jake", "1442 Northwest Ln", "763-123-4567", "202237",true);

        // Displays users name, address, phone, customer number and if the user wants to be on the mailing list or not
        // Formats the strings
        System.out.println("Name: " + customer.getName() +
                "\nAddress: " + customer.getAddress() +
                "\nPhone: " + customer.getPhone() +
                "\nCustomer Number: " + customer.getCustomerNumber() +
                "\nWants to be on the mailing list: " + (customer.isMailingList() ? "Yes" : "No"));
    }
}
