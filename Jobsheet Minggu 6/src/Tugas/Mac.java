/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Mac extends Laptop {
    String Security;
    
    Mac(String merk, int kecProsesor,int sizeMemory, String jnsProsesor, String jnsBaterai, String security){
    super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBaterai);
    this.Security=security;
    }
    public void tampilMac(){
        System.out.println("==============Mac==============");
    super.tampilLaptop();
        System.out.println("Security            = "+this.Security);
    }
}
