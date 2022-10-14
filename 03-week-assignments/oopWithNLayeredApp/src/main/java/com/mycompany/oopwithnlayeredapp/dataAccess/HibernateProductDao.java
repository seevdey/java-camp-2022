/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopwithnlayeredapp.dataAccess;

import com.mycompany.oopwithnlayeredapp.entities.Product;

/**
 *
 * @author sevde
 */
public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır...SQL
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
