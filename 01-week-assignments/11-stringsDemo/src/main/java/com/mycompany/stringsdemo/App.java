/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringsdemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok kötü.";
        System.out.println(mesaj);
        
//        System.out.println("Eleman sayısı : " + mesaj.length());
//        System.out.println("3. eleman: " + mesaj.charAt(2));
//        System.out.println(mesaj.concat("Yaşasın!"));
//        System.out.println(mesaj.startsWith("B"));//Başlanan harf kontrolü -- true 
//        System.out.println(mesaj.startsWith("b"));//false
//        System.out.println(mesaj.endsWith("."));
//        
//        char [] karakterler = new char[5];
//        mesaj.getChars(0, 4, karakterler, 0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("av"));//baştan arama
//        System.out.println(mesaj.lastIndexOf("a"));//aramaya en sağdan başlıyor
        
        String yeniMesaj = mesaj.replace(' ', '-'); //her boşluk için - ekle
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));//2. indexten 4. indexe kadar yazdır. 4 dahil değil
        
        //Split metodu bir karakteri veya bir karakter dizisini dikkate alarak parçalamaya yarar
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        
        System.out.println(mesaj.toLowerCase());//kelimelerin tüm harflerini küçük harfe çevirir
        System.out.println(mesaj.toUpperCase());//kelimelerin tüm harflerini büyük harfe çevirir
        
        String mesaj2 = "   Bugün hava çok kötü.";
        System.out.println(mesaj2.trim()); //baş ve sondaki başlıkları atmaya yarar
    }
}
