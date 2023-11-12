/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;

/**
 *
 * @author Rakha
 */
public class ClassB extends ClassA{
    private int z;
    ClassA a;
    public void setNilaiZ(int z){
    this.z=z;
    }
    public void getNilaiZ(){
        System.out.println("nilai z : "+z);
    }
    
    public void getJumlah(){
        System.out.println("Jumlah : "+(a.getX()+a.getY()+z));
    }
}
