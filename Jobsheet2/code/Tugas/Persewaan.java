/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Persewaan {
    public int id;
    public String nama;
    public String namaMember;
    public String namaGame;
    public int banyakHari;
    public int harga;
    private int hargaSewa;
    
    public int hargaSewa(int hari, int harga){
    hargaSewa=hari*harga;
    return hargaSewa;
    }
    
    public void dataHasilPinjam(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Id\t\t: "+id);
        System.out.println("Nama Member\t: "+namaMember);
        System.out.println("Nama Game\t: "+namaGame);
        System.out.println("Lama Sewa\t: "+banyakHari+" hari");
        System.out.println("Harga Sewa\t: "+hargaSewa);
    }
}
