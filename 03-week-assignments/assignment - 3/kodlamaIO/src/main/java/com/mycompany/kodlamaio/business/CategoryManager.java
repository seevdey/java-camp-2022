/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.business;

import com.mycompany.kodlamaio.core.logging.Logger;
import com.mycompany.kodlamaio.dataAccess.CategoryDao;
import com.mycompany.kodlamaio.entities.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sevde
 */
public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    public static List<String> categories = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    
    public void add(Category category) throws Exception{
        if (categories.contains(category.getCategoryName())) {
            throw new Exception("Kategori ismi tekrar edemez");
        }
        else{
            System.out.println("Kategori eklendi : " + category.getCategoryName());
            categories.add(category.getCategoryName());
            categoryDao.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getCategoryName());
            }
        }
    }
  
    
    
}
