
package model;

import java.time.LocalTime;

public class Timesheet {
    private int timesheetID;
    private Integer userID;
    private int pharmacyID;
    private LocalTime checkin;
    private LocalTime checkout;

    // Constructor mặc định
    public Timesheet() {
    }

    // Constructor đầy đủ
    public Timesheet(int timesheetID, Integer userID, int pharmacyID, LocalTime checkin, 
                     LocalTime checkout) {
        this.timesheetID = timesheetID;
        this.userID = userID;
        this.pharmacyID = pharmacyID;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Getters and Setters
    public int getTimesheetID() {
        return timesheetID;
    }

    public void setTimesheetID(int timesheetID) {
        this.timesheetID = timesheetID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public LocalTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalTime checkin) {
        this.checkin = checkin;
    }

    public LocalTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalTime checkout) {
        this.checkout = checkout;
    }
}