package gauravchanda7.chatterbox;

public interface IUserBaseAccess {
    boolean createUserBase();
    boolean addUsersInUserBase(String signInUserName, String signInPassword);
    boolean authenticateUsers(String logInUserName, String logInPassword);
}
