module ca.georgiancollege.comp1008.com1008tuedayspmgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008.com1008tuedayspmgui to javafx.fxml;
    exports ca.georgiancollege.comp1008.com1008tuedayspmgui;
}