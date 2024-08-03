package gauravchanda7.chatterbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage){
        try{
            Parent loginPage = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
            Scene scene = new Scene(loginPage);
            stage.setTitle("Chatter Box");
            Image logo = new Image(getClass().getResourceAsStream("logo.jpg"));
            stage.getIcons().add(logo);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}