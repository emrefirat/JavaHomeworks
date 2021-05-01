public class StudentManager extends BaseManager{
    @Override
    public void create(User user) {
        System.out.println(user.getName() + " " + "isimli ogrenci olusturuldu." );
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " " + "isimli ogrenci guncellendi." );
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + " " + "isimli ogrenci silindi." );
    }
}
