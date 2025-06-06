
package model;

import java.time.LocalDateTime;


public class Pharmacy {
    private int pharmacyID;
    private String pharmacyName;
    private String address;
    private String phone;
    private String email;
    private LocalDateTime createdDate;

    // Constructor mặc định
    public Pharmacy() {
        this.createdDate = LocalDateTime.now();
    }

    // Constructor đầy đủ
    public Pharmacy(int pharmacyID, String pharmacyName, String address, String phone, 
                    String email, LocalDateTime createdDate) {
        this.pharmacyID = pharmacyID;
        this.pharmacyName = pharmacyName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.createdDate = createdDate != null ? createdDate : LocalDateTime.now();
    }

    // Getters and Setters
    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}