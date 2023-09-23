/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan2;

/**
 *
 * @author Rakha
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir(){
    }
    Sopir(String Nama,int Biaya){
    this.nama = Nama;
    this.biaya = Biaya;
    }
    
    public void setNama(String Nama){
    this.nama = Nama;
    }
    public String getNama(){
    return nama;
    }
    public void setBiaya(int Biaya){
    this.biaya = Biaya;
    }
    public int getBiaya(){
    return biaya;
    }
    
    public int hitungBiayaSopir(int hari){
    return biaya*hari;
    }
}
