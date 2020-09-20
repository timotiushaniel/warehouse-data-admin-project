/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.Comparator;

/**
 *
 * @author Billy Yeremia E
 */
public class ComparatorIdProduk implements Comparator<Produk>{
     public int compare(Produk p1, Produk p2) {             
      return (int) (p1.getId_prd().compareTo(p2.getId_prd()));         
    }
}
