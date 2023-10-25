/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.Soal5;

/**
 *
 * @author Rakha
 */
public class Buku {
    String ISBN,judul;
    int harga;
    Penulis penulis;
    
    String getISBN(){
    return this.ISBN;
    }
    public void setISBN(String newISBN){
    this.ISBN=newISBN;
    }
    String getJudul(){
    return this.judul;
    }
    public void setJudul(String newJudul){
    this.judul = newJudul;
    }
    int getHarga(){
    return this.harga;
    }
    public void setHarga(int newHarga){
    this.harga = newHarga;
    }
    Penulis getPenulis(){
    return this.penulis;
    }
    public void setPenulis(Penulis newPenulis){
    this.penulis = newPenulis;
    }
    
}
