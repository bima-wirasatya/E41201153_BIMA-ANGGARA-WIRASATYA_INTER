/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_bubbleSort;
import static week6_bubbleSort.BubbleSortExample.bubbleSort;

/**
 *
 * @author Bima
 */
public class BubbleSortMain {
    public static void main(String[] args){
        
        int arr[] = {3,60,35,2,45,320,5};
        
        System.out.println("Array before bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        bubbleSort(arr);
        
        System.out.println("Array after bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
