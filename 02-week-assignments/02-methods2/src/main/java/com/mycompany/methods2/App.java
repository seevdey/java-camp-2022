/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methods2;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        //substring bir değer return ediyor
        //yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        
        int sayi = topla(5,7);//2 parametre ekleyerek topla
        System.out.println(sayi);
        
        int topla = topla2(5,6,7,77,2,0,76); //istenilen kadar sayıyı topla
        System.out.println(topla);
    }
    
    public static void ekle(){
        System.out.println("Eklendi");
    }
    
    public static void sil(){
        System.out.println("Silindi");
    }
    
    public static void guncelle(){
        System.out.println("Günellendi");
    }
    
    //return --> bitir, fonksiyonu devam ettirme demek
    
    //bu fonksiyon int türünde bir değer döndürür
    public static int topla(int sayi1, int sayi2){
        //return 5;
        return sayi1 + sayi2; // bu iki sayıyı toplayı döndürecek
    }
    
    //toplama işleminde istenilen sayı kadar toplama işlemi yaptırmak için Variable Arguments kullanılır
    public static int topla2(int... sayilar){ //bu metodda ne gönderdiği belli değil. Nesne gönderildiğinde test edilebilirliği azalır
        int toplam=0;
        for (int sayi : sayilar) { //sayilar daki her bir sayi için
            toplam += sayi;
        }
        return toplam;
    }
    
    public static String sehirVer(){
        return "Ankara";
    }
}
