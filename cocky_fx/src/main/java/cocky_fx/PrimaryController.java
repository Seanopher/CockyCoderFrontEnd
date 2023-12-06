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
    private void loginButtonClicked() {
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

}
