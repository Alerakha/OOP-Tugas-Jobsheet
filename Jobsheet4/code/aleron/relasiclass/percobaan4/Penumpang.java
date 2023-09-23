/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan4;

/**
 *
 * @author Rakha
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String Ktp, String Nama){
    this.ktp = Ktp;
    this.nama = Nama;
    }
    public String getKtp(){
    return ktp;
    }
    public void setKtp(String Ktp){
    this.ktp = Ktp;
    }
    public String getNama(){
    return nama;
    }
    public void setNama(String Nama){
    this.nama = Nama;
    }
    
    public String info(){
    String info="";
    info += "Ktp: "+this.ktp + "\n";
    info += "Nama: "+this.nama + "\n";
    return info;
    }
    
    
}
