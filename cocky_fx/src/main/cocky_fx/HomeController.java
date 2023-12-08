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
import projectCode.*;

public class HomeController {
    
    @FXML private ProjectFacade projectFacade;
    @FXML private ImageView imageView;
    @FXML private HBox hboxContainer;
    @FXML private ComboBox<String> projectDropdownNav;
    @FXML private ComboBox<String> taskDropdownNav;

    public void initialize() {
        projectFacade = new ProjectFacade();
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
        String selectedOption = projectDropdownNav.getValue();
        Project project = projectFacade.project(selectedProject);

        ArrayList<String> columns = projectFacade.displayColumns(project);
        taskDropdownNav.getItems().clear();
        taskDropdownNav.getItems().addAll(columns);
    }

    private void handleTaskDropdownSelection() {
        String selectedOption = taskDropdownNav.getValue();
        // put in backend data to load a project when the value is selected
    }

}

