/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miniprojeasalsayi;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        int sayi = 25;
        int remainder = sayi % 2;
        
        System.out.println(remainder);
        
        boolean isPrime = true;
        
        if (sayi==1) {
            System.out.println("Sayı asal değildir");
        }
        if (sayi<1) {
            System.out.println("Geçersiz sayi");
        }
        
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }
    }
}
