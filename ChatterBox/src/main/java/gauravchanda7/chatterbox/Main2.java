package gauravchanda7.chatterbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage){
        try{
            Parent loginPage = FXMLLoader.load(getClass().getResource("chatPage.fxml"));
            Scene scene = new Scene(loginPage);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}