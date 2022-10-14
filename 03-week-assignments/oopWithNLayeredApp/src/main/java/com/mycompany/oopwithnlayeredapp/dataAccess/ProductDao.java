/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.oopwithnlayeredapp.dataAccess;

import com.mycompany.oopwithnlayeredapp.entities.Product;

/**
 *
 * @author sevde
 */
public interface ProductDao {
    //interface ler sadece metot imzasını barındırabilir
    //ProductDao ile ilgili alternatifler add metotu içerebilmelidir
    void add(Product product);
}
