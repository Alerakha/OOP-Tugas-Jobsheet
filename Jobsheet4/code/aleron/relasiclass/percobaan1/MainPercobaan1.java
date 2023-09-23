/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleron.relasiclass.percobaan1;

/**
 *
 * @author Rakha
 */
public class MainPercobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Processor p = new Processor("ThinkPad",3);
    p.info();
    Processor p1 = new Processor();
    p1.setMerk("Intel i5");
    p1.setCache(4);
    
    Laptop L1 = new Laptop();
    Laptop l = new Laptop("Thinkpad",new Processor("Intel i5",3));
    
    L1.setMerk("ThinkPad");
    L1.setProc(p1);
    L1.info();
    l.info();
    }
    
}
