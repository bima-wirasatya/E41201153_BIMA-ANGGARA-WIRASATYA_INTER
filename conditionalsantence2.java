/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik2;
import java.util.Scanner;
/**
 *
 * @author Bima
 */
public class conditionalsantence2 {
 public static void main(String[] args){
     
     //membuat variabel dan scanner
     String lampu;
     Scanner scan = new Scanner(System.in);
     
     //mengambil inpput
     System.out.print("inputkan nama warna = ");
     lampu = scan.nextLine();
     
     switch (lampu){
         case "merah":
             System.out.println("Lampu merah, berheti!");
             break;
         case "kuning":
             System.out.println("Lampu kuning, harap berhati-harti!");
             break;
         case "hijau":
             System.out.println("Lampu hijau, silahkan jalan!");
             break;
         default:
             System.out.println("Warna lampu salah!");
     }
 }   
}
