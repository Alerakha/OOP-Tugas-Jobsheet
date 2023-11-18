/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author Rakha
 */
public class Tester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik",500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e[] = {pEmp,iEmp};
        Payable p[]={pEmp,eBill};
//        Employee e2[] = {pEmp,iEmp,eBill}; command karena error
    }
    
}
