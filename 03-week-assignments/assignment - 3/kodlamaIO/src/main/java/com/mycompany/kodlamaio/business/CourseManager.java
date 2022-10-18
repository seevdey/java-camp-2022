/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.business;

import com.mycompany.kodlamaio.core.logging.Logger;
import com.mycompany.kodlamaio.dataAccess.CourseDao;
import com.mycompany.kodlamaio.entities.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sevde
 */
public class CourseManager {
    private CourseDao courseDao;   
    private Logger[] loggers; 
    public static List <String> courses = new ArrayList<>();

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;       
    }
    
    public void add(Course course) throws Exception{
        if (course.getPrice() <= 0) {
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
        }
        if (courses.contains(course.getCourseName())){
            throw new Exception("Kurs ismi tekrar edemez");
        }else{
            System.out.println("Kurs eklendi : " + course.getCourseName());
            courses.add(course.getCourseName());
            courseDao.add(course);
            for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        }
        
        
        
    }
    
}
