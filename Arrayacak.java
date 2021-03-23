/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayacak;
import java.util.Scanner;
/**
 *
 * @author Bima
 */
public class Arrayacak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // membuat objek input untuk di scanner
        Scanner input = new Scanner(System.in);
        int jumlahderet = 0;
        
        System.out.print("Masukan jumlah deret : ");
        jumlahderet = input.nextInt();
        
        int[] deretarray = new int [jumlahderet];
        
        for (int i=0; i<jumlahderet; i++) {
            deretarray[i] = (int) (Math.random()* 10);
        }
        for (int j=0; j<jumlahderet; j++) {
            System.out.print(deretarray[j]+"\t");
            
        
        }
    }
    
}
