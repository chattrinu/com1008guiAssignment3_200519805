package ca.georgiancollege.comp1008.com1008tuedayspmgui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import java.util.Random;


public class SeatController {
    Random rannum = new Random();
    @FXML
    private TextField name1;

    @FXML
    private TextField name2;

    @FXML
    private TextField name3;

    @FXML
    private TextField name4;

    @FXML
    private TextField name5;

    @FXML
    private TextField name6;

    @FXML
    private TextField name7;

    @FXML
    private TextField name8;

    @FXML
    private TextField name9;
    @FXML
    private Pane seat1;

    @FXML
    private Pane seat2;

    @FXML
    private Pane seat3;

    @FXML
    private Pane seat4;

    @FXML
    private Pane seat5;

    @FXML
    private Pane seat6;

    @FXML
    private Pane seat7;

    @FXML
    private Pane seat8;

    @FXML
    private Pane seat9;

    @FXML
    private Label errorMessage;
    @FXML
    private Button addStudent;
    @FXML
    private ComboBox<String> colorBox;
    @FXML
    private TextField nameInput;

    @FXML
    void onClickAdd(ActionEvent event) {


        int seatnum = rannum.nextInt(0, 8);
        String colorItem = colorBox.getSelectionModel().getSelectedItem();

        if (colorItem.equals("Pink") && !nameInput.getText().equals("")) {
            errorMessage.setText("");
            if (seatnum == 0) {
                seat1.setStyle("-fx-background-color:rgba(255,20,147)");
                name1.setText(nameInput.getText());
            } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(255,20,147)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(255,20,147)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(255,20,147)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(255,20,147)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(255,20,147)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(255,20,147)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(255,20,147)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(255,20,147)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Green") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(11,156,49,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Purple") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(90,34,139,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("White") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(255,255,255,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Red") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(255,0,0,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Blue") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(0,0,255,0.8)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Yellow") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(255,255,0,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Black") && !nameInput.getText().equals("")) {

                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(0,0,0,1)");
                        name9.setText(nameInput.getText());
                    }
                } else if (colorItem.equals("Orange") && !nameInput.getText().equals("")) {
                    errorMessage.setText("");
                    if (seatnum == 0) {
                        seat1.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name1.setText(nameInput.getText());
                    } else if (seatnum == 1) {
                        seat2.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name2.setText(nameInput.getText());
                    } else if (seatnum == 2) {
                        seat3.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name3.setText(nameInput.getText());
                    } else if (seatnum == 3) {
                        seat4.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name4.setText(nameInput.getText());
                    } else if (seatnum == 4) {
                        seat5.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name5.setText(nameInput.getText());
                    } else if (seatnum == 5) {
                        seat6.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name6.setText(nameInput.getText());
                    } else if (seatnum == 6) {
                        seat7.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name7.setText(nameInput.getText());
                    } else if (seatnum == 7) {
                        seat8.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name8.setText(nameInput.getText());
                    } else if (seatnum == 8) {
                        seat9.setStyle("-fx-background-color:rgba(255,165,0,1)");
                        name9.setText(nameInput.getText());
                    }
                } else {
                    errorMessage.setText("Error");
                }

            nameInput.clear();
        }


    @FXML
    private void initialize() {
        errorMessage.setText("");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Pink");
        colorList.add("Green");
        colorList.add("Purple");
        colorList.add("White");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("Orange");
        colorBox.getItems().addAll(colorList);
        colorBox.getSelectionModel().selectFirst();

    }
}





