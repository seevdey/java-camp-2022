/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loopdemo;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        //for
        
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }*/
        
        for (int i = 2; i < 28; i+=2) {
            System.out.println("i = " + i);
        }
        System.out.println("For döngüsü bitti");
        
        int i=1;
        //While
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");
        
        //Do-While
        int j=1;
        do {
            System.out.println("j = " + j);
            j+=3;
        } while (j<19);
        System.out.println("Do-While döngüsü bitti");
    }
}
