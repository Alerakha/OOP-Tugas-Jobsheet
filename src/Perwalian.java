/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package other;

/**
 *
 * @author Rakha
 */
public class Perwalian {
    // Atribut
    Mahasiswa[] daftar_mhs;
    MataKuliah[] daftar_matkul;
    int jumlahMahasiswa;
    int jumlahMataKuliah;

    // Konstruktor dengan inisialisasi array
    public Perwalian() {
        daftar_mhs = new Mahasiswa[10];
        daftar_matkul = new MataKuliah[10];
        jumlahMahasiswa = 0;
        jumlahMataKuliah = 0;
    }

    // Fungsi untuk menambahkan mahasiswa
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (jumlahMahasiswa < 10) {
            daftar_mhs[jumlahMahasiswa] = mahasiswa;
            jumlahMahasiswa++;
        } else {
            // Jika kapasitas penuh maka akan menjalankan else
            System.out.println("Kapasitas mahasiswa penuh");
        }
    }

    // FUngsi untuk menambahkan mata kuliah yang diambil oleh mahasiswa
    public void tambahMataKuliah(MataKuliah matakuliah) {
        if (jumlahMataKuliah < 10) {
            daftar_matkul[jumlahMataKuliah] = matakuliah;
            jumlahMataKuliah++;
        } else {
            // Jika kapastias penuh maka akan melakukan else
            System.out.println("Kapasitas mata kuliah penuh");
        }
    }

    // Fungsi untuk mencetak seluruh data mahasiswa beserta mata kuliah yang diambil
    public void printAll() {
        System.out.println("Data Perwalian:");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            Mahasiswa mahasiswa = daftar_mhs[i];
            System.out.println("Mahasiswa: " + mahasiswa.nama + " (NIM: " + mahasiswa.nim + ")");
            System.out.println("IPK: " + mahasiswa.hitung_ipk());
            // Perhitungan IPK berdasarkan sks yang daimbil mahasiswa
            System.out.println("- "+"Perhitungan menggunakan parameter SKS");
            System.out.println("  "+"IPK: " + mahasiswa.hitung_ipk(daftar_matkul[i].getTotalSks()));
            
            System.out.println("Mata Kuliah yang Diambil:");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                MataKuliah matakuliah = daftar_matkul[j];
                System.out.println("- " +matakuliah.nama_matakuliah + " (SKS: " + matakuliah.sks + ")");
                System.out.println("  Bobot: " + matakuliah.hitung_bobot());
                System.out.println("> "+"Perhitungan menggunakan parameter bobot nilai");
                System.out.println("  Bobot: "+matakuliah.hitung_bobot(daftar_mhs[j].nilai));
            }
            System.out.println("================================");
            System.out.println();
                    
        }
    }
}
