/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Windows extends Laptop {
    String fitur;
    
    Windows(String merk, int kecProsesor,int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){
    super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBaterai);
    this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("==============Windows==============");
    super.tampilLaptop();
        System.out.println("Fitur               = "+fitur);
    }
}
