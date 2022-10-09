/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staticdemo;

/**
 *
 * @author sevde
 */
public class ProductValidator {//Bir ürünü kaydederken, güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanırız
    //Ana class static olamaz
    
    static{
        System.out.println("Static Yapıcı blok çalıştı");
    }
    
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    //Metodu static yapınca class ismiyle çağırabilirsiniz
    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty()) { // ürünü veritabanına eklemek için fiyatı 0 dan büyük olmalı ve ismi boş olmamalı
            return true;
        }else{
            return false;
        }
    }
    
    public void bisey(){//Yapıcı bloklar new leyince çalışır
        
    }
    
    
    /*Inner Class --> gruplandırma amaçlı kullanılır
    public static class BaskaBirClass{//class içinde static olarak başka bir class tanımlayabilirsin
        public static void sil(){
            
        }
    }*/
}
