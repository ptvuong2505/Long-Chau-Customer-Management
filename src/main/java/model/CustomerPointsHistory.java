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
public class CustomerPointsHistory {
    private int historyId;
    private int customerId;
    private Integer invoiceId;
    private int pointsChange;
    private LocalDateTime changeDate;
    private String description;
    
    // Constructor mặc định
    public CustomerPointsHistory() {
        this.changeDate = LocalDateTime.now();
    }
    
    // Constructor đầy đủ
    public CustomerPointsHistory(int historyId, int customerId, Integer invoiceId, int pointsChange, 
                                LocalDateTime changeDate, String description) {
        this.historyId = historyId;
        this.customerId = customerId;
        this.invoiceId = invoiceId;
        this.pointsChange = pointsChange;
        this.changeDate = changeDate;
        this.description = description;
    }
    
    // Getters and Setters
    public int getHistoryId() {
        return historyId;
    }
    
    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public Integer getInvoiceId() {
        return invoiceId;
    }
    
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }
    
    public int getPointsChange() {
        return pointsChange;
    }
    
    public void setPointsChange(int pointsChange) {
        this.pointsChange = pointsChange;
    }
    
    public LocalDateTime getChangeDate() {
        return changeDate;
    }
    
    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}