/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan3;

/**
 *
 * @author Rakha
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi( String Nama, String Kelas, Pegawai Masinis){
    this.nama = Nama;
    this.kelas= Kelas;
    this.masinis = Masinis;
    }
    
    KeretaApi( String Nama, String Kelas, Pegawai Masinis, Pegawai Asisten){
    this.nama = Nama;
    this.kelas= Kelas;
    this.masinis = Masinis;
    this.asisten = Asisten;
    }
    
    public String getNama(){
    return nama;
    }
    public void setNama(String inNama){
    this.nama=inNama;
    }
    public String getKelas(){
    return kelas;
    }
    public void setKelas(String inKelas){
    this.kelas = inKelas;
    }
    public Pegawai getMasinis(){
    return masinis;
    }
    public void setMasinis(Pegawai Masinis){
    this.masinis=Masinis;
    }
    public Pegawai getAsisten(){
    return asisten;
    }
    public void setAsisten(Pegawai Asisten){
    this.asisten=Asisten;
    }
    
    public String info(){
    String info="";
    info += "Nama: "+this.nama +"\n";
    info += "Kelas: "+this.kelas +"\n";
    info += "Masinis: "+this.masinis.info() +"\n";
    info += "Asisten: "+this.asisten.info() +"\n";
    return info;
    }
    
}
