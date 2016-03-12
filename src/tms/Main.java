/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

/**
 *
 * @author derwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] testArray = {2,4,6,8};
        int[] testArray2 = {1,4,7,10};
        Sorter s = new Sorter(1000);
        printOut(s.getItems());
        printOut(s.getSorted());
         
    }
    
    public static void printOut(int[] input){
        for(int i=0; i < input.length; i++) {
            System.out.println("" + input[i]);
        }
    }
    
}
