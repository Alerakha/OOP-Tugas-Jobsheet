/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
class Dosen extends Pegawai {
    private int jumlahSKS;
    private int tarif_sks;

    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarif_sks) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.tarif_sks = tarif_sks;
    }

    public int getSKS() {
        return jumlahSKS;
    }

    @Override
    public int getGaji() {
        // implementasi perhitungan gaji khusus untuk dosen
        // ...
        return super.getGaji()+(this.jumlahSKS*this.tarif_sks);
    }
}
