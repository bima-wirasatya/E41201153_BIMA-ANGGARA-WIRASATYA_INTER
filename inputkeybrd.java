/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik1;
import java.util.Scanner;
/**
 *
 * @author Bima
 */
public class inputkeybrd {
    public static void main(String[] args){
     //buat Scanner
     Scanner s1 = new Scanner (System.in);
     
     //ambil nilai dari keyboard
     System.out.println("masukkan nilai1 = ");
     int nilai1 = s1.nextInt();
     System.out.println("masukkan nilai2 = ");
     int nilai2 = s1.nextInt();
     
     //hitung dan print
     int jumlah = nilai1 + nilai2;
     System.out.println("jumlah = " +jumlah);
    }
}
