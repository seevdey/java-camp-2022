/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.overriding;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        BaseKrediManager [] krediManagers = new BaseKrediManager[]{ //BaseKrediManager, TarımKrediManager ve OgrenciKrediManager ve OgretmenKrediManager ' ın referansını tutuyor
            new TarımKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()
        };
        
        for (BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
        
    }
}
