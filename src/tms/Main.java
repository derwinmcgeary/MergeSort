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
        
        int[] testArray = {2,4,6,8};
        int[] testArray2 = {1,4,7,10};
        Sorter s = new Sorter(20000);
        s.start();
        System.out.println("Started Thread ...");
        try {
            s.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Done!");
        printOut(s.output);
         
    }
    
    public static void printOut(int[] input){
        for(int i=0; i < input.length; i++) {
            System.out.println("" + input[i]);
        }
    }
    
}
