/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rakha
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang\t: "+namaBrg);
        System.out.println("Jenis Barang\t: "+jenisBrg);
        System.out.println("Stok\t\t: "+stok);
    }
    //method dengan nilai return
    public int tambahStock(int brgMasuk){
    int stokBaru=brgMasuk;
    return stokBaru;
    }
    
}
