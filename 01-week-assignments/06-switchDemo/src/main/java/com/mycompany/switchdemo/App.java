/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switchdemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        char grade = 'S';
        
        switch(grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
            case 'F':
                System.out.println("Maalesef :Kaldınız");
                break;
            default:
                System.out.println("!!!Geçersiz not girdiniz");
        }
    }
}
