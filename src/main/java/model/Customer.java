package model;

import java.time.LocalDateTime;

public class Customer {
    private int customerID;
    private String fullName;
    private String phone;
    private String email;
    private int totalPoints;
    private LocalDateTime createdDate;

    // Constructor mặc định
    public Customer() {
        this.totalPoints = 0;
        this.createdDate = LocalDateTime.now();
    }

    // Constructor đầy đủ
    public Customer(int customerID, String fullName, String phone, String email, 
                    int totalPoints, LocalDateTime createdDate) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.totalPoints = totalPoints;
        this.createdDate = createdDate != null ? createdDate : LocalDateTime.now();
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}