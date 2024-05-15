package utsoop;

import java.util.Scanner;

/**
 *
 * @author hendrawan
 */
public class databarang {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    Scanner dtIN = new Scanner (System.in);
    void Storedata(){
        int idx = 0;
        raktif++;
        if(raktif > brs){
            System.out.println("Data sudah penuh");
            return;
        }
        if(raktif>0){
            idx=raktif-1;
        }
        System.out.println("Menambahkan Data Barang");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Barang: ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.println("Jenis Barang");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.println("Id Barang");
        BT[idx][2] = dtIN.nextLine();
        
        
    }
    public void Update(int idx){
        if(idx >= 0 && idx < raktif) {
        System.out.println("Mengupdate Data Barang");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Barang: " + BT[idx][0]);
        System.out.println("Jenis Barang: " + BT[idx][1]);
        System.out.println("Id Barang: " + BT[idx][2]);
        
        System.out.println("Masukkan Nama Barang Baru (Kosongkan jika tidak ingin mengubah):");
        String namaBaru = dtIN.nextLine();
        if(!namaBaru.isEmpty()) {
            BT[idx][0] = namaBaru;
        }
        
        System.out.println("Masukkan Jenis Barang Baru (Kosongkan jika tidak ingin mengubah):");
        String alamatBaru = dtIN.nextLine();
        if(!alamatBaru.isEmpty()) {
            BT[idx][1] = alamatBaru;
        }
        
        System.out.println("Masukkan Id Barang Baru (Kosongkan jika tidak ingin mengubah):");
        String teleponBaru = dtIN.nextLine();
        if(!teleponBaru.isEmpty()) {
            BT[idx][2] = teleponBaru;
        }
        
        System.out.println("Data berhasil diperbarui.");
    } else {
        System.out.println("Indeks tidak valid.");
    }
    }
    
    
    public void Destroy(int idx){
        if(idx >= 0 && idx < raktif) {
        System.out.println("Menghapus Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Barang: " + BT[idx][0]);
        System.out.println("Jenis Barang: " + BT[idx][1]);
        System.out.println("Id Barang: " + BT[idx][2]);
        
        System.out.println("Apakah Anda yakin ingin menghapus data teman ini? (Y/N):");
        String konfirmasi = dtIN.nextLine();
        if(konfirmasi.equalsIgnoreCase("Y")) {
            for(int i = idx; i < raktif - 1; i++) {
                BT[i] = BT[i + 1];
            }
            raktif--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Penghapusan data dibatalkan.");
        }
    } else {
        System.out.println("Indeks tidak valid.");
    }
    }
    
    
    
    public void viewdata(){
        
        int posbrs = 0;
        System.out.println("Daftar Barang");
        System.out.println("~~~~~~~~~~~~");
        for(int i=0; i<raktif; i++){
            posbrs++;
//            System.out.println(posbrs+". "+BT[i][0]+" "+BT[i][1]+" "+BT[i][2]);
            
            System.out.println("Record Number"+i);
            System.out.println("Nama Barang   :"+BT[i][0]);
            System.out.println("Jenis Barang  :"+BT[i][1]);
            System.out.println("Id Barang  :"+BT[i][2]);
        }
    }
}
