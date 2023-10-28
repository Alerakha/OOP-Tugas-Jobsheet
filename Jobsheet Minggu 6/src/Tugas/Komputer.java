/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Komputer {
    public String merk,jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    Komputer(){
    }
    Komputer(String merk, int kecProsesor,int sizeMemory, String jnsProsesor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("Merk                = "+merk);
        System.out.println("Kecepatan Prosesor  = "+kecProsesor+" GHz");
        System.out.println("Ukuran Memori       = "+sizeMemory+" Tera");
        System.out.println("Jenis Prosesor      = "+jnsProsesor);
    }
}
