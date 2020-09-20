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
public class Warehouse {
    private String wareID;
    private String wareName;
    private String wareAlamat;

    public Warehouse(String wareID, String wareName, String wareAlamat) {
        this.wareID = wareID;
        this.wareName = wareName;
        this.wareAlamat = wareAlamat;
    }

    public String getWareID() {
        return wareID;
    }

    public void setWareID(String wareID) {
        this.wareID = wareID;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareAlamat() {
        return wareAlamat;
    }

    public void setWareAlamat(String wareAlamat) {
        this.wareAlamat = wareAlamat;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "wareID=" + wareID + ", wareName=" + wareName + ", wareAlamat=" + wareAlamat + '}';
    }
   
    
}
