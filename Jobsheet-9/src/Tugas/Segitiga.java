/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class Segitiga {
//Tugas Overloading
private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180-sudutA; 
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180-(sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling;
        keliling = sisiA+sisiB+sisiC;
        return keliling;
    }
    public double keliling(int sisiA,int sisiB){
        int keliling;
        double sisiC;
        sisiC = Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB, 2));
        keliling = sisiA+sisiB;
        return keliling;
    }
    
}
