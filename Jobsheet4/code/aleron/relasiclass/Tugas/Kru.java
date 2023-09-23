/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.Tugas;

/**
 *
 * @author Rakha
 */
public class Kru {
    private String nama;
    private String nip;
    private String tugas;
    
    Kru(String Nip, String Nama, String Tugas){
    this.nama=Nama;
    this.nip=Nip;
    this.tugas=Tugas;
    }
    
    public String getNip(){
    return nip;
    }
    public void setNip(String Nip){
    this.nip=Nip;
    }
    public String getNama(){
    return nama;
    }
    public void setNama(String Nama){
    this.nama=Nama;
    }
    public String getTugas(){
    return tugas;
    }
    public void setTugas(String Tugas){
    this.tugas=Tugas;
    }
    
    public String info(){
    String info="";
    info+="Nip\t\t: "+this.nip+"\n";
    info+="Nama\t\t: "+this.nama+"\n";
    return info;
    }
    
}
