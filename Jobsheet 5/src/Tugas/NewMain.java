/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai a = new Pegawai("190","Aleron","Lawang");
        Pegawai p =new Pegawai("091","Tsaqif","Malang");
        Pegawai c =new Pegawai("097","Rakha","Malang");
        Dosen p1 = new Dosen(p.nip,p.nama,p.alamat,18,400_000);
        Dosen c1 = new Dosen(c.nip,c.nama,c.alamat,20,400_000);
        
        
        DaftarGaji g = new DaftarGaji(5);
        g.addPegawai(a);
        g.addPegawai(c1);
        g.addPegawai(p1);
        g.printSemuaGaji();
   
    }
    
}
