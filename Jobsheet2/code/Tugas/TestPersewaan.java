/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class TestPersewaan {
 public static void main (String[]args){
 Persewaan p1 = new Persewaan();
 p1.id=10113;
 p1.nama="Ujang";
 p1.namaMember="Silver Member";
 p1.namaGame="CSnotGO";
 p1.harga=5000;
 p1.banyakHari=7;
 
 p1.hargaSewa(p1.banyakHari, p1.harga);
 p1.dataHasilPinjam();
 }   
}
