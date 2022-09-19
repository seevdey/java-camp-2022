/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sayibulma;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
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
            System.out.println("Sayi mevcuttur");
        }else{
            System.out.println("Sayi mevcut değildir");
        }
    }
}
