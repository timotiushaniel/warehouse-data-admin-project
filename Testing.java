/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Testing {
    String id;
    String nama;
    String jalan;

    public Testing(String id, String nama, String jalan) {
        this.id = id;
        this.nama = nama;
        this.jalan = jalan;
    }
    
   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        ArrayList<Warehouse> w = new ArrayList<>();
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                w.add(new Warehouse(temp[0],temp[1],temp[2]));
            }
            in.close();
        }
        System.out.print("ID : ");
        String test = input.next();
        for (int i =0;i<w.size();i++){
            Warehouse e = w.get(i);
            if(test.equals(e.getWareID()))
                System.out.println("1");
            else 
                System.out.println("");
        }
    }
}
