package example.taskapp.model;
import javafx.concurrent.Task;

import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    private int userId;
    private int userLevel;
    private int xp;
    private ArrayList<Task> tasks;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    //getters

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public int getUserId() {
        return userId;
    }
    public int getUserLevel() {
        return userLevel;
    }
    public int getXp() {
        return xp;
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    //

}
