package JUnit.BTVN2;

public interface IUserBusiness {
    public boolean login(String userName, String password, String md5);
    public boolean register(String userName, String email, String password);
}
