package gauravchanda7.chatterbox;

public interface IUserBaseAccess {
    boolean createUserBase();
    boolean addUser(String username, String address);
    boolean searchUser(String searchUsername);
}
