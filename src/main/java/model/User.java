
package model;

import java.time.LocalDateTime;

public class User {
    private int userID;
    private String username;
    private byte[] passwordHash;
    private String role;
    private boolean isActive;
    private LocalDateTime createdDate;

    // Constructor mặc định
    public User() {
        this.isActive = true;
        this.createdDate = LocalDateTime.now();
    }

    // Constructor đầy đủ
    public User(int userID, String username, byte[] passwordHash, String role, 
                boolean isActive, LocalDateTime createdDate) {
        this.userID = userID;
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
        this.isActive = isActive;
        this.createdDate = createdDate != null ? createdDate : LocalDateTime.now();
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}