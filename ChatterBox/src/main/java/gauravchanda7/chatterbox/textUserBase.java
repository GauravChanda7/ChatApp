package gauravchanda7.chatterbox;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class textUserBase implements IUserBaseAccess{
    private final String userbase = "C:\\Users\\KIIT\\Desktop\\Project\\ChatApp\\ChatterBox\\src\\main\\resources\\gauravchanda7\\chatterbox\\userBase.txt";
    private final Path filepath = Paths.get(userbase);

    @Override
    public boolean createUserBase() {
        if (Files.exists(filepath)){
            System.out.println("File userBase.txt already exists");
            return true;
        }
        else {
            try {
                Files.createFile(filepath);
                System.out.println("File userBase.txt created");
                return true;
            } catch (IOException e) {
                System.out.println("Error creating userBase.txt");
                return false;
            }
        }
    }

    @Override
    public boolean addUser(String username, String address) {
        try{
            Files.writeString(filepath,username+","+address+"\n", StandardOpenOption.APPEND);
            System.out.println("userBase.txt: "+ username + " : " + address);
            return true;
        } catch (IOException e){
            System.out.println("Error entering data in userAuthbase.txt");
            return false;
        }
    }

    @Override
    public boolean searchUser(String searchUsername) {
        try{
            List<String> users = Files.readAllLines(filepath, StandardCharsets.UTF_8);
            for (String i: users) {
                String [] userDetails = i.split(",");
                if (userDetails[0].equals(searchUsername)){
                    System.out.println("User found");
                    return true;
                }
            }
            System.out.println("User not found");
            return false;
        } catch (IOException e){
            System.out.println("Error in accessing userBase.txt");
            return false;
        }
    }
}
