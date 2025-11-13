package edu.gsu.cis3270.cis3270testrepository;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TopMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!_Evanedittest");
    }
}
