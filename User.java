public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String nationalIdentity;

    public User() {

    }

    public User(int id, String firstName, String lastName, String emailAddress, String nationalIdentity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.nationalIdentity = nationalIdentity;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
}

