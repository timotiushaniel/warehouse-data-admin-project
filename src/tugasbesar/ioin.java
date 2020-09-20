/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Billy Yeremia E
 */
public class ioin {
    public ArrayList readInputIOInventory(String filename){
        ArrayList<Inventory> inven = new ArrayList<Inventory>();
        try {
                File file = new File(filename);
                Scanner in = new Scanner(file);
                    while(in.hasNext()){
                       String iv = in.nextLine().replaceAll(" ", "_").replaceAll(" ", "");
                       String var[]= iv.split(",");
                       Inventory input = new Inventory(var[0], var[1], var[2], var[3]); 
                       inven.add(input);
                        //System.out.println(name + purchase);
                    }
                }
        catch(Exception e){
                System.out.println("Error");
            
                }
        return inven;
    }
}
