package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import projectCode.*;
import library.App;
import java.util.UUID;


public class SignupController {
        @FXML private AnchorPane signup_pane;
        @FXML private TextField txt_username;
        @FXML private PasswordField txt_password;
        @FXML private PasswordField txt_v_password;
        @FXML private TextField txt_first_name;
        @FXML private TextField txt_last_name;
        private Label lbl_error;
        private ProjectFacade project;
        private UUID uUID;
        
        @FXML
        private void logInButtonClicked() {
            SceneManager.getInstance().showLogin();
        
    }
    @FXML
    private void signUpButtonClicked(MouseEvent event) throws IOException{

        
        String username = txt_username.getText();
        String password = txt_password.getText();
        String vPassword = txt_v_password.getText();
        String firstName = txt_first_name.getText();
        String lastName = txt_last_name.getText();
        String userType = "user";


        //checks for emptyfields
        if(username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")){
                lbl_error.setText("Sorry, you cant leave blank fields.");
                return;
        }
        else if(!vPassword.equals(password)){
            lbl_error.setText("Passwords dont match");
        }
        /* 
        UserList userList = UserList.getInstance();
        
        if(project.createUser(uUID.randomUUID(), firstName, lastName, password, username) == null){
             lbl_error.setText("Sorry, this user could not be created.");
             return;
        }
        
        //project.login(username, password);
        //User user = project.getCurrentUser();
        */
        App.setRoot("Home");
    }



    @FXML
    private void backButtonClicked() throws IOException {
        App.setRoot("Login");
    }
}