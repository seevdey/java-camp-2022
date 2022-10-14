/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopwithnlayeredapp.core.logging;

/**
 *
 * @author sevde
 */
public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı " + data);
    }
    
}
