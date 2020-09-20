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
public class Product {
    private String prodID;
    private String prodName;
    private String prodPartName;
    private String prodType;

    public Product(String prodID, String prodName, String prodPartName, String prodType) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPartName = prodPartName;
        this.prodType = prodType;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdPartName() {
        return prodPartName;
    }

    public void setProdPartName(String prodPartName) {
        this.prodPartName = prodPartName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }
    
    
}
