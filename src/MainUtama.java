/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package other;

/**
 *
 * @author Rakha
 */
public class MainUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Aleron", "123456", 350);
        Mahasiswa mahasiswa2 = new Mahasiswa("Tsaqif", "654321", 365);

        // Membuat objek mata kuliah
        MataKuliah matakuliah1 = new MataKuliah("Pemrograman Java", 3, 4.0);
        MataKuliah matakuliah2 = new MataKuliah("Basis Data", 4, 3.5);

        // Membuat objek perwalian
        Perwalian perwalian = new Perwalian();

        // Menambahkan mahasiswa dan mata kuliah ke dalam perwalian
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMataKuliah(matakuliah1);

        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(matakuliah2);

        // Menampilkan hasil perwalian
        perwalian.printAll();
    
    }
    
}
