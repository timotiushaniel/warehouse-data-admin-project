/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.CANCEL_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author Billy Yeremia E
 */
public class TgsBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       iowh wh = new iowh();
       ArrayList<WareHouse>listwr = wh.readInputIOWareHouse
        ("D:\\Study\\Semester 2\\PPL\\Tugas Besar PPL\\CS3_Warehouse.txt");
       iopd pd = new iopd();
       ArrayList<Produk>listpd = pd.readInputIOProduk 
        ("D:\\Study\\Semester 2\\PPL\\Tugas Besar PPL\\CS3_Produk.txt");
       ioin in = new ioin();
       ArrayList<Inventory>listiv = in.readInputIOInventory
        ("D:\\Study\\Semester 2\\PPL\\Tugas Besar PPL\\CS3_Inventory.txt"); 
       int i = 0;
       do{
            Proses pr = new Proses();
            pr.print(listwr, listpd, listiv, Integer.parseInt(JOptionPane.showInputDialog("Pilih : \n1. Output Data\n2. Edit Data\n3. Hapus Data\n4. Simpan dan Keluar")));
       }while(i<1 || i>3);
       
       //pd.writeOutput("D:\\Study\\Semester 2\\PPL\\Tugas Besar PPL\\CS3_Produk.txt", listpd);
    }
    
}
