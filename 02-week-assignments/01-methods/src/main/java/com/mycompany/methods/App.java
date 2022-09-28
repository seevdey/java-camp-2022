/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methods;

/**
 *
 * @author sevde
 */
public class App {
    //metod isimleri camelCase, class isimleri PascalCase olarak yazılır
    
    public static void main(String[] args) {
       sayiBulmaca();
       sayiBulmaca();
    }
    
    public static void sayiBulmaca(){
        int sayilar [] = new int []{15, 88, 650, 3245, 3, 0};
        int aranacak = 0;
        boolean varMi = false;
        
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        
        if (varMi) {
            mesajVer("" + aranacak);
        }else{
            mesajVer("Sayi mevcut değildir : " + aranacak);
        }
    }
        
     //parametreli metod
     public static void mesajVer(String aranacak){
        System.out.println("Sayi mevcuttur : " + aranacak);
    }
}
