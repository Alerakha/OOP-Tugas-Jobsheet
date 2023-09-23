/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan2;

/**
 *
 * @author Rakha
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil(){
    }
    Mobil(String Merk, int Biaya){
    this.merk = Merk;
    this.biaya = Biaya;
    }
    
    public void setMerk(String Merk){
    this.merk=Merk;
    }
    public String getMerk(){
    return merk;
    }
    public void setBiaya(int jumlah){
    this.biaya=jumlah;
    }
    public int getBiaya(){
    return biaya;
    }
    public int hitungBiayaMobil (int hari){
    return biaya*hari;
    }
    
}
