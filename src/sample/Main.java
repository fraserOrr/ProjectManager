package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Project Manager");
        //primaryStage.setScene(new Scene(root, 300, 275));


        //
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Button newProjectbtn = new Button("New Project");
        Button openProjectbtn = new Button("Open Project");

        grid.add(newProjectbtn, 0, 1);
        grid.add(openProjectbtn, 1,1);
        //
        openProjectbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        newProjectbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    NewProject();
                }catch(Exception e){
                    System.out.println("Error: " + e);
                }

            }
        });
        //

        Scene scene = new Scene(grid, 300, 275);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void NewProject() throws Exception{
        Stage newProjectPopUp = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("newProject.fxml"));
        newProjectPopUp.setTitle("New Project");


        Node submitBtn =  root.lookup("submitBtn");
        Node inputField = root.lookup("inputField");


        newProjectPopUp.setScene(new Scene(root, 300, 275));
        newProjectPopUp.show();
    }
    public static void CreateProjectButtonPress(String FileName){
        
    }



    public static void main(String[] args) {
        launch(args);
    }

}


