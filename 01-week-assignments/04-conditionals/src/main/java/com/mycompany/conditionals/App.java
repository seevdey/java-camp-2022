/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conditionals;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        int sayi = 20;
        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktür");
        }else if(sayi == 20){
            System.out.println("Sayı 20 ye eşittir");
        }else{
            System.out.println("Sayı 20 den büyüktür");
        }
    }
}
