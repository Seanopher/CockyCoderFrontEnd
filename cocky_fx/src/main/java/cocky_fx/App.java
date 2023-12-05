package cocky_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // scene = new Scene(loadFXML("signIn"), 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.show();

        SceneManager.getInstance().setStage(primaryStage);
        SceneManager.getInstance().showLogin();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}