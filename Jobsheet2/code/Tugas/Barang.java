/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    private float hargaJual;
    
   
    public float hargaJual(int harga, float diskon){
    hargaJual=harga-(harga*diskon/100);
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode\t\t: "+kode);
        System.out.println("Nama Barang\t: "+namaBarang);
        System.out.println("Harga Dasar\t: "+hargaDasar);
        System.out.println("Diskon\t\t: "+diskon+" %");
        System.out.println("Harga Jual\t: "+hargaJual);
    }
}
