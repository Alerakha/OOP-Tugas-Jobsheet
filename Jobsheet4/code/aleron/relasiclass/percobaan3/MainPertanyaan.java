/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleron.relasiclass.percobaan3;

/**
 *
 * @author Rakha
 */
public class MainPertanyaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); 
        Pegawai asisten =  new Pegawai("4567","Aleron Tsaqif Rakha Rajendra");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten); 

        System.out.println(keretaApi.info()); 
    
    }
    
}
