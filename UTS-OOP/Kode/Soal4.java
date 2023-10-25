/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Rakha
 */
public class Soal4 {
    public class Mahasiswa {
    String nim, nama, alamat; 
    char jenisKelamin;

    // a. Tambahkan constructor
    Mahasiswa(String NIM, String Nama, String Alamat, char Jk){
    this.nim    = NIM;
    this.nama   = Nama;
    this.alamat = Alamat;
    this.jenisKelamin = Jk;
    }
    // Gunakan constructor untuk

    // mengisi atribut nim, nama, alamat, jenisKelamin

    public static void main(String[] args) {
        Soal4 soal = new Soal4();
        
    // b. Buat objek mahasiswa
    // Isi atribut nim, nama, alamat, jenisKelamin // lewat constructor
        Soal4.Mahasiswa mhs = soal.new Mahasiswa("2241720113","Aleron Tsaqif Rakha","Malang",'L');
    }

    }
}
