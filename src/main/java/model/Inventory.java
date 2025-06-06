
package model;


public class Inventory {
    private int productID;
    private int number;

    // Constructor mặc định
    public Inventory() {
    }

    // Constructor đầy đủ
    public Inventory(int productID, int number) {
        this.productID = productID;
        this.number = number;
    }

    // Getters and Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}