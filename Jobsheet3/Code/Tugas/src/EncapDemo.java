/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rakha
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
    return name;
    }
    
    public void setName(String newName){
    name=newName;
    }
    
    public int getAge(){
    return age;
    }
    
    public void setAge(int newAge){
        if(newAge>30){
        age=30;
        }if(newAge<18){  //Ubahan tugas no.3
        age = 18;
        }
    }
}
