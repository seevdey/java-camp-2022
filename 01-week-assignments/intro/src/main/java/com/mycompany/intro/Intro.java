/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.intro;

/**
 *
 * @author sevde
 */
public class Intro {

    public static void main(String[] args) {
        //1. DERS NOTLARI - 14.09.2022
        System.out.println("Hello World!");
        
        //Değişken isimlendirmeleri Java'da camelCase yazılır
        String ortaMetin = "metinsel türde veri tutma";
        String altMetin = "Vade Süresi";
        
        System.out.println(ortaMetin);
        
        //integer
        int vade = 12;
        
        double dolarDun = 18.10;
        double dolarBugun = 18.10;
        
        boolean dolarDustuMu = false; //true ya da false değeri alır
        
        String okYonu = "down.svg";
        
        //çıkardığı sonuç ya true ya da false olabilir. Yani ya sağlanır ya da sağlanmaz
        if (dolarBugun < dolarDun) { //eğer true sağlanırsa bu bloğu çalıştır
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }else{
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        
        //ARRAY
        String [] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};
        
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}
