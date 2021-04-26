/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_Overriding;

/**
 *
 * @author Bima
 */
public class B extends A{
    @Override
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method milik class B dipanggil");
    }
}
