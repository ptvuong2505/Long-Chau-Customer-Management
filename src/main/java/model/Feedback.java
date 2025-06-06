
package model;

import java.time.LocalDateTime;

public class Feedback {
    private int feedbackID;
    private int customerID;
    private int pharmacyID;
    private Integer invoiceID;
    private int rating;
    private String comment;
    private LocalDateTime feedbackDate;
    private Integer handledBy;
    private LocalDateTime handledDate;

    // Constructor mặc định
    public Feedback() {
        this.feedbackDate = LocalDateTime.now();
    }

    // Constructor đầy đủ
    public Feedback(int feedbackID, int customerID, int pharmacyID, Integer invoiceID, 
                    int rating, String comment, LocalDateTime feedbackDate, 
                    Integer handledBy, LocalDateTime handledDate) {
        this.feedbackID = feedbackID;
        this.customerID = customerID;
        this.pharmacyID = pharmacyID;
        this.invoiceID = invoiceID;
        this.rating = rating;
        this.comment = comment;
        this.feedbackDate = feedbackDate != null ? feedbackDate : LocalDateTime.now();
        this.handledBy = handledBy;
        this.handledDate = handledDate;
    }

    // Getters and Setters
    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public Integer getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        this.invoiceID = invoiceID;
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