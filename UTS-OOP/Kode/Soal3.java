/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Rakha
 */
public class Soal3 {
    public class Class {
    int a = 2;

    int x = 0;

        int hitung() {

            x = x + 5 * a; return x;

        }
    }

    public class ClassY extends Class {
        int b = 5;
        int y = 0;
        int hitungY() {
        y = hitung() * b;
        return y;
        }
    }
    
    public static void main(String[]args){
        Soal3 soal = new Soal3();
        Soal3.ClassY objY = soal.new ClassY();

        int hasilHitungY = objY.hitungY();
        System.out.println("Hasil hitungY: " + hasilHitungY);
        
    }
}
