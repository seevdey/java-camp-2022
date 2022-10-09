/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author sevde
 */
public class CustomerManager {
    
    private ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal){//CustomerManager 'ın constructor ında ICustomerDal istiyorum
        this.customerDal = customerDal;
    }
    
    public void add(){
        //iş kodları
        customerDal.add();
    }
}
