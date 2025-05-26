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
public class Pharmacies {
    private int pharmacyId;
    private String pharmacyCode;
    private String pharmacyName;
    private String address;
    private String phone;
    private String email;
    private LocalDateTime createdDate;
    
    // Constructor mặc định
    public Pharmacies() {
        this.createdDate = LocalDateTime.now();
    }
    
    // Constructor đầy đủ
    public Pharmacies(int pharmacyId, String pharmacyCode, String pharmacyName, String address, 
                     String phone, String email, LocalDateTime createdDate) {
        this.pharmacyId = pharmacyId;
        this.pharmacyCode = pharmacyCode;
        this.pharmacyName = pharmacyName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.createdDate = createdDate;
    }
    
    // Getters and Setters
    public int getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
    
    public String getPharmacyCode() {
        return pharmacyCode;
    }
    
    public void setPharmacyCode(String pharmacyCode) {
        this.pharmacyCode = pharmacyCode;
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