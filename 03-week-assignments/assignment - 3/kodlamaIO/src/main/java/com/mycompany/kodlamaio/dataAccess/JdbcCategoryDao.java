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
public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
  
}
