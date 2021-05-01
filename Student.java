public class Student extends User{
    private int studentId;

    public Student(){

    }

    public Student(int id, String firstName, String lastName, String emailAddress, String nationalIdentity, int studenId) {
        super(id, firstName, lastName, emailAddress, nationalIdentity);
        this.studentId = studenId;
    }



    public int getStudenId() {

        return studentId;
    }

    public void setStudenId(int studenId) {

        this.studentId = studenId;
    }
}

