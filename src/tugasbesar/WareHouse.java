/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;

/**
 *
 * @author Billy Yeremia E
 */
public class WareHouse {
    String id_ware, nama_ware, adr_ware;
    
    
    public WareHouse(String id_ware, String nama_ware, String adr_ware){
        this.id_ware = id_ware.replace('\"', ' ').trim();
        this.nama_ware = nama_ware.replace('\"', ' ').trim();
        this.adr_ware = adr_ware.replace('\"', ' ').trim();
    }
    
    public String getId_ware() {
        return id_ware;
    }

    public void setId_ware(String id_ware) {
        this.id_ware = id_ware;
    }

    public String getNama_ware() {
        return nama_ware;
    }

    public void setNama_ware(String nama_ware) {
        this.nama_ware = nama_ware;
    }

    public String getAdr_ware() {
        return adr_ware;
    }

    public void setAdr_ware(String adr_ware) {
        this.adr_ware = adr_ware;
    }
    
}
