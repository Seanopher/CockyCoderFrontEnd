package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class HomeController {
    
    @FXML
    private ImageView imageView;

    @FXML
    private HBox hboxContainer;

    public void initialize() {
        // Replace "/path/to/your/image.png" with the actual path to your image file
        Image image = new Image(getClass().getResource("/cocky_fx/images/user-icon.png").toExternalForm());
        imageView.setImage(image);

        imageView.setOnMouseClicked(new EventHandler<MouseEvent>()) {
            @Override
            public void handle(MouseEvent event) {
                // Your action here
                System.out.println("Image clicked!");
            }
    }


}
