/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author haivo
 */
public class AccountRequests {
    private int requestId;
    private int pharmacyId;
    private int requestedBy;
    private String employeeName;
    private String employeeEmail;
    private String status;
    private LocalDateTime createdDate;
    private Integer approvedBy;
    private LocalDateTime approvedDate;
    
    // Constructor mặc định
    public AccountRequests() {
        this.status = "Pending";
        this.createdDate = LocalDateTime.now();
    }
    
    // Constructor đầy đủ
    public AccountRequests(int requestId, int pharmacyId, int requestedBy, String employeeName, 
                          String employeeEmail, String status, LocalDateTime createdDate, 
                          Integer approvedBy, LocalDateTime approvedDate) {
        this.requestId = requestId;
        this.pharmacyId = pharmacyId;
        this.requestedBy = requestedBy;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.status = status;
        this.createdDate = createdDate;
        this.approvedBy = approvedBy;
        this.approvedDate = approvedDate;
    }
    
    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public int getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(int requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public LocalDateTime getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(LocalDateTime approvedDate) {
        this.approvedDate = approvedDate;
    }
}