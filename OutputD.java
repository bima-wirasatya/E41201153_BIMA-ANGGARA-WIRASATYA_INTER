/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputd;

import java.util.Scanner;

/**
 *
 * @author Bima
 */
public class OutputD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("          JAYA AGUNG SENTOSA CENTER <JASC>");
        System.out.println("             Promo Belanja Awal Bulan");
        System.out.println("           Khusus Untuk 5 Barang Pertama");
        System.out.println("         Dengan Harga Minimun Rp 100000.00");
        System.out.println("-----------------------------------------------------");

        int harga,harga2,harga3,harga4,harga5;
        String nama;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukkan nama pembeli = ");
        nama = keyboard.nextLine();
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("masukan harga barang ke-1 = ");
        harga = scan.nextInt();        
        if(harga >1){
            System.out.print("masukan harga barang ke-2 = ");
        } else {
            System.out.println("total harga pembelian atas nama " +nama +" adalah = 0");
        }
        
        
        harga2 = scan.nextInt();
        int total1 = harga+harga2;        
        if(harga2 >1){
            System.out.print("masukan harga barang ke-3 = ");
        }else {
            System.out.println("total harga pembelian atas nama " +nama +" adalah = " +harga);
        }
        
        
        harga3 = scan.nextInt();        
        if(harga3 >1){
            System.out.print("masukan harga barang ke-4 = ");
        }else{
            System.out.println("total harga pembelian atas nama " +nama +" adalah = " +total1);
        }
        
        
        harga4 = scan.nextInt();
        int total2 = total1+harga3;
        if(harga4>1){
            System.out.print("masukan harga barang ke-5 = ");
        }else{
            System.out.println("total harga pembelian atas nama " +nama +" adalah = " +total2);
        }
        
        harga5 = scan.nextInt(); 
        int total3 = total2+harga4;
        int total4 = total3+harga5;       
        if(harga5 >1){
            System.out.print("total harga pembelian atas nama " +nama +" adalah = " +total4);
            System.out.println(" ");
        }else{
            System.out.println("total harga pembelian atas nama " +nama +" adalah = " +total3);
        }
        
        
        int kurang = 100000-total4;
        if(total3>=100000){
            System.out.println(" ");
            System.out.println("Selamat!");
            System.out.println("anda mendapat bonus voucher belanja Rp 50000.00!");
            System.out.println(" ");
            System.out.println("-----------------------------------------------------");
            System.out.println("                   TERIMA KASIH!");
            System.out.println("    Sudah Berbelanja Di JAYA AGUNG SENTOSA CENTER");
        }else{
            System.out.println("");
            System.out.println("Ayo Beli Lagi!");
            System.out.println("Pembelian anda kurang " +kurang +" lagi nih!");
        }
    }
    
}
