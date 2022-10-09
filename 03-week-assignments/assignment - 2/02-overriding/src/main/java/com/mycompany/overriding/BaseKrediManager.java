/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overriding;

/**
 *
 * @author sevde
 */
public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }         
}

//Bir class ın herhangi bir metodu siz aksini belitmediğiniz sürece 'overradible'yani üzerine yazılabilir

/*
Bir metodun herkes için aynı, asla override edilmesini istemiyorsan --> final anahtar kelimesini kullanman gerek
Yani metodu final ile işaretlersen onu kimse ezemez

    public final double hesapla(double tutar){
            return tutar * 1.18;
    } 
*/



