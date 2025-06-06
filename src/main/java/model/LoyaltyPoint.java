
package model;


public class LoyaltyPoint {
    private int loyaltyPointID;
    private Integer customerID;
    private int points;

    // Constructor mặc định
    public LoyaltyPoint() {
    }

    // Constructor đầy đủ
    public LoyaltyPoint(int loyaltyPointID, Integer customerID, int points) {
        this.loyaltyPointID = loyaltyPointID;
        this.customerID = customerID;
        this.points = points;
    }

    // Getters and Setters
    public int getLoyaltyPointID() {
        return loyaltyPointID;
    }

    public void setLoyaltyPointID(int loyaltyPointID) {
        this.loyaltyPointID = loyaltyPointID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}