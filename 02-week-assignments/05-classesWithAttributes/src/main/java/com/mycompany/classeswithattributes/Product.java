/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeswithattributes;

/**
 *
 * @author sevde
 */
public class Product {
    
    //Her class ın default bir Constructor'ı vardır.
    //Constructor --> Yapıcı metod
    
    //Product class ının 1 tane parametreli 1 tane parametresiz Constructor'ı var. İsteyen istediğini kullanır. Buna overloading deniyor.
    //Aynı isim farklı parametrelerle metodları kullanabiliyoruz
    public Product(){
        System.out.println("Yapıcı blok çalıştı");
    }
    
    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this._id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }
    
    //class önemli özelliklerinden biri de özellik tutması --> attribute
    //class lar attribute barındırır
    //Bir class bir iş yapar
    
    /*attribute | field
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;*/
   
    /* Product class ı hem attribute tutup hem de metodları içermemeli. Bunları birbirinden ayırmalıyız.
    Bu yüzden bu class a metod yazmıyoruz. Bu metodu ProductManager a yazıyoruz
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün eklendi " + product.name);
    }*/
    
    
    //Get --> okuma, Set --> değer atama
    //attribute | field
    private int _id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //Getter
    public int getId() {//Id yi oku
        return _id;
    }

    //Setter
    public void setId(int id) {
        _id = id;
        
        //this.id = id;
        //this benim içerisinde bulunduğum class demek
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + _id; 
    }
    //kodu hiçbir şekilde yazılabilir istemezsek setKod()'u sileriz. Kodu kullanıcının yazmasını engellemiş olduk
}
