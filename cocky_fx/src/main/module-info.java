module cocky_fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens cocky_fx to javafx.fxml;
    exports cocky_fx;
}
