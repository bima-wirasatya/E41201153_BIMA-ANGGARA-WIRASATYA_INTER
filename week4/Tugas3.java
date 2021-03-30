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
public class Tugas3 {
public static void main(String[] args){
    
int maksimum, minimum, jumlah, angka[];
int rata2, total = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan banyaknya data nilai = ");
    jumlah = scan.nextInt();
    angka = new int[jumlah];
    
    for(int i = 0; i < jumlah; i++) {
      System.out.print("Masukkan data nilai ke-"+ (i+1) +" = " );
      angka[i] = scan.nextInt();
      total = total + angka[i];
    }
    maksimum = angka[0];
    minimum = angka[0];
    for(int i = 0; i < jumlah; i++) {
      if (angka[i] > maksimum){
        maksimum = angka[i];
      }else if(angka[i] < minimum){
        minimum = angka[i];  
      }
    }
    rata2 = total/jumlah;
    System.out.println(" ");
    System.out.println("Nilai minimum = "+minimum);
    System.out.println("Nilai maksimum = "+maksimum);
    System.out.println("Nilai rata - ratanya adalah = "+rata2);
    
 }    
}
