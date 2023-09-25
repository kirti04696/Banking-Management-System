/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Kirti Sharma
 */
public class Admin {
    private int admin_id;
    private String name;
    private String user_name;
    private String password;

    public Admin(int admin_id, String name, String user_name, String password) {
        this.admin_id = admin_id;
        this.name = name;
        this.user_name = user_name;
        this.password = password;
    }

    public Admin() {
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "admin_id=" + admin_id + ", name=" + name + ", user_name=" + user_name + ", password=" + password + '}';
    }
    
    
    
}
