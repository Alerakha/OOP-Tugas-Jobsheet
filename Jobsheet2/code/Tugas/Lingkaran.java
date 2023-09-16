/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Lingkaran {
    double phi;
    public double r;
    private double luas;
    private double keliling;
    
    public double hitungLuas(double jari_jari){
        phi=22.7;
        luas=phi*jari_jari*jari_jari;
        return luas;
    }
    
    public double hitungKeliling(double jari_jari){
        phi=22.7;
        return keliling=phi*(2*jari_jari);
    }
    
}
