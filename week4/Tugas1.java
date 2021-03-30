/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author Bima
 */
public class Tugas1 {
public static void main(String[] args){
    
    int angka, angka2;
    
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan Batas Awal = ");
    angka = inp.nextInt();
    
    System.out.print("Masukkan Batas Akhir = ");
    angka2 = inp.nextInt();
    
    System.out.println("===========================");
    System.out.println(" ");
    System.out.println("bilangan genapnya adalah :");
    
    for(int input = angka; angka <= angka2; angka++){
        if(angka %2 == 0){
          System.out.print(angka +"  ");
        }
    }
 }    
}
