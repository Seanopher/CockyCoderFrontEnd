module library {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens library to javafx.fxml;

    exports library;

    opens controllers to javafx.fxml;

    exports controllers;

    opens projectCode to javafx.fxml;

    exports projectCode;
}