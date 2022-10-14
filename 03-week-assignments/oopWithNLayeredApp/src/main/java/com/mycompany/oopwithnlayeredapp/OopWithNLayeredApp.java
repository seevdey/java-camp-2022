/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.oopwithnlayeredapp;

import com.mycompany.oopwithnlayeredapp.business.ProductManager;
import com.mycompany.oopwithnlayeredapp.core.logging.DatabaseLogger;
import com.mycompany.oopwithnlayeredapp.core.logging.FileLogger;
import com.mycompany.oopwithnlayeredapp.core.logging.Logger;
import com.mycompany.oopwithnlayeredapp.core.logging.MailLogger;
import com.mycompany.oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.mycompany.oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.mycompany.oopwithnlayeredapp.entities.Product;

/**
 *
 * @author sevde
 */
public class OopWithNLayeredApp {

    public static void main(String[] args) throws Exception {
        //Data Access(veriye erişim) JDBC, Hibernate-ORM, JPA bu yöntemler ile yapabilirsiniz
        Product product1 = new Product(1, "Iphone Xr", 10000);
        //Product product1 = new Product(1, "Iphone Xr", 9); --> ürünün fiyatını 10 dan küçük girersen hata alırsın
        
        /*ProductManager productManager = new ProductManager();
        productManager.add(product1);*/
        
        /*ProductManager productManager = new ProductManager(new JdbcProductDao());
        //ProductManager productManager = new ProductManager(new HibernateProductDao());
        productManager.add(product1);*/
        
        //Logger [] loggers = {new DatabaseLogger(), new MailLogger()}; //mail ve database log lansın
        //Logger [] loggers = {}; hiçbir şey loglama
        Logger [] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};//mail, database ve dosya loglansın
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}
