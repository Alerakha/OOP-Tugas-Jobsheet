/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan4;

/**
 *
 * @author Rakha
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    Kursi(String no){
    this.nomor = no;
    }
    
    public String getNomor(){
    return nomor;
    }
    public void setNomor(String No){
    this.nomor = No;
    }
    public Penumpang getPenumpang(){
    return penumpang;
    }
    public void setPenumpang(Penumpang isi){
    this.penumpang=isi;
    }
    public String info(){
    String info ="";
    info += "Nomor: "+nomor+"\n";
        if(this.penumpang !=null){
            info += "Penumpang: "+penumpang.info()+"";
//            info += "Kursi telah diisi \n";
        }
    return info;
    }
}
