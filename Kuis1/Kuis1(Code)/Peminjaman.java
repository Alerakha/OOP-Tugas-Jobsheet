/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class Peminjaman {
    Mahasiswa peminjam;
    BarangElektronik barang;
    
    Peminjaman(Mahasiswa p,BarangElektronik b){
    this.peminjam=p;
    this.barang=b;
    }
    
    public void infoPeminjaman(){
        System.out.println("\t-=Barang Dipinjam=-");
        barang.display();
        System.out.println("\t-=Data Peminjam=-");
        peminjam.display();
    }
}
