/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class TugasInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac M = new Mac("Mac_UD3",1700,2,"Core i9","Li-Ion Gen3","Apple T2");
        M.tampilMac();
        System.out.println();
        
        Windows W = new Windows("AcerX12",1400,1,"Core i9","Li-Ion X","Windows Smart");
        W.tampilWindows();
        System.out.println();
        Pc pc = new Pc("Alpha i7X1",1800,3,"AMD HighGen X",34);
        pc.tampilPc();
    }
    
}
