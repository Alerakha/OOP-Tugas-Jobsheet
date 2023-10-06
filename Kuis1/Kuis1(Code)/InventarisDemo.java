/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class InventarisDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarangElektronik lcd = new BarangElektronik("Proyektor","LC03");
        lcd.display();
        System.out.println("==-------------");
        Mahasiswa m1 = new Mahasiswa("Aleron Tsaqif Rakha","2241720113");
        m1.display();
        Peminjaman p = new Peminjaman(m1,lcd);
        System.out.println("==-------------");
        System.out.println("Relasi Peminjaman");
        System.out.println("==-------------");
        p.infoPeminjaman();
    }
    
}
