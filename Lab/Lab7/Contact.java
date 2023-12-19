package Lab7;

// import java.util.ArrayList ; 

public class Contact {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String email;

    // constuctor
    public Contact(String firstName, String lastName, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // set
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setphoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setemail(String email) {
        this.email = email;
    }

    // get
    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public long getphoneNumber() {
        return phoneNumber;
    }

    public String getemail() {
        return email;
    }

    public String toString() {
        return firstName + "," + lastName + "," + phoneNumber + "," + email;
    }

}
