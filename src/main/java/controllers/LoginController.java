package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import library.App;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import projectCode.*;
public class LoginController implements Initializable{


    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    /* 
    @FXML
    protected TextField newTaskNameField;

    @FXML 
    private TextField taskDescriptionField;

    @FXML
    private TextField assignTeamMembersField;

    @FXML
    private TextField taskTypeTextField;

    @FXML
    private TextField taskToDoField;

    */

    @FXML
    private TextField newProjectNameField;
    


    @FXML
    private void logInButtonClicked() throws IOException{
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();


        //Need to input logic from backend here
        if(username.isEmpty() || password.isEmpty() || username.contains(" ") || password.contains(" ")){
            System.out.println("invalid");
            return;
        }          
        
        App.setRoot("Home");
        
        
    }
    
    @FXML
    private void signUpButtonClicked() throws IOException{
        App.setRoot("Signup");
    }

    
    /* 
    @FXML
    private void ConfirmProjectButtonClicked() {
            SceneManager.getInstance().showLogin();
            //this needs to be changed later
    }
    */
    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

    /* 
    @FXML
    private void ConfirmTaskButtonClicked() {
            SceneManager.getInstance().showLogin();
            //This needs to be CHANGED later too
    }
    @FXML
    private void DeleteTaskButtonClicked(){
            SceneManager.getInstance().showDeleteTask();
    }

    //NEEDS BACKEND
    @FXML
    private void RealDeleteTaskButtonClicked(){
            SceneManager.getInstance().showHomepage(); 
            //homepage or Project page?
        //Add code from backend here
    }
    */
}
