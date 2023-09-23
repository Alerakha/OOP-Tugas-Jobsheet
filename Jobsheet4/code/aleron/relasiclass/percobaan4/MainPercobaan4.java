/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleron.relasiclass.percobaan4;

/**
 *
 * @author Rakha
 */
public class MainPercobaan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Penumpang p = new Penumpang("12345","Mr. Krab");
    Penumpang budi = new Penumpang("5567","Budi");
    Gerbong gerbong = new Gerbong("A",10);
    gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    gerbong.setPenumpang(budi, 1);
    gerbong.setPenumpang(budi, 2);
        System.out.println(gerbong.info());
    }
    
}
