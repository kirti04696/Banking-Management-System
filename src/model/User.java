/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Kirti Sharma
 */
public class User {
    private int user_id;
    private String name;
    private String password;
    private String user_name;
    private boolean isBlocked;

    public User(int user_id, String name, String password, String user_name, boolean isBlocked) {
        this.user_id = user_id;
        this.name = name;
        this.password = password;
        this.user_name = user_name;
        this.isBlocked = isBlocked;
    }

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", name=" + name + ", password=" + password + ", user_name=" + user_name + ", isBlocked=" + isBlocked + '}';
    }
    
    
}
