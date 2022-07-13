public class Person {

    private String name, address, phone;    // Sets private variables in persons class


    public Person(String name, String address, String phone) {      // Creates a constructor
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {       // Creates a getter for the string name
        return name;
    }

    public void setName(String name) {      // Creates a setter for the string name
        this.name = name;
    }

    public String getAddress() {        // Creates a getter for string address
        return address;
    }

    public void setAddress(String address) {        // Creates a setter for string address
        this.address = address;
    }

    public String getPhone() {      // Creates a getter for string phone
        return phone;
    }

    public void setPhone(String phone) {        // Creates a setter for string phone
        this.phone = phone;
    }
}
