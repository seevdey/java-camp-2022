/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kodlamaio;

import com.mycompany.kodlamaio.business.CategoryManager;
import com.mycompany.kodlamaio.business.CourseManager;
import com.mycompany.kodlamaio.business.InstructorManager;
import com.mycompany.kodlamaio.core.logging.CourseLogger;
import com.mycompany.kodlamaio.core.logging.DatabaseLogger;
import com.mycompany.kodlamaio.core.logging.FileLogger;
import com.mycompany.kodlamaio.core.logging.Logger;
import com.mycompany.kodlamaio.core.logging.MailLogger;
import com.mycompany.kodlamaio.dataAccess.HibernateCourseDao;
import com.mycompany.kodlamaio.dataAccess.HibernateInstructorDao;
import com.mycompany.kodlamaio.dataAccess.JdbcCategoryDao;
import com.mycompany.kodlamaio.entities.Category;
import com.mycompany.kodlamaio.entities.Course;
import com.mycompany.kodlamaio.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sevde
 */
public class KodlamaIO {

    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1, "JAVA", 654);
        Course course2 = new Course(2 ,"PYTHON", 123);     
        Course course3 = new Course(3 ,"PYTHON", 7687);  
        Course course4 = new Course(4 ,"C#", 0);
        
        Category category1 = new Category(1, "Yazılım");
        Category category2 = new Category(2, "Donanım");
        Category category3 = new Category(3, "Yazılım");
        
        Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
        
        Logger [] loggers = {new DatabaseLogger(), new CourseLogger()};
        
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);
        //courseManager.add(course3); --> Kurs ismi tekrar edemez
        //courseManager.add(course4); --> Kurs fiyatı 0 dan küçük ve eşit olamaz
        
        System.out.println("------------");
        
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);
        //categoryManager.add(category3); --> Kategori ismi tekrar edemez
        
        System.out.println("------------");
                
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor1);
    }
}
