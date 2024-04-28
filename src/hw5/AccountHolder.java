package hw5;

public class AccountHolder {
    private Name name;
    private PhoneNumber phoneNumber;
    private String ssn;
    private String emailAddress;

    public AccountHolder(Name name, PhoneNumber phoneNumber, String ssn, String emailAddress) {
        this.name = new Name(name); // defensive copy
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
    }

    public AccountHolder(AccountHolder original) {
        this.name = new Name(original.name);
        this.phoneNumber = original.phoneNumber;
        this.ssn = original.ssn;
        this.emailAddress = original.emailAddress;
    }

    public void setName(Name name) {
        this.name = new Name(name);
    }

    public void setFirstName(String firstName) {
        name.setFirst(firstName);
    }

    public void setLastName(String lastName) {
        name.setLast(lastName);
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Name getName() {
        return new Name(name);
    }

    public String getFirstName() {
        return name.getFirst();
    }

    public String getLastName() {
        return name.getLast();
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String toString() {
        return name + " " + phoneNumber + " " + ssn + " " + emailAddress;
    }
}
