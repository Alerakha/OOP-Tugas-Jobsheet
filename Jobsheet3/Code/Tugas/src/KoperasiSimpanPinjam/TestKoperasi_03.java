/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KoperasiSimpanPinjam;

/**
 *
 * @author Rakha
 */
import java.util.Scanner;
public class TestKoperasi_03 {
    
    public static void main(String[] args) {
        Scanner rakha = new Scanner(System.in);
        int pinjaman;
        int angsuran;
        Anggota aleron = new Anggota("111333444","Aleron",5000000);
        
        System.out.println("Nama Anggota: "+aleron.getNama());
        System.out.println("Limit Pinjaman: "+aleron.getLimitPinjaman());
        
        System.out.print("\nMeminjam Uang :");
        pinjaman=rakha.nextInt();
        aleron.pinjam(pinjaman);
        System.out.println("Jumlah Pinjaman saat ini: "+aleron.getJumlahPinjaman());
        
        System.out.print("\nMeminjam Uang :");
        pinjaman=rakha.nextInt();
        aleron.pinjam(pinjaman);
        System.out.println("Jumlah Pinjaman saat ini: "+aleron.getJumlahPinjaman());
        
        System.out.println("\nMembayar Angsuran 2.000");
        aleron.angsur(2000);
        System.out.println("Jumlah Pinjaman saat ini: "+aleron.getJumlahPinjaman());
        
        System.out.print("\nMembayar Angsuran ");
        angsuran = rakha.nextInt();
        aleron.angsur(angsuran);
        System.out.println("Jumlah Pinjaman saat ini: "+aleron.getJumlahPinjaman());
    }
    
}
