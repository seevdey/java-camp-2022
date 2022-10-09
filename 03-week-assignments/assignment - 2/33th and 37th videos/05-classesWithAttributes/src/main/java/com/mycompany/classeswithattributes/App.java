/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classeswithattributes;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        //Product product = new Product(1, "Laptop", "Asus", 4800, 5, "siyah");
        
        Product product = new Product();
        product.setName("Laptop");
        //product.id = 1;
        product.setId(1);
        product.setDescription("Acer Laptop");
        product.setPrice(4800);
        product.setStockAmount(5);
        
        //System.out.println(product.name);
        
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        
        //Encapsulation --> Kullanıcıyı herhangi bir alanı kullanmak için kısıtlamayı öngörür.
        //productManager.Add2(1, "", "", 2, 200); --> böyle kullanılmamalı
        System.out.println(product.getKod());
    }
}
