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
/**
 *
 * @author user
 */
public class TugasBesar {
    int menu;
    public void mainMenu() throws FileNotFoundException{
        TugasBesar tb = new TugasBesar();
        Scanner in = new Scanner(System.in);
        WarehouseInOut wio = new WarehouseInOut();
        InventoryInOut iio = new InventoryInOut();
        ProductInOut pio = new ProductInOut();
        while (true){
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("Welcome to Rick Astley's Furniture Store!");
            System.out.println("=========================================");
            System.out.println("Choose the menu !");
            System.out.println("1. View");
            System.out.println("2. Add/Edit/Delete");
            System.out.println("9. Exit");
            System.out.print("Your Choice : ");
            menu=in.nextInt();
            if (menu==1) {
                subMenu1();
                break;
            }
            else if (menu==2) {
                subMenu2();
                break;
            }
            else if (menu==9){
                System.out.println("=========================================");
                System.out.println("Thank You for Your Visit");
                System.out.println("We Never Let You Down !");
                System.out.println("More feature Coming Soon!");
                System.out.println("=========================================");
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            }
    }
        
    
    public void subMenu1() throws FileNotFoundException{
                Scanner in = new Scanner(System.in);
                WarehouseInOut wio = new WarehouseInOut();
                InventoryInOut iio = new InventoryInOut();
                ProductInOut pio = new ProductInOut();
                while (true) {
                System.out.println("Which one do you want to view?");
                System.out.println("1. Warehouse");
                System.out.println("2. Inventory");
                System.out.println("3. Product");
                System.out.println("9. Back");
                System.out.print("Your Choice : ");
                menu=in.nextInt();
                if (menu==1) {
                    wio.printWare();
                    //subMenu1();
                }
                else if (menu==2) {
                    iio.printInvent();
                    //subMenu1();
                }
                else if (menu==3) {
                        pio.printProd();
                        //subMenu1();
                    } 
                    else if (menu==9) {
                            mainMenu();
                            break;
                    }
                    
                }
    }
    
    public void subMenu2() throws FileNotFoundException {
                Scanner in = new Scanner(System.in);
                WarehouseInOut wio = new WarehouseInOut();
                InventoryInOut iio = new InventoryInOut();
                ProductInOut pio = new ProductInOut();
                while (true){
                System.out.println("=========================================");
                System.out.println("Which action?");
                System.out.println("1. Add");
                System.out.println("2. Edit");
                System.out.println("3. Delete");
                System.out.println("9. Back");
                System.out.print("Your Choice : ");
                menu=in.nextInt();
                if (menu==1) {
                    sub1SubMenu2();
                    break;
                }
                else if (menu==2) {
                    sub2SubMenu2();
                    break;
                }
                else if (menu==3) {
                    sub3SubMenu2();
                    break;
                }
                else if (menu==9) {
                    mainMenu();
                    break;
                    
                }
                }
    }
    
    public void sub1SubMenu2() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        WarehouseInOut wio = new WarehouseInOut();
        InventoryInOut iio = new InventoryInOut();
        ProductInOut pio = new ProductInOut();
        while (true) {
        System.out.println("Which one do you want to add?");
        System.out.println("1. Warehouse");
        System.out.println("2. Product");
        System.out.println("9. Back");
        System.out.print("Your Choice : ");
        menu=in.nextInt();
        if (menu==1) {
            wio.addWare();
        }
                 else if (menu==2) {
                            pio.addProd();
                        }
                    else if (menu==9) {
                            subMenu2();
                            break;
                         }
        }               
   }
    
    public void sub2SubMenu2() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        WarehouseInOut wio = new WarehouseInOut();
        InventoryInOut iio = new InventoryInOut();
        ProductInOut pio = new ProductInOut();
        while (true) {
        System.out.println("Which one do you want to edit?");
        System.out.println("1. Warehouse");
        System.out.println("2. Product");
        System.out.println("9. Back");
        System.out.print("Your Choice : ");
        menu=in.nextInt();
        if (menu==1) {
            wio.editWare();
        }
            else if (menu==2) {
                pio.editProd();
            }
                else if (menu==9) {
                     subMenu2();
                     break;
                }
                         
        }
    }
    
    public void sub3SubMenu2() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        WarehouseInOut wio = new WarehouseInOut();
        InventoryInOut iio = new InventoryInOut();
        ProductInOut pio = new ProductInOut();
        while (true) {
        System.out.println("Which one do you want to delete?");
        System.out.println("1. Warehouse");
        System.out.println("2. Product");
        System.out.println("9. Back");
        System.out.print("Your Choice : ");
        menu=in.nextInt();
        if (menu==1) {
            wio.deleteWare();
        }
                 else if (menu==2) {
                            pio.deleteProd();
                        }
                    else if (menu==9) {
                            subMenu2();
                            break;
                         }
                        
        }
    }
    
    public void subMenu3() {
        System.out.println("Thank You for Your Visit");
        System.out.println("We Never Let You Down !");
        System.out.println("More feature Coming Soon!");
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        TugasBesar tb = new TugasBesar();
        tb.mainMenu();
  
    }
    
}
