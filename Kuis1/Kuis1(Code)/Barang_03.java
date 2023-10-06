/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class Barang_03 {
    private String kode_barang;
    private String nama_barang;
    private int jumlah;
    
    Barang_03(String kode, int jumlah){
    this.kode_barang=kode;
    this.jumlah=jumlah;
    }
    
    public String getKode(){
    return kode_barang;
    }
    public void setKode(String kode){
    this.kode_barang = kode;
    }
    public String getNama(){
    return nama_barang;
    }
    public void setNama(String nama){
    this.nama_barang=nama;
    }
    public int getJumlah(){
    return this.jumlah;
    }
    public void setJumlah(int jumlah){
    this.jumlah=jumlah;
    }
    public void display(){
        System.out.println("Kode barang\t: "+kode_barang);
        System.out.println("Jumlah\t: " +jumlah);
    }
}
