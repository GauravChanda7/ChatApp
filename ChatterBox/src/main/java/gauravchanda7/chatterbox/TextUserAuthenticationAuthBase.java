package gauravchanda7.chatterbox;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class TextUserAuthenticationAuthBase implements IUserAuthBaseAccess {

    private final String userauthbase = "C:\\Users\\KIIT\\Desktop\\Project\\ChatApp\\ChatterBox\\src\\main\\resources\\gauravchanda7\\chatterbox\\userAuthBase.txt";
    private final Path filepath = Paths.get(userauthbase);

    @Override
    public boolean createUserBase() {
        if (Files.exists(filepath)){
            System.out.println("File userbase.txt already exists");
            return true;
        }
        else {
            try {
                Files.createFile(filepath);
                System.out.println("File userAuthbase.txt created");
                return true;

            }catch (IOException e){
                System.out.println("Error creating userAuthbase.txt");
                return false;
            }
        }
    }


    @Override
    public boolean addUsersInUserBase(String username, String password) {
        try {
            Files.writeString(filepath, username + "," + password + "\n", StandardOpenOption.APPEND);
            System.out.println("userAuthbase.txt: "+ username + " : " + password);
            return true;
        } catch (IOException e){
            System.out.println("Error entering data in userAuthbase.txt");
            return false;
        }
    }

    @Override
    public boolean authenticateUsers(String logInUserName, String logInPassword) {
        try {
            List<String> users = Files.readAllLines(filepath, StandardCharsets.UTF_8);
            for (String i : users){
                String[] userAuthDetails = i.split(",");
                if (userAuthDetails[0].equals(logInUserName) && userAuthDetails[1].equals(logInPassword)){
                    System.out.println("Login");
                    return true;
                }
            }
            System.out.println("Wrong Auth Details");
            return false;
        } catch (IOException e) {
            System.out.println("Authentication Failed");
            return false;
        }
    }
}
