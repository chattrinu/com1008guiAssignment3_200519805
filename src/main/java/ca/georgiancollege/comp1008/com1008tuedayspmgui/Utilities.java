package ca.georgiancollege.comp1008.com1008tuedayspmgui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Utilities {
    static void openPage(String fileName, String title) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fileName+"-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
       // String title = "Hello";
       // title = "Login";
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    static Alert showAlert(Alert.AlertType alertType,String title,String message)
    {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        return alert;

    }
}
