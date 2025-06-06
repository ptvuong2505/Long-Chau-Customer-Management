
package model;


public class Product {
    private int productID;
    private String productName;
    private String productType;
    private String unit;
    private String description;
    private double price;

    // Constructor mặc định
    public Product() {
    }

    // Constructor đầy đủ
    public Product(int productID, String productName, String productType, String unit, 
                   String description, double price) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.unit = unit;
        this.description = description;
        this.price = price;
    }

    // Getters and Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}