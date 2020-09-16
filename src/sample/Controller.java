package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Window;


public class Controller {



    @FXML
    private TextField inputField;

    @FXML
    private Button submitBtn;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event){

        Window owner = submitBtn.getScene().getWindow();
        if(inputField.getText().isEmpty()){
            Alerts.showAlerts(Alert.AlertType.ERROR, owner, "Error","No FileName");
        }else{
            String filename = inputField.getText();
            Alerts.showAlerts(Alert.AlertType.CONFIRMATION,owner , "Creating","Making File: " + filename );
            Main.CreateProjectButtonPress(filename );
        }


    }

}
