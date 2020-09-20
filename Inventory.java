/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author user
 */
public class Inventory {
    private String wareID;
    private String prodID;
    private double prodPrice;
    private int prodStock;

    public Inventory(String wareID, String prodID, double prodPrice, int prodStock) {
        this.wareID = wareID;
        this.prodID = prodID;
        this.prodPrice = prodPrice;
        this.prodStock = prodStock;
    }

    public String getWareID() {
        return wareID;
    }

    public void setWareID(String wareID) {
        this.wareID = wareID;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdStock() {
        return prodStock;
    }

    public void setProdStock(int prodStock) {
        this.prodStock = prodStock;
    }
    

}
