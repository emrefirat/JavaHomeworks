public class InstructorManager extends BaseManager{
    @Override
    public void create(User user) {
        System.out.println(user.getName() + " " + "isimli egitmen olusturuldu." );
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " " + "isimli egitmen guncellendi." );
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + " " + "isimli egitmen silindi." );
    }

    public void addCourse(User user){
        System.out.println(user.getName() + " " + "isimli egitmene ders kurs atandı.");
    }
}
