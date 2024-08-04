package gauravchanda7.chatterbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class signinPageController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private PasswordField LogInPassword;

    @FXML
    private PasswordField LogInRePassword;

    @FXML
    private TextField LogInUserName;

    @FXML
    private Button LoginButton;

    @FXML
    private Button SignInButton;

    @FXML
    void OnClickOpenLogInPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onClickSignIn(ActionEvent event) throws IOException {
        IUserBaseAccess userBaseAccess = new TextUserAuthenticationBase();
        String username = LogInUserName.getText();
        String password = LogInPassword.getText();
        String rePassword = LogInRePassword.getText();
        if (password.equals(rePassword)){
            userBaseAccess.createUserBase();
            userBaseAccess.addUsersInUserBase(username, password);
            root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            System.out.println("Re enter correct Password");
        }

    }

}
