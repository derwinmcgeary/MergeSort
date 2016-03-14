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

        long startTime = System.currentTimeMillis();
        
        for(int i = 1; i < 20; i++) {
            Sorter s = new Sorter(i*10000);
            s.getSorted();
            System.out.println("Array size " + i*10000 + 
                    " Took : " + 
                    (System.currentTimeMillis() - startTime) + " ms");
        }
    }
    
    public static void printOut(int[] input){
        for(int i=0; i < input.length; i++) {
            System.out.println("" + input[i]);
        }
    }
    
}
