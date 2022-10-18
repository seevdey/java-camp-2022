/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.dataAccess;

import com.mycompany.kodlamaio.entities.Category;

/**
 *
 * @author sevde
 */
public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    
}
