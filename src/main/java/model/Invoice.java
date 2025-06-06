
package model;

import java.time.LocalDateTime;

public class Invoice {
    private int invoiceID;
    private int pharmacyID;
    private int customerID;
    private int userID;
    private LocalDateTime invoiceDate;
    private double totalAmount;
    private int pointsEarned;
    private String payment;
    private String status;

    // Constructor mặc định
    public Invoice() {
        this.invoiceDate = LocalDateTime.now();
        this.pointsEarned = 0;
    }

    // Constructor đầy đủ
    public Invoice(int invoiceID, int pharmacyID, int customerID, int userID, 
                   LocalDateTime invoiceDate, double totalAmount, int pointsEarned, 
                   String payment, String status) {
        this.invoiceID = invoiceID;
        this.pharmacyID = pharmacyID;
        this.customerID = customerID;
        this.userID = userID;
        this.invoiceDate = invoiceDate != null ? invoiceDate : LocalDateTime.now();
        this.totalAmount = totalAmount;
        this.pointsEarned = pointsEarned;
        this.payment = payment;
        this.status = status;
    }

    // Getters and Setters
    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}