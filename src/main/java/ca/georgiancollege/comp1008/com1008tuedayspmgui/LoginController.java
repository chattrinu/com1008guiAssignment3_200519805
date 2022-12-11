package ca.georgiancollege.comp1008.com1008tuedayspmgui;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label errorMessage;
    @FXML
    private PasswordField textPassword;

    @FXML
    private TextField textUsername;

    LoginModel model = new LoginModel();

    @FXML
    void onLoginClick(ActionEvent event) {
     //   String receivedUsername = textUsername.getText();
      //  String receivedPassword = textPassword.getText();
     /*   model.processRequest(receivedUsername,receivedPassword);
       // String expectedUsername = "admin",expectedPasssword ="pass";

     //   if(receivedUsername.equals(expectedUsername) && receivedPassword.equals(expectedPasssword))
       // {
       // if(model.validateData()) {
        if(mode)
            errorMessage.setText(" successful login");
         /*  System.out.println("good!");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("good job!!");
            alert.setContentText("you may enter");
            alert.show();*/
            Utilities.showAlert(Alert.AlertType.INFORMATION,"good job","you may enter").show();
            // try to open new page
      /*      try {
                Utilities.openPage("welcome","Welcome Everyone!");
            }
            catch (Exception e)
            {
                Utilities.showAlert(Alert.AlertType.ERROR,"Not found","Cound not load the page");
            }

        }
        else
        {
            System.out.println("bad!!");
            /*
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No good job!!");
            alert.setContentText("you may not enter");
            alert.show();
            errorMessage.setText("Invalid username/password");
        } */
        try {
            model.processRequest(textUsername.getText(),textPassword.getText());
            Utilities.openPage("welcome","welcome");
        }
        catch (Exception e)
        {
            errorMessage.setText(e.getMessage());
        }

    }

    @FXML
    void onRegisterClick(ActionEvent event) {
        try {
            Utilities.openPage("register","Register!!");
        }
        catch (Exception e)
        {
            Utilities.showAlert(Alert.AlertType.ERROR,"Page Load","Could not open").show();
        }
    }
    @FXML
    void initialize()
    {
        errorMessage.setText("");
    }

}


