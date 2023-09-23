/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleron.relasiclass.percobaan2;

/**
 *
 * @author Rakha
 */
public class MainPercobaan2 {

    public static void main(String[] args) {
        Mobil m =new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350_000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200_000);
        pelanggan p = new pelanggan();
        p.setNama("Jane Joe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());

    }
    
}
