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
import java.io.PrintWriter;
/**
 *
 * @author user
 */
public class InventoryInOut {
    ArrayList<Inventory> iy = new ArrayList<>();
    TugasBesar tb = new TugasBesar();
    
    public void printInvent() throws FileNotFoundException {
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                iy.add(new Inventory(temp[0],temp[1],Double.parseDouble(temp[2]) ,Integer.parseInt(temp[3])));
            }
            in.close();
        }
        for (int i=0;i<iy.size();i++){
            //System.out.println(iy);
            Inventory e = iy.get(i);
            System.out.println(e.getWareID()+","+e.getProdID()+","+e.getProdPrice()+","+e.getProdStock());
            
        }
    }
    
    public void addInvent() throws FileNotFoundException{
        String wid;
        String pid;
        double price;
        int stock;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                iy.add(new Inventory(temp[0],temp[1],Double.parseDouble(temp[2]) ,Integer.parseInt(temp[3])));
            }
            in.close();
        }
            System.out.print("Warehouse ID    : ");
            wid = input.next();
            System.out.println("");
            System.out.print("Product ID      : ");
            pid=input.next();
            System.out.println("");
            System.out.print("Product Price   : ");
            price = input.nextDouble();
            System.out.println("");
            System.out.print("Product Stock   : ");
            stock = input.nextInt();
            System.out.println("");
            iy.add(new Inventory(wid,pid,price,stock));
                try (PrintWriter out = new PrintWriter("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt")) {
                    for (int i =0;i<iy.size();i++){
                        Inventory e = iy.get(i);
                        wid=e.getWareID();
                        pid=e.getProdID();
                        price=e.getProdPrice();
                        stock=e.getProdStock();
                        out.println(wid+","+pid+","+price+","+stock);
                    }
                    out.close();
                } 
            
        
    }
    
    public void editInvent() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                iy.add(new Inventory(temp[0],temp[1],Double.parseDouble(temp[2]) ,Integer.parseInt(temp[3])));
            }
            in.close();
        }
    }
    
    public void deleteInvent() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                iy.add(new Inventory(temp[0],temp[1],Double.parseDouble(temp[2]) ,Integer.parseInt(temp[3])));
            }
            in.close();
        }
        
        System.out.print("Insert Warehouse ID : ");
        String idw = input.next();
        System.out.print("Insert Product ID : ");
        String idp = input.next();
        System.out.println("");
        for (int i =0;i<iy.size();i++){
                Inventory e = iy.get(i);
                if (idw.equals(e.getWareID())&&idp.equals(e.getProdID())){
                    iy.remove(i);
                   
                }
                else
                    System.out.println("Error");
        }
    }
}
