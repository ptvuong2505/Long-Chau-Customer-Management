/*
 * Click nbproject://nbproject/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbproject://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haivo
 */
public class UserRoles {
    private int userId;
    private int roleId;
    private Integer pharmacyId;
    
    // Constructor mặc định
    public UserRoles() {}
    
    // Constructor đầy đủ
    public UserRoles(int userId, int roleId, Integer pharmacyId) {
        this.userId = userId;
        this.roleId = roleId;
        this.pharmacyId = pharmacyId;
    }
    
    // Getters and Setters
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public int getRoleId() {
        return roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    
    public Integer getPharmacyId() {
        return pharmacyId;
    }
    
    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }
}