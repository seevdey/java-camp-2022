/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author sevde
 */
public class SqlServerCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Sql Server eklendi");
    }
}
