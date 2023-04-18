module eren.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens eren.tipcalculator to javafx.fxml;
    exports eren.tipcalculator;
}
