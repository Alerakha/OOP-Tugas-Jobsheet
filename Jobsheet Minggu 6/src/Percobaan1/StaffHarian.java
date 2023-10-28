/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author Rakha
 */
public class StaffHarian extends Staff {
    public int jmlJamKerja;   
    public StaffHarian(){
    
    }
    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
    super(nama,alamat,jk,umur,gaji,lembur,potongan);
    this.jmlJamKerja=jmlJamKerja;
    }
    public void tampilStaffHarian(){
    System.out.println("============ Data Staff Tetap ============");
        super.tampilDataStaff();
        System.out.println("Jumlah jam kerja="+jmlJamKerja);
        System.out.println("Gaji Bersih     ="+(gaji*jmlJamKerja+lembur-potongan));
    }
}
