/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesliharfler;

/**
 *
 * @author sevde
 */
public class App {

    public static void main(String[] args) {
        char harf = 'A';
        
        switch(harf){
            case 'I': 
            case 'A':
            case 'U':
            case 'O':
                System.out.println(" kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}
