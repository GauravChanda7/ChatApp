package gauravchanda7.chatterbox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class textContactsBase implements IContactBase{
    private final String contactbase = "C:\\Users\\KIIT\\Desktop\\Project\\ChatApp\\ChatterBox\\src\\main\\resources\\gauravchanda7\\chatterbox\\contactBase.txt";
    private final Path filepath = Paths.get(contactbase);

    @Override
    public boolean createUserBase() {
        if (Files.exists(filepath)){
            System.out.println("File contactBase.txt already exists");
            return true;
        }
        else {
            try {
                Files.createFile(filepath);
                System.out.println("File contactBase.txt created");
                return true;
            } catch (IOException e) {
                System.out.println("Error entering data in contactBase.txt");
                return false;
            }
        }
    }

    @Override
    public boolean addNewContact(String username) {
        return false;
    }

    @Override
    public String[] fetchContacts() {
        return new String[0];
    }
}
