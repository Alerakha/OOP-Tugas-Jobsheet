/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KoperasiSimpanPinjam;

/**
 *
 * @author Rakha
 */
public class Anggota {
    //Aleron Tsaqif Rakha Rajendra 2C/03/2241720113
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    //Anggota dapat meminjam dengan limit pinjaman
    //Dapat mengangsur pinjaman
    //menampilkan info pinjaman dan sisa uang yang harus dikembalikan
    //pakai konstruktor
    
    Anggota(String noKtp, String nama,int limit){
        this.nama=nama;
        this.nomorKTP=noKtp;
        this.limitPinjaman=limit;
    }
    
    public void pinjam(int pinjam){
        if(pinjam>limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{
            System.out.println("Meminjam uang sebesar "+pinjam);
            jumlahPinjaman=pinjam;
        }
    }
    
    public void angsur(int angsuran){
        if(angsuran>=(jumlahPinjaman*10/100)){
            jumlahPinjaman-=angsuran;
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
    
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
}
