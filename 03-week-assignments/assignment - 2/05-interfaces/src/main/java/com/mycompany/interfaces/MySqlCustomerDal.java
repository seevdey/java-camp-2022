/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author sevde
 */
public class MySqlCustomerDal implements ICustomerDal, IRepository{
    //Bir class birden fazla interface i implement edebilir ancak 1 tane class ı extends edebilir
    @Override
    public void add() {
        System.out.println("My Sql Eklendi");
    }
}
