/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author derwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sorter[] sorters = new Sorter[4];
        
        for (int i = 1; i < 25; i++) {
            long startTime = System.currentTimeMillis();
            for (int j=0;j<4; j++) {
            sorters[j] = new Sorter(i*250000);
            sorters[j].start();
            }
            
            for (int j=0;j<4; j++) {
                try {
                    sorters[j].join();
                } catch (InterruptedException e) {}
            }
            
            System.out.println("Array size " + i*1000000 + " Took: " + (System.currentTimeMillis() - startTime) + " ms");
        }
    }
    
    public static void printOut(int[] input){
        for(int i=0; i < input.length; i++) {
            System.out.println("" + input[i]);
        }
    }
    
}
