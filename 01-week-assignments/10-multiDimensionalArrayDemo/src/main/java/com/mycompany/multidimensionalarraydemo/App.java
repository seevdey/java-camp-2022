/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multidimensionalarraydemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        String [][] sehirler = new String [3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Çorum";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Amasya";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Tokat";
        
        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler.length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
