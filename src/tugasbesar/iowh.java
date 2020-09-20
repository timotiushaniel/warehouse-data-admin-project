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
public class iowh {
    public ArrayList readInputIOWareHouse(String filename){
        ArrayList<WareHouse> whouse = new ArrayList<WareHouse>();
        try {
                File file = new File(filename);
                Scanner in = new Scanner(file);
                    while(in.hasNext()){
                       String w = in.nextLine().replaceAll("_", " ").replaceAll(" ", " ");
                       String var[]= w.split(",");
                       WareHouse input = new WareHouse(var[0], var[1], var[2]); 
                       whouse.add(input);
                        //System.out.println(name + purchase);
                    }
                }
        catch(Exception e){
                System.out.println("Error");
            
                }
        return whouse;
    }
}
