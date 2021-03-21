/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputoperasi;

/**
 *
 * @author Bima
 */
public class Outputoperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB" + "C";
        
        System.out.println("CompareTo :" +s1.compareTo(s2));
        System.out.println("Equal :" +s2.equals(s3));
        System.out.println(s3==s1);
        System.out.println("CompareTo :" +s2.compareTo(s3));
        System.out.println("Equals :" +s3.equals(s1));
    }
    
}
