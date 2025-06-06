
package model;


public class InvoiceDetail {
    private int invoiceDetailID;
    private int invoiceID;
    private int productID;
    private int quantity;
    private int price;

    // Constructor mặc định
    public InvoiceDetail() {
    }

    // Constructor đầy đủ
    public InvoiceDetail(int invoiceDetailID, int invoiceID, int productID, int quantity, 
                         int price) {
        this.invoiceDetailID = invoiceDetailID;
        this.invoiceID = invoiceID;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public int getInvoiceDetailID() {
        return invoiceDetailID;
    }

    public void setInvoiceDetailID(int invoiceDetailID) {
        this.invoiceDetailID = invoiceDetailID;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}