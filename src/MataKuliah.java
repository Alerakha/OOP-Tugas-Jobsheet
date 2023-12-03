/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package other;

/**
 *
 * @author Rakha
 */
public class MataKuliah {
     // Atribut.
    String nama_matakuliah;
    int sks;
    int totalSks;
    double nilai_mahasiswa;

    // Konstruktor.
    public MataKuliah(String nama_matakuliah, int sks, double nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
        
        this.totalSks+=sks;
    }

    // Fungsi hitung_bobot tanpa parameter.
    public double hitung_bobot() {
        return nilai_mahasiswa * sks;
    }

    // Overload fungsi hitung_bobot dengan parameter bobot_mahasiswa.
    public double hitung_bobot(double bobot_mahasiswa) {
        // Logika menghitung bobot mata kuliah dengan bobot_mahasiswa
        return bobot_mahasiswa/100 * sks;
    }
    
    // Fungsi menghitung total sks dari matakuliah-matakuliah yang nantinya akan dibuat 
    public int getTotalSks(){
    return totalSks;
    }
}
