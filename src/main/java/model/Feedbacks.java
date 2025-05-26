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
public class Feedbacks {
    private int feedbackId;
    private int customerId;
    private int pharmacyId;
    private Integer invoiceId;
    private int rating;
    private String comment;
    private LocalDateTime feedbackDate;
    private Integer handledBy;
    private LocalDateTime handledDate;
    
    // Constructor mặc định
    public Feedbacks() {
        this.feedbackDate = LocalDateTime.now();
    }
    
    // Constructor đầy đủ
    public Feedbacks(int feedbackId, int customerId, int pharmacyId, Integer invoiceId, int rating, 
                     String comment, LocalDateTime feedbackDate, Integer handledBy, LocalDateTime handledDate) {
        this.feedbackId = feedbackId;
        this.customerId = customerId;
        this.pharmacyId = pharmacyId;
        this.invoiceId = invoiceId;
        this.rating = rating;
        this.comment = comment;
        this.feedbackDate = feedbackDate;
        this.handledBy = handledBy;
        this.handledDate = handledDate;
    }
    
    // Getters and Setters
    public int getFeedbackId() {
        return feedbackId;
    }
    
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public int getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
    
    public Integer getInvoiceId() {
        return invoiceId;
    }
    
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public LocalDateTime getFeedbackDate() {
        return feedbackDate;
    }
    
    public void setFeedbackDate(LocalDateTime feedbackDate) {
        this.feedbackDate = feedbackDate;
    }
    
    public Integer getHandledBy() {
        return handledBy;
    }
    
    public void setHandledBy(Integer handledBy) {
        this.handledBy = handledBy;
    }
    
    public LocalDateTime getHandledDate() {
        return handledDate;
    }
    
    public void setHandledDate(LocalDateTime handledDate) {
        this.handledDate = handledDate;
    }
}