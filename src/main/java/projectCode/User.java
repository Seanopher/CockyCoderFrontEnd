package projectCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

/** 
 * @author Cocky Coders
 * creates new user, allows users in and out of projects, and sets the user type
 */
public class User {
    private String firstName;
    private String lastName; 
    private UUID uUID;
    private String username;
    private String userID;
    private String password;
    private String userType;
    private ArrayList<UUID> projects;
    protected UserList userList;
    protected ProjectList projectsList;

    /**
     * user constructor
     * @param userID
     * @param firstName
     * @param lastName
     * @param password
     * @param username
     * @param userType
     */
    public User(UUID userID, String firstName, String lastName, String password, String username, String userType)
    {
        if(userID != null && firstName != null && lastName != null && username !=null && password != null && userType != null)
        {
        this.projects = new ArrayList<UUID>();
        this.userID = userID.toString();
        this.uUID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
        }
    }

    /**
     * creates a new user by taking in parameters
     * @param userID
     * @param firstName
     * @param lastName
     * @param password
     * @param username
     * @param userType
     * @return
     */
    public User(UUID userID, String firstName, String lastName, String password, String username, String userType, ArrayList<UUID> projects){
        if(userID != null && firstName != null && lastName != null &&  username != null && password != null && userType != null){
            this.uUID = userID;
            this.userID = userID.toString();
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.username = username;
            this.userType = userType;
            this.projects = projects;
        }
    }

     /**
     * Getters
     */
    public User getUser(UUID userID){
        return userList.getUser(userID);
    }
    public String getUUID(){
        return userID;
    }
    public String getUsername(){
        return username;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPassword(){
        return password;
    }
    public String getUserType(){
        return userType;
    }
    public ArrayList<UUID> getProjects(){
        return projects;
    }
    public ArrayList<String> displayProjects(User user){
        ArrayList<String> projectList = new ArrayList<String>();
        projectsList = ProjectList.getInstance();
        for(int i = 0; i < user.getProjects().size(); ++i)
        {
            
           projectList.add(projectsList.getProject(projects.get(i)).getProjectName());
        }
        return projectList;
    }
    
    /**
     * takes in a project and adds it to the users ProjectList
     * @param project
     * @return
     */
    public boolean joinProject(Project project){
        if(project != null){
            projects.add(project.getPID());
            return true;
        }
        return false;
    }

    /**
     * boolean that verifies if the user is a part of the project or not
     * user leaves a project by removing it from their project list
     * @param project user input
     * @return true or false
     */
    public boolean leaveProject(Project project){
        for(int i = 0; i < projects.size(); i++){
            if(project.getPID().equals(projects.get(i))){
                projects.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * changes a user type and returns a boolean
     * @param user user input
     * @return if true or false
     */
    public boolean changeType(User user){
        if(user.userType.equalsIgnoreCase("admin")){
            user.userType = "user";
            return true;
        }
        else if(user.userType.equalsIgnoreCase("user")){
            user.userType = "admin";
            return true;
        }
        return false;
    }
}
