/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleron.relasiclass.Tugas;

/**
 *
 * @author Rakha
 */
public class TugasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiket t1 = new Tiket("E12");
        Tiket t2 = new Tiket("B04");
        Tiket t3 = new Tiket("B09");
        Tiket t4 = new Tiket("A07");
        Penumpang p1 = new Penumpang("Aleron","0022");
        Penumpang p2 = new Penumpang("Tsaqif","0417");
        Penumpang p3 = new Penumpang("Rakha","0020");
        Penumpang p4 = new Penumpang("Rajendra","0113");
        Kru o1 = new Kru("1131","Daniel","Pilot");
        Kru o2 = new Kru("4044","Mawar","Pramugari");
        Pesawat plane = new Pesawat("F-113","Fly High",o1,o2,5);
        plane.setPenumpang(p1, 1);
        plane.setPenumpang(p2, 2);
        plane.setPenumpang(p3, 3);
        plane.setPenumpang(p4, 4);
        
        System.out.println(plane.info());
    }
    
}
