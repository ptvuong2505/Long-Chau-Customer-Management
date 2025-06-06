
package model;

import java.time.LocalDateTime;


public class UserInformation {
    private int userID;
    private String fullName;
    private String phone;
    private String email;
    private Integer pharmacyID;
    private LocalDateTime assignedDate;

    // Constructor mặc định
    public UserInformation() {
        this.assignedDate = LocalDateTime.now();
    }

    // Constructor đầy đủ
    public UserInformation(int userID, String fullName, String phone, String email, 
                           Integer pharmacyID, LocalDateTime assignedDate) {
        this.userID = userID;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.pharmacyID = pharmacyID;
        this.assignedDate = assignedDate != null ? assignedDate : LocalDateTime.now();
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public Integer getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(Integer pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public LocalDateTime getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(LocalDateTime assignedDate) {
        this.assignedDate = assignedDate;
    }
}