package gauravchanda7.chatterbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class chatPageController {

    @FXML
    private Button addFriendsButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ScrollPane chatsView;

    @FXML
    private VBox contacts;

    @FXML
    private TextArea messageBox;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField searchBar;

    @FXML
    private Button searchButton;

    @FXML
    private Button sendMessageButton;

    @FXML
    private Button settings;

    @FXML
    private ImageView userImage;

    @FXML
    private Text userName;

    @FXML
    void searchUserFromContacts(ActionEvent event) {

    }

    @FXML
    void searchUsers(ActionEvent event) {

    }

    @FXML
    void sendMessageOnClick(ActionEvent event) {

    }

    @FXML
    void setSettings(ActionEvent event) {

    }

}
