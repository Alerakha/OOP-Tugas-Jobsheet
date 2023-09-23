/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan2;

/**
 *
 * @author Rakha
 */
public class pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    pelanggan(){}
    
    public void setNama(String Nama){
    this.nama=Nama;
    }
    public String getNama(){
    return nama;
    }
    public void setHari(int Hari){
    this.hari=Hari;
    }
    public int getHari(){
    return hari;
    }
    
    public void setMobil(Mobil m){
    this.mobil=m;
    }
    public Mobil getMobil(){
    return mobil;
    }
    public void setSopir(Sopir s){
    this.sopir=s;
    }
    public Sopir getSopir(){
    return sopir;
    }
    public int hitungBiayaTotal(){
    return mobil.hitungBiayaMobil(hari)+ sopir.hitungBiayaSopir(hari);
    }
}
