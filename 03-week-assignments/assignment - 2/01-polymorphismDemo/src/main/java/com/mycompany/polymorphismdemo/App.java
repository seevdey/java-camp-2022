/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymorphismdemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        //Polymorphism --> Çok Biçimlilik 
        //Aralarında bir inheritance varsa birbirlerinin referanslarını tutabiliyorlar
        
        /*
        BaseLogger [] loggers = new BaseLogger[]{
            new FileLogger(), new EmailLogger(), new DatabaseLogger()
                //new FileLogger(), new DatabaseLogger(), new ConsoleLogger()
                //new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()
        }; //extends BaseLogger olduğu için dizi içine alabildik. Yani FileLogger bir BaseLogger
        
        for (BaseLogger logger : loggers) {
            logger.Log("Log mesajı"); 
        }
        //Bu yöntemi kullanarak sisteminize istediğiniz kadar log ekleyebilirsiniz
       */
        
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
        
        /*Sonraki zamanlarda DatabaseLogger değil FileLogger loglanacak denilirse sadece DatabaseLogger() kısmını değiştiririz
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();*/
    }
}
