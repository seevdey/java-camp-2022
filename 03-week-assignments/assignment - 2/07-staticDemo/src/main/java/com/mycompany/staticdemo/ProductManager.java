/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staticdemo;

/**
 *
 * @author sevde
 */
public class ProductManager { //Bu tip (Manager) class ları static tanımlanmaz. 
    //Yani static yaptığınız zaman ilk çağıran kullanıcı nesneyi oluşturuyor sonra diğer tüm kullanıcılar aynı nesneyi kullanıyor 
    
    public void add(Product product){//ürünü veritabanına ekleme
        //ProductValidator validator = new ProductValidator();
        
        //if içinde ProductValidator yadığımda isValid() gelmiyor. Ancak ProductValidator sınıfındaki metodu static yaparsan isValid() gelir
        
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        }else{
            System.out.println("Ürün bilgileri geçersizdir");
        }
    }
}
