/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.dataAccess;

import com.mycompany.kodlamaio.entities.Instructor;

/**
 *
 * @author sevde
 */
public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    
}
