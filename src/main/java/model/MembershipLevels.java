/*
 * Click nbfs://nbproject/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbproject://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haivo
 */
public class MembershipLevels {
    private int levelId;
    private String levelName;
    private int minPoints;
    private Integer maxPoints;
    
    // Constructor mặc định
    public MembershipLevels() {}
    
    // Constructor đầy đủ
    public MembershipLevels(int levelId, String levelName, int minPoints, Integer maxPoints) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.minPoints = minPoints;
        this.maxPoints = maxPoints;
    }
    
    // Getters and Setters
    public int getLevelId() {
        return levelId;
    }
    
    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }
    
    public String getLevelName() {
        return levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
    
    public int getMinPoints() {
        return minPoints;
    }
    
    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }
    
    public Integer getMaxPoints() {
        return maxPoints;
    }
    
    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }
}