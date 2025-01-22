module example.taskapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.taskapp to javafx.fxml;
    exports example.taskapp;
}