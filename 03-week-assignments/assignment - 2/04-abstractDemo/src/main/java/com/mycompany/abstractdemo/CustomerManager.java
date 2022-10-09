/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractdemo;

/**
 *
 * @author sevde
 */
public class CustomerManager {
    
     /*Eğer bu şekilde sadece OracleDatabaseManager kullanırsak bağımlı hale geliriz
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();*/
    
    BaseDatabaseManager databaseManager; //Burada base sınıf bizim stratejimiz görevini görüyor
    //Yani siz kullanırken hangi veritabanı sistemini verirseniz onun getData() 'sı çalışacak
    
    public void getCustomers(){
       databaseManager.getData();
    }
}
