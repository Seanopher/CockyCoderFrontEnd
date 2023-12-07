package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class PrimaryController {


    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    
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

    @FXML
    private TextField newProjectNameField;
    


    @FXML
    private void logInButtonClicked() {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();


        //Need to input logic from backend here
        if(!username.isEmpty() && !password.isEmpty()){
            SceneManager.getInstance().showHomepage();
        }
        else{
            System.out.println("invalid");
        }
        
    }
    @FXML
    private void signUpButtonClicked() {
            SceneManager.getInstance().showSignup();
        
    }
    @FXML
    private void ConfirmProjectButtonClicked() {
            SceneManager.getInstance().showLogin();
            //this needs to be changed later
    }

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
}
