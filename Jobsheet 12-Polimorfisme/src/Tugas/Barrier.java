/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class Barrier implements Destroyable{
    private int Strength;
    Barrier(int Strength){
    this.Strength=Strength;
    }
    public void setStrength(int strength){
    this.Strength=strength;
    }
    public int getStrength(){
    return Strength;
    }
    public void Destroyed(){
    Strength-=9;
    }
    public String getBarrierInfo(){
    return "\nBarrier Strength = "+Strength;
    }
}
