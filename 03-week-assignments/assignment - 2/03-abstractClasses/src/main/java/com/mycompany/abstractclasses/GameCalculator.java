/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclasses;

/**
 *
 * @author sevde
 */
public abstract class GameCalculator {
    //Yapıyı tasarlarken tüm hepsinde hesaplama yapacağım için GameCalculator sınıfı oluşturdum (base yapı)
    //base burda bizim için referans tutucu ve kuralları ortaya koyan görevini görüyor 
    
    //hesapla() metodunu kim implement ediyorsa hesapla() yı içermek zorunda fakar hesapla() yı override etmek zorunda
    //Herkesin ayrı ayrı doldurması gerekiyor
    public abstract void hesapla();
    
    //GameCalculator class ını kim kullanırsa kullansın gameOver() metodunu olduğu gibi kullanmak zorunda bu hiçbir zaman değişmeyecek bir kuraldır
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
    

}
