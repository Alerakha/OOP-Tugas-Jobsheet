/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author Rakha
 */
public class SoalArray1 {

public static void main(String[] args) {
int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
// hitung jumlah elemen array 2 dimensi
// gunakan perulangan
int jumlah=0;
int total=0;
    for(int i=0;i<arrayInt.length;i++){
        for(int j=0;j<arrayInt[i].length;j++){
           jumlah++;
           total+=arrayInt[i][j];
        }
    }
    System.out.println("Jumlah Element dari array sebanyak : "+jumlah);
    System.out.println("Total dari semua element array adalah : "+total);
}
}
