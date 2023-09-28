/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.login.pkginterface.databaseaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Employee;
import model.User;

/**
 *
 * @author Kirti Sharma
 */
public class DbUtils {
    private Connection con;
    public DbUtils() {
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management_system?useSSL=false&allowPublicKeyRetrieval=true","root","Gniot@2023"); 
          
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void addEmployee(Employee emp) throws SQLException{
        
        PreparedStatement p = con.prepareStatement("insert into employee(name,user_name,password,email,salary) values(?,?,?,?,?);");
        p.setString(1, emp.getName());
        p.setString(2, emp.getUser_name());

        p.setString(3, emp.getPassword());
        p.setString(4, emp.getEmail());
        p.setInt(5, emp.getSalary());
        p.execute();
        
    }
    
    public Employee getEmployeeByUserName(String userName) throws SQLException{
        
        PreparedStatement p = con.prepareStatement("select employee_id, name, user_name, created_by, password, email, salary from employee where user_name =?;");
        p.setString(1, userName);
        ResultSet res=p.executeQuery();
        
        boolean b = res.next();
        if(b){
            Employee emp = new Employee(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getInt(4),
                    res.getString(5),
                    res.getString(6),
                    res.getInt(7)
            );
            return emp;
        }
        
        return null;
    }
    
    public void addUser(User user) throws SQLException{
        PreparedStatement p = con.prepareStatement("insert into user(name,user_name,password,address,contact) values(?,?,?,?,?);");
        p.setString(1, user.getName());
        p.setString(2, user.getUser_name());
        p.setString(3, user.getPassword());
        p.setString(4, user.getAddress());
        p.setString(5, user.getContact());
        p.execute();
    }
    
    
    public User getUserIdByUserName(String userName) throws SQLException{
         PreparedStatement p = con.prepareStatement("select user_id, name,  password,user_name,is_blocked,address,contact from user where user_name =?;");
        p.setString(1, userName);
        ResultSet res=p.executeQuery();
        
        boolean b = res.next();
        if(b){
            User user = new User(
                res.getInt(1),
                res.getString(2),
                res.getString(3),
                res.getString(4),
                res.getBoolean(5),
                res.getString(6),
                res.getString(7)
               
            );
            return user;
        }
        return null;
    }
    
}
