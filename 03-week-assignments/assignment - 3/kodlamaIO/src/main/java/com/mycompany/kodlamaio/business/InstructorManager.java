/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.business;

import com.mycompany.kodlamaio.core.logging.Logger;
import com.mycompany.kodlamaio.dataAccess.InstructorDao;
import com.mycompany.kodlamaio.entities.Instructor;

/**
 *
 * @author sevde
 */
public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    
      public void add(Instructor instructor) {
          System.out.println("Eğitmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
          instructorDao.add(instructor);
          for (Logger logger : loggers) {
              logger.log(instructor.getFirstName() + " " + instructor.getLastName());
          }
      }

}
