/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class TestBarang {
    public static void main (String []args){
    Barang barang1 = new Barang();
    barang1.kode="233";
    barang1.namaBarang="Televisi";
    barang1.hargaDasar=500000;
    barang1.diskon=22.5F;
    
    barang1.hargaJual(barang1.hargaDasar, barang1.diskon);
    barang1.tampilData();
    }
}
