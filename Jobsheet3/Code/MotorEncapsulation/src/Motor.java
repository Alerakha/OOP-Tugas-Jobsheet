/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rakha
 */
public class Motor {
    private int kecepatan= 0;
    private boolean kontakOn=false;
    
    public void nyalakanMesin(){
    kontakOn=true;
    }
    public void matikanMesin(){
    kontakOn=false;
    kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true){
            if(kecepatan>100){
                System.out.println("Kecepatan sudah maksimal, tidak dapat menambah kecepatan");
                kecepatan=100;
            }else{
                kecepatan +=5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off: \n");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn==true){
        kecepatan-=5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off: \n");
        }
    }
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
