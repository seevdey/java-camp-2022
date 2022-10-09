/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overriding;

/**
 *
 * @author sevde
 */
public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){ //burada BaseKrediManager class ındaki hesapla() yı ezmiş oluyoruz
        return tutar * 1.10;
    }  
}
