/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author Billy Yeremia E
 */
public class Inventory {
    String id_ware, id_prd, unitcost, stock;
    
    public Inventory ( String id_ware,String id_prd, String unitcost, String stock){
        this.id_ware= id_ware.replace('\"', ' ').trim();
        this.id_prd= id_prd.replace('\"', ' ').trim();
        this.unitcost= unitcost.replace('\"', ' ').trim();
        this.stock= stock.replace('\"', ' ').trim();
    }

    public String getId_ware() {
        return id_ware;
    }

    public void setId_ware(String id_ware) {
        this.id_ware = id_ware;
    }

    public String getId_prd() {
        return id_prd;
    }

    public void setId_prd(String id_prd) {
        this.id_prd = id_prd;
    }

    public String getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(String unitcost) {
        this.unitcost = unitcost;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
   
}
