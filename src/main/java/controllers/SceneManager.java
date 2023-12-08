package controllers;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SceneManager {
    private static SceneManager instance = new SceneManager();
    private Stage stage;

    private SceneManager() {
    }

    public static SceneManager getInstance() {
        return instance;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private void loadScene(String fxmlFile, String styleSheet) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource(styleSheet).toExternalForm());

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showLogin() {
        loadScene("Login.fxml", "styles.css");
    }

    
    public void showSignup() {
        loadScene("Signup.fxml", "styles.css");
    }


    public void showHomepage() {
        loadScene("Home.fxml", "styles.css");
    }

    public void showNewProject() {
        loadScene("NewProject.fxml","styles.css");
    }

    public void showNewTask() {
        loadScene("NewTask.fxml", "styles.css");
    }
    public void showDeleteTask() {
        loadScene("DeleteTask.fxml", "styles.css");
    }

    

}
