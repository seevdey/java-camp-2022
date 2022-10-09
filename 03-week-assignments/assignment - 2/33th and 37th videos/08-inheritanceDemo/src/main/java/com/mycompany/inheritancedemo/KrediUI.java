/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritancedemo;

/**
 *
 * @author sevde
 */
public class KrediUI {
    /*
    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
        ogretmenKrediManager.Hesapla();
    }*/
    
    //üstteki metod gibi yapmak yerine;
    //böyle yapabiliriz
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.Hesapla();
    }
}
