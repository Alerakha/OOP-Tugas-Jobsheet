/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.Tugas;

/**
 *
 * @author Rakha
 */
public class Penumpang {
    private String nama;
    private String ktp;
    Penumpang(String Nama, String Ktp){
    this.ktp=Ktp;
    this.nama=Nama;
    }
    public String getKtp(){
    return ktp;
    }
    public void setKtp(String inKtp){
    this.ktp=inKtp;
    }
    public String getNama(){
    return nama;
    }
    public void setNama(String inNama){
    this.nama=inNama;
    }
    public String info(){
    String info="";
    info += "Ktp\t\t: "+this.ktp + "\n";
    info += "Nama\t\t: "+this.nama + "\n";
    return info;
    }
    
}
