/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author Rakha
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    
    Mahasiswa(String nama, String no_nim){
    this.nama=nama;
    this.nim=no_nim;
    }
    
    public String getNim(){
    return this.nim;
    }
    public String getNama(){
    return this.nama;
    }
    public void display(){
        System.out.println("Nama\t: "+this.nama);
        System.out.println("Nim\t: "+this.nim);
    }
}
