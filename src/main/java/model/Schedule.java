
package model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Schedule {
    private int scheduleID;
    private Integer userID;
    private LocalDate workDate;
    private LocalTime startTime;
    private LocalTime endTime;

    // Constructor mặc định
    public Schedule() {
    }

    // Constructor đầy đủ
    public Schedule(int scheduleID, Integer userID, LocalDate workDate, LocalTime startTime, 
                    LocalTime endTime) {
        this.scheduleID = scheduleID;
        this.userID = userID;
        this.workDate = workDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public LocalDate getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDate workDate) {
        this.workDate = workDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}