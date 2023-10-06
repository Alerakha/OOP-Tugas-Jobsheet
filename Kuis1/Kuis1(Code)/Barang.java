/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class Barang {
    private String nama_barang;
    private String kode_barang;
    
    Barang(String nama, String kode){
    this.nama_barang=nama;
    this.kode_barang=kode;
    }
    
    public String getKode(){
    return kode_barang;
    }
    public void setKode(String kode){
    this.kode_barang = kode;
    }
    public String getNama(){
    return nama_barang;
    }
    public void setNama(String nama){
    this.nama_barang=nama;
    }
}
