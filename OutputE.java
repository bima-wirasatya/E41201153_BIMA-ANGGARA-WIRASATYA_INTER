/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outpute;
import java.util.Scanner;
/**
 *
 * @author Bima
 */
public class OutputE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("   DAFTAR MENU MINUMAN");
        System.out.println("         CAFEINI");
        System.out.println("------------------------");
        System.out.println(" ");
        
        System.out.println("    1. es teh");
        System.out.println("    2. jeruk hangat");
        System.out.println("    3. kopi susu");
        System.out.println("    4. jus alpukat");
        
        System.out.println(" ");
        System.out.println("------------------------");
         
        int minuman;
        String nama;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukkan nama pembeli = ");
        nama = keyboard.nextLine();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("silahkan masukkan pilihan anda = ");
        minuman = scan.nextInt();

        switch (minuman){
            case (1):
                System.out.println("minuman yang anda pesan adalah es teh");
                System.out.println("pesanan anda akan segera kami antar!");
                System.out.println("terimakasih " +nama +" sudah memesan di CAFEINI");
                break;
            case (2):
                System.out.println("minuman yang anda pesan adalah jeruk hangat");
                System.out.println("pesanan anda akan segera kami antar!");
                System.out.println("terimakasih " +nama +" sudah memesan di CAFEINI");
                break;
            case (3):
                System.out.println("minuman yang anda pesan adalah kopi susu");
                System.out.println("pesanan anda akan segera kami antar!");
                System.out.println("terimakasih " +nama +" sudah memesan di CAFEINI");
                break;
            case (4):
                System.out.println("minuman yang anda pesan adalah jus alpukat");
                System.out.println("pesanan anda akan segera kami antar!");
                System.out.println("terimakasih " +nama +" sudah memesan di CAFEINI");
                break;
            default:
                System.out.println("pesanan tidak ada dalam daftar!");
                
       

        
        }

    }
    
}
