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
public class Produk {
    String id_prd, nama_prd,jenis_prd, partnumber;
    
    public Produk (String id_prd, String nama_prd, String partnumber, String jenis_prd ){
        this.id_prd = id_prd.replace('\"', ' ').trim();
        this.nama_prd = nama_prd.replace('\"', ' ').trim();
        this.jenis_prd = jenis_prd.replace('\"', ' ').trim();
        this.partnumber = partnumber.replace('\"', ' ').trim();
    }

    public String getId_prd() {
        return id_prd;
    }

    public void setId_prd(String id_prd) {
        this.id_prd = id_prd;
    }

    public String getNama_prd() {
        return nama_prd;
    }

    public void setNama_prd(String nama_prd) {
        this.nama_prd = nama_prd;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public String getJenis_prd() {
        return jenis_prd;
    }

    public void setJenis_prd(String jenis_prd) {
        this.jenis_prd = jenis_prd;
    }
    
}
