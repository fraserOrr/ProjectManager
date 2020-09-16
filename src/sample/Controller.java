package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Controller {
    public Stage uiStage;


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

            Main.CreateProjectButtonPress(filename, owner );
            owner.hide();
        }


    }
    @FXML
    private MenuItem newTask;
    private Accordion accordionContent1;

    @FXML
    protected void insertTask(ActionEvent event){

        String taskName = "test";
        Main.addTask(accordionContent1, taskName);
    }

}
