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
public class WarehouseInOut {
    //ArrayList<String> ware = new ArrayList<String>();
    ArrayList<Warehouse> w = new ArrayList<>();
    TugasBesar tb = new TugasBesar();
    
    public void printWare() throws FileNotFoundException {
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                
                w.add(new Warehouse(temp[0],temp[1],temp[2]));
            }
            in.close();
        }
        for (int i=0;i<w.size();i++){
            Warehouse e = w.get(i);
            System.out.println(e.getWareID()+","+e.getWareName()+","+e.getWareAlamat());
            
        }
        System.out.println("");
    }
    
    public void addWare() throws FileNotFoundException{
        String cek;
        String id;
        String name;
        String alamat;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                w.add(new Warehouse(temp[0],temp[1],temp[2]));
            }
            in.close();
        }
        while (true){
            System.out.print("Warehouse ID      : ");
            id = input.nextLine();
            System.out.println("");
            System.out.print("Warehouse Name    : ");
            name=input.nextLine();
            System.out.println("");
            System.out.print("Warehouse Address : ");
            alamat = input.nextLine();
            System.out.println("");
            w.add(new Warehouse(id,name,alamat));
                try (PrintWriter out = new PrintWriter("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt")) {
                    for (int i =0;i<w.size();i++){
                        Warehouse e = w.get(i);
                        id=e.getWareID();
                        name=e.getWareName();
                        alamat=e.getWareAlamat();
                        out.println(id+","+name+","+alamat);
                    }
                    out.close();
                }
            break;
        }
    }

    
    public void editWare() throws FileNotFoundException {
        String id;
        String name;
        String alamat;
        int menu;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                System.out.println(temp.length);
                w.add(new Warehouse(temp[0],temp[1],temp[2]));
            }
            in.close();
        }
            System.out.print("Insert Warehouse ID : ");
            id = input.next();
            input.nextLine();
            System.out.println("");
        for (int i =0;i<w.size();i++) {
            Warehouse e = w.get(i);
            if (id.equals(e.getWareID())){
                System.out.print("Insert the new name : ");
                e.setWareName(input.nextLine());
                System.out.println("");
                System.out.print("Insert the new address : ");
                e.setWareAlamat(input.nextLine());
                System.out.println("");
                break;
            }
            else {
                System.out.println("Warehouse ID Not Found !");
                continue;
            }
        }
            System.out.println("");
                try (PrintWriter out = new PrintWriter("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt")) {
                    for (int j =0;j<w.size();j++){
                        Warehouse e1 = w.get(j);
                        id=e1.getWareID();
                        name=e1.getWareName();
                        alamat=e1.getWareAlamat();
                        out.println(id+","+name+","+alamat);
                    }
                    out.close();
                }
            
        }
    
    
    
    public void deleteWare() throws FileNotFoundException {
        String id;
        String name;
        String alamat;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] temp = str.split(",");
                w.add(new Warehouse(temp[0],temp[1],temp[2]));
            }
            in.close();
        }
        System.out.print("Insert Warehouse ID : ");
        String idw = input.next();
        System.out.println("");
        for (int i =0;i<w.size();i++){
                Warehouse e = w.get(i);
                if (idw.equals(e.getWareID())){
                    w.remove(i);
                   
                }
        }
        try (PrintWriter out = new PrintWriter("G:\\Latihan Java\\TugasBesar\\src\\tugasbesar\\Warehouse.txt")) {
                    for (int j =0;j<w.size();j++){
                        Warehouse e1 = w.get(j);
                        id=e1.getWareID();
                        name=e1.getWareName();
                        alamat=e1.getWareAlamat();
                        out.println(id+","+name+","+alamat);
                    }
                    out.close();
                }
    }
}