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

public class loginPageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private PasswordField LogInPassword;

    @FXML
    private TextField LogInUserName;

    @FXML
    private Button LoginButton;

    @FXML
    private Button SignInButton;

    @FXML
    void OnClickOpenSignInPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signinPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onClickLogIn(ActionEvent event) {
        String loginUserNameInput = LogInUserName.getText();
        String loginPasswordInput = LogInPassword.getText();
        IUserBaseAccess userAuthDetails = new TextUserAuthenticationBase();
        userAuthDetails.authenticateUsers(loginUserNameInput, loginPasswordInput);
    }

}
