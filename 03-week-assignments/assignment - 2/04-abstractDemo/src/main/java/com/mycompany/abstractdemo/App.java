/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstractdemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        //customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();
        
        /*
        Sisteme MySQLDatabase i eklemek istiyorum 
        solid --> o --> bir sisteme yeni biz özellik getirildiğinde mevcuttaki hiçbir kodu değiştiremezsin
        */               
    }
}
