/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

/**
 *
 * @author User
 */
public class Barang {
    // Access modifiers (private for encapsulation)
    private String nama;
    private String kode;
    private int jumlah;
    private double harga;

    // Constructor
    public Barang(String nama, String kode, int jumlah, double harga) {
        this.nama = nama;
        this.kode = kode;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Overloaded Constructor (Example of overloading)
    public Barang(String nama, String kode) {
        this(nama, kode, 0, 0.0); // Default values
    }

    // Getter and Setter methods (accessor and mutator)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Barang [Nama=" + nama + ", Kode=" + kode + 
               ", Jumlah=" + jumlah + ", Harga=" + harga + "]";
    }

    public static void main(String[] args) {
        // Creating an array to store Barang objects
        Barang[] inventory = new Barang[3];
        
        // Adding barang to the array
        inventory[0] = new Barang("Buku Tulis", "B001", 50, 3500.00);
        inventory[1] = new Barang("Pulpen", "P002", 100, 2000.00);
        inventory[2] = new Barang("Penghapus", "E003");

        // Displaying all barang in the inventory
        for(Barang barang : inventory) {
            System.out.println(barang.toString());
        }
    }
}

