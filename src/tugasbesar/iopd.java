/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Billy Yeremia E
 */
public class iopd {
    public ArrayList readInputIOProduk(String filename){
        ArrayList<Produk> pdk = new ArrayList<Produk>();
        try {
                File file = new File(filename);
                Scanner in = new Scanner(file);
                    while(in.hasNext()){
                       String p = in.nextLine().replaceAll("_", " ").replaceAll(" ", " ");
                       String var[]= p.split(",");
                       Produk input = new Produk(var[0], var[1], var[2], var[3]); 
                       pdk.add(input);
                       //System.out.println(name + purchase);
                    }
                }
        catch(Exception e){
                System.out.println("Error");
            
                }
        return pdk;
    }
    
    public void writeOutput(String filename, ArrayList<Produk>prd){
        try {
            PrintWriter out = new PrintWriter(filename);
            for(int i=0; i<prd.size(); i++){
                Produk p = (Produk)prd.get(i);
                String id = p.getId_prd();
                String name = p.getNama_prd();
                String no = p.getPartnumber();
                String jns = p.getJenis_prd();
                out.println(p.getId_prd() + "\t" + p.getNama_prd() + "\t" + p.getPartnumber() + "\t" + p.getJenis_prd());
            }
            out.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
