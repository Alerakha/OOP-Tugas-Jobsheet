/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Laptop extends Komputer {
    String jnsBaterai;   
    Laptop(String merk, int kecProsesor,int sizeMemory, String jnsProsesor, String jnsBaterai){
    super(merk,kecProsesor,sizeMemory,jnsProsesor);
    this.jnsBaterai=jnsBaterai;
    }
    public void tampilLaptop(){
    super.tampilData();
        System.out.println("Jenis Baterai       = "+this.jnsBaterai);
    }
 
}
