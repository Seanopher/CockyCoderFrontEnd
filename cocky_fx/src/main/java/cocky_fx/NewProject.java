package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class NewProject {

    @FXML
    private TextField newProjectNameField;
    
   
    @FXML
    private void ConfirmProjectButtonClicked() {
            SceneManager.getInstance().showLogin();
            //this needs to be changed later
    }

   
}
