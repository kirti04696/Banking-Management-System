/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Kirti Sharma
 */
public class Employee {
    private int emp_id;
    private String name;
    private String user_name;
    private String created_by;//Such as created by admin(admin id)
    private String password;

    public Employee(int emp_id, String name, String user_name, String created_by, String password) {
        this.emp_id = emp_id;
        this.name = name;
        this.user_name = user_name;
        this.created_by = created_by;
        this.password = password;
    }

    public Employee() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
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

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" + "emp_id=" + emp_id + ", name=" + name + ", user_name=" + user_name + ", created_by=" + created_by + ", password=" + password + '}';
    }
    
    
}
