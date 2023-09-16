/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rakha
 */
public class TestMahasiswa {
    public static void main(String[]args){
    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa();
    Mahasiswa mhs3 = new Mahasiswa();
    mhs1.nim=101;
    mhs1.nama="Lestari";
    mhs1.alamat="Jl. Vinolia No 1A";
    mhs1.kelas="1A";
    
    mhs2.nim=102;
    mhs2.nama="Antoni";
    mhs2.alamat="Jl. Barat Daya Samudra No.8";
    mhs2.kelas="1G";
    
    mhs3.nim=102;
    mhs3.nama="Rina";
    mhs3.alamat="Jl. Anggrek mekar No.12";
    mhs3.kelas="1C";
    
    mhs1.tampilBiodata();
    mhs2.tampilBiodata();
    mhs3.tampilBiodata();
    }
    
}
