/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.Tugas;

/**
 *
 * @author Rakha
 */
public class Pesawat {
    private String kode;
    private String maskapai;
    private Kru pilot;
    private Kru pramugari;
    private Tiket arrayTiket[];
    private boolean terisi;
    
    Pesawat(String Kode, String Maskapai, Kru Pilot, Kru Pramugari, int jumlah){
    this.kode=Kode;
    this.maskapai=Maskapai;
    this.pilot=Pilot;
    this.pramugari=Pramugari;
    this.arrayTiket=new Tiket[jumlah];
    this.initTiket();
    this.terisi=false;
    }
    
    private void initTiket(){
        for(int i=0; i<arrayTiket.length;i++){
            this.arrayTiket[i] = new Tiket(String.valueOf(i+1));
        }
    }
    
    public String getKode(){
    return kode;
    }
    public void setKode(String Kode){
    this.kode=Kode;
    }
    public String getMaskapai(){
    return maskapai;
    }
    public void setMaskapai(String Maskapai){
    this.maskapai=Maskapai;
    }
    public Kru getPilot(){
    return pilot;
    }
    public void setPilot(Kru Pilot){
    this.pilot=Pilot;
    }
    public Kru getPramugari(){
    return pramugari;
    }
    public void setPramugari(Kru Pramugari){
    this.pramugari=Pramugari;
    }
    
    public String info(){
    String info="";
    info+="No. Penerbangan\t: "+this.kode+"\n";
    info+="Nama Maskapai\t: "+this.maskapai+"\n";
    info+="Pilot:\n"+this.pilot.info()+"\n";
    info+="Pramugari:\n"+this.pramugari.info()+"\n";
        for(Tiket ticket : arrayTiket){
            info+= ticket.info();
        }
    return info;
    }
    
    public void setPenumpang(Penumpang penumpang,int nomor){
        //Modifikasi
        if(!terisi){
            this.arrayTiket[nomor-1].setPenumpang(penumpang);
            terisi = false;
        }else{
        }
    }
}
