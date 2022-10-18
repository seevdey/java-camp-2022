/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodlamaio.core.logging;

/**
 *
 * @author sevde
 */
public class MailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Mail loglandı : " + data);
    }
    
}
