/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan1;

/**
 *
 * @author Rakha
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
    }
    Laptop(String inMerk, Processor inProc){
        this.merk=inMerk;
        this.proc=inProc;
    }
    
    public void setMerk(String newMerk){
    this.merk = newMerk;
    }
    public void setProc(Processor proc){
    this.proc = proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}
