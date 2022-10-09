/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaces;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        /*
        Interface, uygulamalarda bağımlılığı yönettiğiniz yapılardır
        NYP nin 3 temel üyesi vardır; class, abstract class, interface
        Interface de metotlar içerisinde temel anlamda interface  tamamlnamamış operasyonlar için yazıyoruz
        Interface lerde biz istediğimiz kadar implementasyon kabul ediliyor, inheritance kabul edilmiyor. Bir class birden fazla interface i implement edebiliyor(yani uygulayabiliyor) 
        Interface'ler bir class kabul edilmiyor ama interface ler de aynen normal class lar gibi veya abstract class lar gibi referans tutabiliyorlar
        */
        
        //Interface ler de abstractlar gibi new lenemezler
        //ICustomerDal customerDal = new ICustomerDal ();
        
        //Interface onu implement eden class ın referansını tutabilir
        //ICustomerDal customerDal = new OracleCustomerDal ();
        
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        
        /*Son yapıyı oluşturduktan sonra bu yapılara ihtiyacımız yok
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.customerDal = new SqlServerCustomerDal();*/
        customerManager.add();
    }
}
