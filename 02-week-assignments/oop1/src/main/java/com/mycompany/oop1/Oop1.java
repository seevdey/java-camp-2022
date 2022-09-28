/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.oop1;

/**
 *
 * @author sevde
 */
public class Oop1 {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product(); // ürünü tanımlamak için oluşturduğumuz class
        //set --> yazmak için, get --> okumak için
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(5000);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        
        //tüm class ların ebeveyni var biz onlara obje diyoruz
        //set value
//        product1.name = "Delonghi Kahve Makinesi";
//        product1.unitPrice = 6500;
//        product1.discount = 2;
//        product1.unitsInStock = 3;
//        product1.imageUrl = "img.jpg";

        //get
        //System.out.println(product1.name);
        Product product2 = new Product();
        product2.setName("Arcelik Kahve Makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(6900);
        product2.setUnitsInStock(8);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Siemens Kahve Makinesi");
        product3.setDiscount(3);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(7);
        product3.setImageUrl("image3.jpg");
        
        Product [] products = {product1, product2, product3};
        
        System.out.println("<ul>");
        //product --> kendi isimlendirdiğimiz değişken
        for (Product product : products) {//products ların içinde productları gez
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");
        
        IndividualCustomers individualCustomers = new IndividualCustomers();
        individualCustomers.setId(1);
        individualCustomers.setPhone("0500000");
        individualCustomers.setCustomerNumber("12345");
        individualCustomers.setFirstName("Engin");
        individualCustomers.setLastName("Demirog");
        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(5);
        corporateCustomer.setCustomerNumber("45652");
        corporateCustomer.setPhone("05333333");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCompanyName("Kodlama.io");
    
        Customer [] customers = {individualCustomers, corporateCustomer};
    }
}
