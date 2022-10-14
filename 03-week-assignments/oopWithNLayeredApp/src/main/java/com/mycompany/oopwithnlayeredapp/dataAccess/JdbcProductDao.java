/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopwithnlayeredapp.dataAccess;

import com.mycompany.oopwithnlayeredapp.entities.Product; //Bir paketten başka bir paket kullanıyorsan onu import etmen gerekir


/**
 *
 * @author sevde
 */
public class JdbcProductDao implements ProductDao{ //BU class implement edildiği için ProductDao nun kurallarına uymak zorunda
    //Veri tabanına erişim işlemlerimi gerçekleştiriyorum
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır...SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}


//Hibernate