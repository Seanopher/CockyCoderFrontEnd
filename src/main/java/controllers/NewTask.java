package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewTask {

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
    private void logInButtonClicked() {
            SceneManager.getInstance().showLogin();
        
    }
    @FXML
    private void signUpButtonClicked() {
            SceneManager.getInstance().showSignup();
        
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