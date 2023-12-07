package cocky_fx;

import java.io.IOException;
import javafx.fxml.FXML;

public class ProjectDisplayController {
    
    private String selectedItem;

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
        loadDataFromBackend();
    }

    private void loadDataFromBackend() {
        //this would just be the intialization for the back end 
        System.out.println("Loading data for: " + selectedItem);
    }

}