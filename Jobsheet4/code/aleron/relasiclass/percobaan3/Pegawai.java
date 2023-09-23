/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan3;

/**
 *
 * @author Rakha
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(){}
    Pegawai(String Nip, String Nama){
    this.nip=Nip;
    this.nama=Nama;
    }
    
    public String getNip(){
    return nip;
    }
    public void setNip(String inNip){
    this.nip=inNip;
    }
    public String getNama(){
    return nama;
    }
    public void setNama(String inNama){
    this.nama=inNama;
    }
    
    public String info(){
    String info = "";
    info += "Nip: "+this.nip + "\n";
    info += "Nama: "+this.nama + "\n";
    return info;
    }
    
}
