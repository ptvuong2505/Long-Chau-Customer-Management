/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;

/**
 *
 * @author haivo
 */
public class Employees {
    private int employeeId;
    private int userId;
    private int pharmacyId;
    private LocalDate hireDate;
    private double salary;
    
    // Constructor mặc định
    public Employees() {}
    
    // Constructor đầy đủ
    public Employees(int employeeId, int userId, int pharmacyId, LocalDate hireDate, double salary) {
        this.employeeId = employeeId;
        this.userId = userId;
        this.pharmacyId = pharmacyId;
        this.hireDate = hireDate;
        this.salary = salary;
    }
    
    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public int getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
    
    public LocalDate getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}