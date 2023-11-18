/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rakha
 */
public class JumpingZombie extends Zombie implements Destroyable{
    JumpingZombie(int health, int level){
    this.health=health;
    this.level=level;
    }
    
    public void heal(){
        if(level==1){
            health+=30;
        }else if (level==2){
            health+=40;
        }else if (level==3){
            health+=50;
        }  
    }
    
    public void Destroyed(){
        health-=1;
    }
     
    public String getZombieInfo(){
        String info = "\nJumping Zombie Data :";
        info += "\nHealth : "+health;
        info+="\nLevel : "+level+"\n";
        return info;
    }
}
