/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.Tugas;

/**
 *
 * @author Rakha
 */
public class Tiket {
    private String no;
    private Penumpang penumpang;
    Tiket(String No){
    this.no=No;
    }
    
    public Penumpang getPenumpang(){
    return penumpang;
    }
    public void setPenumpang(Penumpang isi){
    this.penumpang=isi;
    }
    public String getNo(){
    return no;
    }
    public void setNo(String No){
    this.no=No;
    }
    public String info(){
    String info="";
    if(this.penumpang !=null){
    info+=this.penumpang.info()+"\n";
    info+="No. Kursi\t: "+this.no+"\n";
    }else{
    info+="Status\t\t: Kosong";
    }
        return info;
    }
}
