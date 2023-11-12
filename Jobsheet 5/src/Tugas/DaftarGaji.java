/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int size) {
        listPegawai = new Pegawai[size];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Gaji: " + pegawai.getGaji());
            System.out.println("-------------------");
        }
    }
}
