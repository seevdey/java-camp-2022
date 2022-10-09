/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstractclasses;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        
        /*
        -Abstract class sadece başka sınıfı inherit edebilir veya bir sınıf sadece bir sınıfı inherit edebilir
        -Örneğin bir sınıf herhangi bir sınıfı artı abstract bir sınıfı miras alamaz
        -Class lardaki durum abstract class larda da geçerli fakat abstract class larla ilgili syntax anlamında 
        farklılıklar vardır o da kullanım ihtiyaçlarıyla ilgilidir
        -Sınıfın veya metodun abstract olabilmesi için 'abstract' imzasıyla beslenmesi gerekiyor
        -Benim bir ya da birden fazla metodum var onun içerisini ben base de belirlemek istemiyorum, ama
        bunu kim inherit ediyorsa hesapla() yı override etmek zorunda
        */
        
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        
        
        /*
        -Abstract lar tek başına kullanılamaz
        -Abstract sizin base i gizlemek istediğiniz zaman da kullanılır
        -Yani abstract class lar asla new lenemez. New lenebilmesi için sizin onun operasyonlarını aynen imzalı kullanımda 
        olduğu gibi ezmeniz gerekmekte
        -Bu şekilde kullanma!
        GameCalculator gameCalculator = new GameCalculator(); --> class abstract olduğu için main de bu şekilde kullanılamaz*/
    
        GameCalculator gameCalculators = new WomanGameCalculator();
        
    }
}
