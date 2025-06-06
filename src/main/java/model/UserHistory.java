
package model;

import java.time.LocalDateTime;

public class UserHistory {
    private int historyID;
    private int userID;
    private int pharmacyID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor mặc định
    public UserHistory() {
    }

    // Constructor đầy đủ
    public UserHistory(int historyID, int userID, int pharmacyID, LocalDateTime startTime, 
                       LocalDateTime endTime) {
        this.historyID = historyID;
        this.userID = userID;
        this.pharmacyID = pharmacyID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public int getHistoryID() {
        return historyID;
    }

    public void setHistoryID(int historyID) {
        this.historyID = historyID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}