package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;

public class SignupController {

    @FXML
    private void logInButtonClicked() {
            SceneManager.getInstance().showLogin();
        
    }
    @FXML
    private void signUpButtonClicked() {
            SceneManager.getInstance().showHomepage();
        
    }
}