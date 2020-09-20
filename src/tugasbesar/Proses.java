/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Billy Yeremia E
 */
public class Proses {
        
        public void print(ArrayList<WareHouse>listwr, ArrayList<Produk>listpd, ArrayList<Inventory>listiv, int pilihan){
        if(pilihan == 1){
            int print = 0;
            print = Integer.parseInt(JOptionPane.showInputDialog
			("Pilih: \n1. Data Warehouse"
                + "\n2. Data Produk"
                + "\n3. Data Inventory"
                + "\n4. Data Produk berdasarkan Kode Produk"
                + "\n5. Data Produk berdasarkan Jenis Produk"
                + "\n6. Data Produk berdasarkan Warehouse")
            );
            switch(print){
                case 1 :  {
                    //Warehouse
                    String wid = "";
                    String wnama = "";
                    String alamat = "";
                    System.out.println("Warehouse ID\t" + "Nama Produk\t" + "Part Number\t" + "Jenis Produk\t");
                for(int i=0; i < listwr.size(); i++){
                    wid = listwr.get(i).getId_ware();
                    wnama = listwr.get(i).getNama_ware();
                    alamat = listwr.get(i).getAdr_ware();
                        System.out.println( wid + "\t" + wnama  + "\t" + alamat);
                    }
                break;
                }
                case 2 : {
                    //Produk
                    String pid = "";
                    String np = "";
                    String num = "";
                    String jenis = "";
                    System.out.println("Produk ID\t" + "Nama Produk\t" + "Part Number\t" + "Jenis Produk\t");
                    for(int i=0; i < listiv.size(); i++){
                        pid = listpd.get(i).getId_prd();
                        np = listpd.get(i).getNama_prd();
                        num = listpd.get(i).getPartnumber();
                        jenis = listpd.get(i).getJenis_prd();

                            System.out.println(pid + "\t" + np + "\t" + num + "\t" + jenis);
                    }
                    break;
                }
                case 3 : {
                    //Inventory
                String wid = "";
                String pid = "";
                String unitcost = "";
                String stock = "";
                System.out.println("WareHouse ID\t" + "Produk ID\t" + "Unit Cost\t" + "Stock\t");
                for(int i=0; i < listiv.size(); i++){
                    wid = listiv.get(i).getId_ware();
                    pid = listiv.get(i).getId_prd();
                    unitcost = listiv.get(i).getUnitcost();
                    stock = listiv.get(i).getStock();

                        System.out.println(wid + "\t" + pid + "\t" + unitcost + "\t" + stock);
                }
                break;
                }
                case 4: {
                    //byProdukId
                Scanner in = new Scanner(System.in);
                String input = JOptionPane.showInputDialog("Input Id Produk");
		//input = in.nextLine();
		for(int i = 0;i<listiv.size();i++){
			Inventory inv = listiv.get(i);
			String id_barang = inv.getId_prd();
			String id_gudang = inv.getId_ware();
			String cost = inv.getUnitcost();
			String stock = inv.getStock();
			if(id_barang.equalsIgnoreCase(input))
                        {
                            System.out.println("Id Warehouse\t" + "Nama Warehouse\t" + "Alamat\t" 
                                    + "Kode Produk\t" + "Nama Produk\t" + "Jenis Produk\t" 
                                    + "Part Number\t" + "Harga\t" + "Jumlah\t");
                            System.out.println("-------------------------------------------------------------------");
				for(int j=0;j<listpd.size();j++)
                                {
					Produk p = listpd.get(j);
					String id_produk = p.getId_prd();
					String nama_produk = p.getNama_prd();
					String jenis_produk = p.getJenis_prd();
					String p_number = p.getPartnumber();
					for(int k=0;k<listwr.size();k++)
                                        {
						WareHouse wr = listwr.get(k);
						String id_warehouse = wr.getId_ware();
						String nama_warehouse = wr.getNama_ware();
						String adr_warehouse = wr.getAdr_ware();
					
						if(id_produk.equalsIgnoreCase(id_barang)){
							if(id_gudang.equalsIgnoreCase(id_warehouse)){
                                                            System.out.println(id_warehouse + "\t" + nama_warehouse + "\t" + adr_warehouse + "\t" 
                                                                    + id_produk + "\t" + nama_produk + "\t" + jenis_produk + "\t" 
                                                                    + p_number + "\t" + cost + "\t" + stock);
                                                            System.out.println("----------------------------------------------------------------\n");
							}
						}
					}
					
				}
				
			}
		}
                    break;
                }
                case 5: {
                    //byJenisProduk
                Scanner in = new Scanner(System.in);
                String input = JOptionPane.showInputDialog("Input Jenis Produk");
		for(int j=0;j<listpd.size();j++){
			Produk p = listpd.get(j);
			String id_produk = p.getId_prd();
			String nama_produk = p.getNama_prd();
			String jenis_produk = p.getJenis_prd();
			String p_number = p.getPartnumber();
		
			if(jenis_produk.equalsIgnoreCase(input)){
                            System.out.println("Id Warehouse\t" + "Nama Warehouse\t" + "Alamat\t" 
                                    + "Kode Produk\t" + "Nama Produk\t" + "Jenis Produk\t" 
                                    + "Part Number\t" + "Harga\t" + "Jumlah\t");
                            System.out.println("-------------------------------------------------------------------");
				for(int i = 0;i<listiv.size();i++){
					Inventory inv = listiv.get(i);
					String id_barang = inv.getId_prd();
					String id_gudang = inv.getId_ware();
					String cost = inv.getUnitcost();
					String stock = inv.getStock();
				
					for(int k=0;k<listwr.size();k++){
						WareHouse w = listwr.get(k);
						String id_warehouse = w.getId_ware();
						String nama_warehouse = w.getNama_ware();
						String adr_warehouse = w.getAdr_ware();
					
						if(id_produk.equalsIgnoreCase(id_barang)){
							if(id_gudang.equalsIgnoreCase(id_warehouse)){
                                                            System.out.println(id_warehouse + "\t" + nama_warehouse + "\t" + adr_warehouse + "\t" 
                                                                    + id_produk + "\t" + nama_produk + "\t" + jenis_produk + "\t" 
                                                                    + p_number + "\t" + cost + "\t" + stock);
                                                            System.out.println("----------------------------------------------------------------\n");
							}
						}
					}
					
				}
				
			}
		}
                    break;
                }
                case 6: {
                    //byIdWarehouse
                Scanner in = new Scanner(System.in);
                String input = JOptionPane.showInputDialog("Masukkan ID Warehouse: ");
		for(int k=0;k<listwr.size();k++){
			WareHouse w = listwr.get(k);
			String id_warehouse = w.getId_ware();
			String nama_warehouse = w.getNama_ware();
			String adr_warehouse = w.getAdr_ware();
		
			if(id_warehouse.equalsIgnoreCase(input)){
                               System.out.println("Id Warehouse\t" + "Nama Warehouse\t" + "Alamat\t" 
                                    + "Kode Produk\t" + "Nama Produk\t" + "Jenis Produk\t" 
                                    + "Part Number\t" + "Harga\t" + "Jumlah\t");
				System.out.println("----------------------------------------------------------------");
				for(int j=0;j<listpd.size();j++){
					Produk p = listpd.get(j);
					String id_produk = p.getId_prd();
					String nama_produk = p.getNama_prd();
					String jenis_produk = p.getJenis_prd();
					String p_number = p.getPartnumber();
					for(int i = 0;i<listiv.size();i++){
						Inventory inv = listiv.get(i);
						String id_barang = inv.getId_prd();
						String id_gudang = inv.getId_ware();
						String cost = inv.getUnitcost();
						String stock = inv.getStock();
						if(id_produk.equalsIgnoreCase(id_barang)){
							if(id_gudang.equalsIgnoreCase(id_warehouse)){
								System.out.println(id_warehouse + "\t" + nama_warehouse + "\t" + adr_warehouse + "\t" 
                                                                    + id_produk + "\t" + nama_produk + "\t" + jenis_produk + "\t" 
                                                                    + p_number + "\t" + cost + "\t" + stock);
								System.out.println("----------------------------------------------------------------\n");
							
							}
						}
					}
					
				}
				
			}
		}
                    break;
                }
                default: 
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!");
                
            }
        }else{if(pilihan == 2){
            int tambah = 0;
            tambah = Integer.parseInt(JOptionPane.showInputDialog
            ("Tambah Data: \n1. Tambah Warehouse"
                + "\n2. Tambah Produk"
                + "\n3. Tambah Stock Produk"
                + "\n4. Mengurangi Stock Produk"
                + "\n5. Edit Harga Produk"
                )
            );
            switch(tambah){
                
                case 1 : {
                    //tambahwarehouse
                    Scanner in = new Scanner(System.in);
                    String in_warehouse = JOptionPane.showInputDialog("Input ID Warehouse (4 Digit)");
                    String in_nama = JOptionPane.showInputDialog("Input Nama Warehouse");
                    String in_adrs = JOptionPane.showInputDialog("Input Alamat Warehouse");
                    String newid = in_warehouse;
                    String newname = in_nama;
                    String newadrs = in_adrs;
		
		WareHouse tambahwarehouse = new WareHouse(newid,newname,newadrs);
		listwr.add(tambahwarehouse);
                    break;
                }
                case 2 : {
                    //tambahproduk&inventory
                    Scanner in = new Scanner(System.in);
                    String in_idp = JOptionPane.showInputDialog("Input ID Produk (4 Digit)");
                    String in_idw = JOptionPane.showInputDialog("Input ID Warehouse (4Digit");
                    String in_nproduk = JOptionPane.showInputDialog("Input Nama Produk");
                    String in_jproduk = JOptionPane.showInputDialog("Input Jenis Produk");
                    String in_pnumber = JOptionPane.showInputDialog("Input Part Number");
                    String in_cost = JOptionPane.showInputDialog("Input Harga Produk");
                    String in_stock = JOptionPane.showInputDialog("Input Stock Awal Produk");
                    String newidp = in_idp;
                    String newidw = in_idw;
                    String newnproduk = in_nproduk;
                    String newjproduk = in_jproduk;
                    String newpnumber = in_pnumber;
                    String newcost = in_cost;
                    String newstock = in_stock;
		Produk tambahproduk = new Produk(newidp, newnproduk, newpnumber, newjproduk);
                listpd.add(tambahproduk);
                Inventory tambahinventory = new Inventory(newidp, newidw, newcost, newstock);
                listiv.add(tambahinventory);
                    break;
                }
                case 3 : {
                    //tambahstock
                Scanner in = new Scanner(System.in);
                String in_idp = JOptionPane.showInputDialog("Input Id Produk for add Stock");
		for(int j=0;j<listpd.size();j++){
			Produk p = listpd.get(j);
			String id_produk = p.getId_prd();
			String nama_produk = p.getNama_prd();
			String jenis_produk = p.getJenis_prd();
			String p_number = p.getPartnumber();
			if(in_idp.equalsIgnoreCase(id_produk)){
			for(int i = 0;i<listiv.size();i++){
				Inventory inv = listiv.get(i);
				String id_barang = inv.getId_prd();
				String id_gudang = inv.getId_ware();
				String cost = inv.getUnitcost();
				String stock = inv.getStock();
				if(id_produk.equalsIgnoreCase(id_barang)){
                                        int tambahjumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Stock yang mau diupdate"));
					int jumlahtotal = Integer.parseInt(stock) + tambahjumlah;
					System.out.println(jumlahtotal);
					listiv.set(i, new Inventory(id_barang,id_gudang,cost,stock));
					//listiv.set(i,addinv);
					System.out.println("kode: "+id_produk+" ditambah " +tambahjumlah +" stock ");
					
				}	
			}
			}
		}
                    break;
                }
                case 4 : {
                    //Kurangstock
                    Scanner in = new Scanner(System.in);
                String in_idp = JOptionPane.showInputDialog("Input Id Produk (-) Stock");
		for(int j=0;j<listpd.size();j++){
			Produk p = listpd.get(j);
			String id_produk = p.getId_prd();
			String nama_produk = p.getNama_prd();
			String jenis_produk = p.getJenis_prd();
			String p_number = p.getPartnumber();
			if(in_idp.equalsIgnoreCase(id_produk)){
			for(int i = 0;i<listiv.size();i++){
				Inventory inv = listiv.get(i);
				String id_barang = inv.getId_prd();
				String id_gudang = inv.getId_ware();
				String cost = inv.getUnitcost();
				String stock = inv.getStock();
				if(id_produk.equalsIgnoreCase(id_barang)){
                                        int kurangjumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Stock yang mau diupdate"));
					int jumlahtotal = Integer.parseInt(stock) - kurangjumlah;
					System.out.println(jumlahtotal);
					Inventory addinv = new Inventory(id_barang,id_gudang,cost,stock);
					listiv.set(i,addinv);
					System.out.println("kode: "+id_produk+" dikurang " + kurangjumlah +" stock ");
					
				}	
			}
			}
		}
                    break;
                }
                default : {
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!");
                    break;
                }
            }
        }else{if(pilihan == 3){
            int hapus = 0;
            hapus = Integer.parseInt(JOptionPane.showInputDialog
            ("Tambah Data: \n1. Hapus Warehouse"
                + "\n2. Hapus Produk")
            );
            switch(hapus){
                case 1 : {
                    //Hapuswarehouse
                    String id_wh = JOptionPane.showInputDialog("Input Warehouse ID for delete");
                    for(int count = 0; count<listwr.size(); count++){
                        WareHouse w = listwr.get(count);
                        if(w.getNama_ware().equalsIgnoreCase(id_wh) || w.getId_ware().equalsIgnoreCase(id_wh)){
                            for(int i = 0; i<listiv.size(); i++){
                                Inventory inv = listiv.get(i);
                                Produk prod = listpd.get(i);
                                if(inv.getId_ware().equalsIgnoreCase(w.getId_ware())){
                                    listpd.remove(i);
                                }
                            }
                            for(int j = 0; j<listiv.size(); j++){
                                Inventory i = listiv.get(j);
                                if(i.getId_ware().equalsIgnoreCase(w.getId_ware())){
                                    listiv.remove(j);
                                }
                            }
                            listwr.remove(count);
                        }
                    }
                break;
          }
                case 2 : {
                    //hapusproduk
                    String inputkodep = JOptionPane.showInputDialog("Input Id Produk untuk menghapus :");
                    for(int i = 0;i<listpd.size();i++){
                            Produk p = listpd.get(i);
                            String id_produk = p.getId_prd();
                            String nama_produk = p.getNama_prd();
                            String jenis_produk = p.getJenis_prd();
                            String p_number = p.getPartnumber();
                            Inventory inv = listiv.get(i);
                            String id_barang = inv.getId_prd();
                            String id_gudang = inv.getId_ware();
                            String cost = inv.getUnitcost();
                            String stock = inv.getStock();

                            if(inputkodep.equalsIgnoreCase(id_produk)){
                                    listpd.remove(i);
                                    listiv.remove(i);
                            }
                    }
                    break;
                }
        }
        }else{if(pilihan == 4){
            
        }else{
            JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!");
        }
        }
        }   
        }

    }
}
