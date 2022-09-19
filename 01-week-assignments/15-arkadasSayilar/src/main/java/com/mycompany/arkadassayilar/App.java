/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arkadassayilar;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
        /*
        220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 
        284 : 1 + 2 + 4 + 71 + 142 = 220 
        */
        
        int sayi1 = 220;
        int sayi2=284;
        int toplam1 = 0;
        int toplam2 = 0;
        
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }
        
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }
        
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("bu iki sayi arkadastir");
        }else{
            System.out.println("bu iki sayi arkadas degildir");
        }
    }
}
