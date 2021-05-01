public class UserManager extends BaseManager{
    @Override
    public void create(User user) {
        System.out.println(user.getName() + " " + "isimli kullanıcı oluşturuldu." );
    }
}
