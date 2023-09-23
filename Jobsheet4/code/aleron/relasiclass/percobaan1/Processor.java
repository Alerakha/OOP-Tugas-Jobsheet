/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan1;

/**
 *
 * @author Rakha
 */
public class Processor {
    private String merk;
    private double cache;
    
    Processor(){
    }
    Processor(String inMerk,double inCache){
    this.merk = inMerk;
    this.cache = inCache;
    }
    
    public String getMerk(){
        return merk;
    }
    public void setMerk(String newMerk){
        this.merk = newMerk;
    }
    
    public double getCache(){
    return cache;
    }
    public void setCache(double newCache){
    this.cache = newCache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    
}
