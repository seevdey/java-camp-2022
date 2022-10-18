/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.dataAccess;

import com.mycompany.kodlamaio.entities.Course;

/**
 *
 * @author sevde
 */
public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    
}
