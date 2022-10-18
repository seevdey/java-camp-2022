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
public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
         System.out.println("JDBC ile veritabanına eklendi");
    }

}
