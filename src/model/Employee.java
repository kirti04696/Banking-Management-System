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
    private int created_by;//Such as created by admin(admin id)
    private String password;
    private String email;
    private int salary;

    public Employee(int emp_id, String name, String user_name, int created_by, String password, String email, int salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.user_name = user_name;
        this.created_by = created_by;
        this.password = password;
        this.email = email;
        this.salary = salary;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
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
        return "Employee{" + "emp_id=" + emp_id + ", name=" + name + ", user_name=" + user_name + ", created_by=" + created_by + ", password=" + password + ", email=" + email + ", salary=" + salary + '}';
    }

   

    
    
    
}
