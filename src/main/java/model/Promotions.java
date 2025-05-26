/*
 * Click nbproject://nbproject/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbproject://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author haivo
 */
public class Promotions {
    private int promotionId;
    private Integer pharmacyId;
    private String promotionName;
    private LocalDate startDate;
    private LocalDate endDate;
    private double discountPercent;
    private String description;
    private int createdBy;
    private LocalDateTime createdDate;
    
    // Constructor mặc định
    public Promotions() {
        this.createdDate = LocalDateTime.now();
    }
    
    // Constructor đầy đủ
    public Promotions(int promotionId, Integer pharmacyId, String promotionName, LocalDate startDate, 
                      LocalDate endDate, double discountPercent, String description, 
                      int createdBy, LocalDateTime createdDate) {
        this.promotionId = promotionId;
        this.pharmacyId = pharmacyId;
        this.promotionName = promotionName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountPercent = discountPercent;
        this.description = description;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }
    
    // Getters and Setters
    public int getPromotionId() {
        return promotionId;
    }
    
    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }
    
    public Integer getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
    
    public String getPromotionName() {
        return promotionName;
    }
    
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    public double getDiscountPercent() {
        return discountPercent;
    }
    
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}