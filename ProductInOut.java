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
public class ProductInOut {
    ArrayList<Product> p = new ArrayList<>();
    ArrayList<Inventory> iy = new ArrayList<>();
    TugasBesar tb = new TugasBesar();
    
    public void printProd() throws FileNotFoundException {
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                p.add(new Product(temp[0],temp[1],temp[2],temp[3]));
            }
            in.close();
        }
        
        for (int i=0;i<p.size();i++){
            //System.out.println(p);
            Product e = p.get(i);
            System.out.println(e.getProdID()+","+e.getProdName()+","+e.getProdPartName()+","+e.getProdType());
            
        }
    }
    
    public void addProd() throws FileNotFoundException{
        String wid;
        String pid;
        String pName;
        String pPart;
        String pType;
        double price;
        int stock;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                p.add(new Product(temp[0],temp[1],temp[2],temp[3]));
            }
            in.close();
        }
       File inputFile2 = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Inventory.txt");
        try (Scanner in = new Scanner(inputFile2)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                iy.add(new Inventory(temp[0],temp[1],Double.parseDouble(temp[2]) ,Integer.parseInt(temp[3])));
            }
            in.close();
        }
        
            System.out.print("Warehouse ID    : ");
            wid = input.next();
            System.out.print("Product ID      : ");
            pid = input.next();
            input.nextLine();
            System.out.print("Product Name    : ");
            pName=input.nextLine();
            System.out.println("");
            System.out.print("Product Part : ");
            pPart = input.nextLine();
            System.out.println("");
            System.out.print("Product Type : ");
            pType = input.nextLine();
            System.out.println("");
            System.out.print("Product Price   : ");
            price = input.nextDouble();
            System.out.println("");
            System.out.print("Product Stock   : ");
            stock = input.nextInt();
            System.out.println("");
            p.add(new Product(pid,pName,pPart,pType));
            iy.add(new Inventory(wid,pid,price,stock));
                try (PrintWriter out = new PrintWriter("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt")) {
                    for (int i =0;i<p.size();i++){
                        Product e = p.get(i);
                        pid=e.getProdID();
                        pName=e.getProdName();
                        pPart=e.getProdPartName();
                        pType=e.getProdType();
                        out.println(pid+","+pName+","+pPart+","+pType);
                    }
                    out.close();
                }
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
    public void searchProduct() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                p.add(new Product(temp[0],temp[1],temp[2],temp[3]));
            }
            in.close();
        }
    }
    
    public void editProd() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                p.add(new Product(temp[0],temp[1],temp[2],temp[3]));
            }
            in.close();
        }
    }
    
    public void deleteProd() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Product.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                p.add(new Product(temp[0],temp[1],temp[2],temp[3]));
            }
            in.close();
        }
        System.out.print("Insert Product ID : ");
        String idw = input.next();
        System.out.println("");
        for (int i =0;i<p.size();i++){
                Product e = p.get(i);
                if (idw.equals(e.getProdID())){
                    p.remove(i);
                   
                }
        }
    }
    
}
