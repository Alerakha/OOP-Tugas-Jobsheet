/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class BarangElektronik extends Barang{
    private String kategori="Barang Elektronik";
    BarangElektronik(String nama, String kode){
        super(nama,kode);
    }
    
    public void display(){
        System.out.println("Nama barang\t: "+super.getNama());
        System.out.println("Kode barang\t: "+super.getKode());
        System.out.println("Kategori\t: "+this.kategori);
    }
}
