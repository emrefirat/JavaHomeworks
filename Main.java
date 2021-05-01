public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Emre","FIRAT","emre@localhost.local","1234864646",10);

        BaseManager baseManager = new UserManager();
        baseManager.create(student1);

    }
}
