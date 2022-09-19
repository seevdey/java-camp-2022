/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mukemmelsayi;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        //Mükemmel Sayı = Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdır.
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        
        int toplam = 0;
        int sayi = 28;
        
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi==toplam) {
            System.out.println(sayi + " mükemmel sayidir");
        }else{
            System.out.println(sayi + " mükemmel sayi degildir");
        }
    }
}
