/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Pc extends Komputer {
    int ukuranMonitor;
    Pc(String merk, int kecProsesor,int sizeMemory, String jnsProsesor,int ukuranMonitor){
    super(merk,kecProsesor,sizeMemory,jnsProsesor);
    this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("==============Pc==============");
    super.tampilData();
        System.out.println("Ukuran Monitor      = "+this.ukuranMonitor+" inch");
    }
    
}
