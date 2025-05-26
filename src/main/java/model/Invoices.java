/*
 * Click nbproject://nbproject/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbproject://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;

/**
 *
 * @author haivo
 */
public class Invoices {
    private int invoiceId;
    private String invoiceNumber;
    private int pharmacyId;
    private int customerId;
    private int employeeId;
    private LocalDateTime invoiceDate;
    private double totalAmount;
    private int pointsEarned;
    
    // Constructor mặc định
    public Invoices() {
        this.invoiceDate = LocalDateTime.now();
        this.pointsEarned = 0;
    }
    
    // Constructor đầy đủ
    public Invoices(int invoiceId, String invoiceNumber, int pharmacyId, int customerId, 
                    int employeeId, LocalDateTime invoiceDate, double totalAmount, int pointsEarned) {
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.pharmacyId = pharmacyId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.invoiceDate = invoiceDate;
        this.totalAmount = totalAmount;
        this.pointsEarned = pointsEarned;
    }
    
    // Getters and Setters
    public int getInvoiceId() {
        return invoiceId;
    }
    
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    
    public int getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }
    
    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public int getPointsEarned() {
        return pointsEarned;
    }
    
    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}