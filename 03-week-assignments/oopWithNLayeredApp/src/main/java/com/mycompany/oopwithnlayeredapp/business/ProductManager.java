/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopwithnlayeredapp.business;

import com.mycompany.oopwithnlayeredapp.core.logging.Logger;
import com.mycompany.oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.mycompany.oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.mycompany.oopwithnlayeredapp.dataAccess.ProductDao;
import com.mycompany.oopwithnlayeredapp.entities.Product;
import java.util.List;

/**
 *
 * @author sevde
 */
public class ProductManager {
    private ProductDao productDao;
    
    //Yapacağın sistem 3 yeri loglasın --> FileLogger, MailLogger, DatabaseLogger yani hem maili hem veritabanını hem dosyayı loglamasını istiyosun
      //private List<Logger> loggers; 
    private Logger[] loggers; 

    public ProductManager(ProductDao productDao, Logger[] loggers) {//ProductManager new lendiğinde bana bir ProductDao ver
        //veri erişim kodumu yapan sınıf --> ProductDao productDao <-- yani gönderilen parametre
        this.productDao = productDao;
        this.loggers = loggers;
    }
    
    
    public void add(Product product) throws Exception{ //response request
        //iş kuralları
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        
        for (Logger logger : loggers) { //[db, mail]
            logger.log(product.getName());
        }
        
        
        /*JdbcProductDao productDao = new JdbcProductDao();
        //HibernateProductDao productDao = new HibernateProductDao();
        productDao.add(product);*/
        
        /*ProductDao productDao = new HibernateProductDao();//interface onu impelemt eden sınıfın referansını(new ini) tutawbilir       
        //ProductDao productDao = new JdbcProductDao();
         productDao.add(product);*/
        
        
        //Bir katman başka bir katmanın class ını kullanıyorken sadece interface inden erişim kurmalıdır
    }
}
