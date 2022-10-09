/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphismdemo;

/**
 *
 * @author sevde
 */
public class CustomerManager {
    //Bağımlı sistem yapmak yerine;;
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger logger){//BaseLogger <-- çalıştığım log
        this.logger = logger;
    }
    
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");
        
        /*Bir class a başka bir class tan new yapmak demek bağımlı bir sistem olması demek
        DatabaseLogger logger = new DatabaseLogger();
        logger.Log("Log mesajı");*/
    }
}
