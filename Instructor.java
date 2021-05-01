public class Instructor extends User{
    private double salary;
    public  Instructor(){
    }

    public Instructor(int id, String firstName, String lastName, String emailAddress, String nationalIdentity, double salary) {
        super(id, firstName, lastName, emailAddress, nationalIdentity);
        this.salary = salary;
    }
//dasd


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
