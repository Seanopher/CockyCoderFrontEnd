package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController {
    
    @FXML
    private ImageView imageView;

    @FXML
    private HBox hboxContainer;

    @FXML
    private ComboBox<String> projectDropdownNav;

    @FXML
    private ComboBox<String> taskDropdownNav;

    public void initialize() {
        //Image Initialization
        Image image = new Image(getClass().getResource("/cocky_fx/images/user-icon.png").toExternalForm());
        imageView.setImage(image);

        // imageView.setOnMouseClicked(new EventHandler<MouseEvent>()) {
        //     @Override
        //     public void handle(MouseEvent event) {
        //         // Your action here
        //         System.out.println("Image clicked!");
        //     }

        //Project Dropdown Navigation 
        //input backend list of projects the user has 
        projectDropdownNav.getItems().addAll("Project 1", "Project 2", "Project 3"); 
        projectDropdownNav.setValue("Projects");
        projectDropdownNav.setOnAction(event -> handleProjectDropdownSelection()); 
        
        //Task Dropdown Navigation 
        //input backend list of tasks the user has 
        taskDropdownNav.getItems().addAll("Task 1", "Task 2", "Task 3"); //need to input backend list of tasks the user has 
        taskDropdownNav.setValue("Tasks");
        taskDropdownNav.setOnAction(event -> handleTaskDropdownSelection());  
    }
        
    
    private void handleProjectDropdownSelection() {
        String selectedProject = projectDropdownNav.getValue();
        // put in backend data to load a project when the value is selected
        SceneManager.getInstance().showProjectDisplay();
        loadScene("/cocky_fx/ProjectDisplay.fxml", selectedProject);
    }

    private void handleTaskDropdownSelection() {
        String selectedTask = taskDropdownNav.getValue();
        // put in backend data to load a project when the value is selected

        //show selected task display
        loadScene("/cocky_fx/TaskDisplay.fxml", selectedTask);
    }


    private void loadScene(String fxmlPath, String selectedItem) {
    try {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = loader.load();

        // Access the controller of the loaded FXML file
        Object controller = loader.getController();

        // Pass the selected item to the controller
        if(controller instanceof ProjectDisplayController){
            ProjectDisplayController projectDisplayController = (ProjectDisplayController) controller;
            projectDisplayController.setSelectedItem(selectedItem);
        }
        

        Scene currentScene = projectDropdownNav.getScene();
        currentScene.setRoot(root);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

