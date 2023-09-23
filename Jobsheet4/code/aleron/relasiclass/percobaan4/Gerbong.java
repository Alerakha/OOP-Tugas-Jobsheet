/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan4;

/**
 *
 * @author Rakha
 */
public class Gerbong {
    private String kode;
    private Kursi arrayKursi[];
    private boolean terisi;//modifikasi
    
    
    Gerbong(String Kode,int Jumlah){
    this.kode=Kode;
    this.arrayKursi = new Kursi[Jumlah];
    this.terisi=false;//modifikasi
    this.initKursi();
    }
    
    //modifikasi
    public boolean getTerisi(){
    return terisi;
    }
    
    public String getKode(){
    return kode;
    }
    public void setKode(String inKode){
    this.kode=inKode;
    }
    
    private void initKursi(){
        for(int i=0; i<arrayKursi.length;i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }
    
    public String info(){
    String info="";
    info += "Kode: "+kode+"\n";
        for(Kursi kursi : arrayKursi){
            info+= kursi.info();
        }
        return info;
    }
    
  
    public void setPenumpang(Penumpang penumpang,int nomor){
        //Modifikasi
        if(!terisi){
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
            terisi = true;
        }else{
            System.out.println("Kursi yang telah terisi tidak dapat ditempati orang lain");
            terisi = false;
        }
    }
    
    
    
}
