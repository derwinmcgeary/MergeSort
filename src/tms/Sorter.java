/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author derwin
 */
public class Sorter extends Thread {
    private int[] items;
    public int[] output;
    
    public Sorter() {
        this.items = new int[100];
        Random r = new Random();
        for(int i=0; i < items.length; i++) {
            this.items[i] = r.nextInt();
        }
    }
    
    public Sorter(int n) {
        this.items = new int[n];
        Random r = new Random();
        for(int i=0; i < items.length; i++) {
            this.items[i] = r.nextInt();
        }
    }
    
    public Sorter(int[] input) {
        this.items = input;
    }
    
    public int[] getItems() {
        return items;
    }
    
    public int[] getSorted() {
        this.output = mergeSort(items);
        return output;
    }
    
    private int[] mergeSort(int[] input) {

        if(input.length<2) {
            return input;
        }
        
        int midPoint = input.length / 2;
        int[] output;
        try {
        
            Sorter left = new Sorter(Arrays.copyOfRange(input, 0, midPoint));
            Sorter right = new Sorter(Arrays.copyOfRange(input, midPoint, input.length));
        
            left.start();
            right.start();
            try {
                left.join();
                right.join();
            } catch (InterruptedException e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            }
            output = merge(left.output,right.output);
            
        } catch (OutOfMemoryError e) { // If we're out of memory, stop adding threads
            Sorter left = new Sorter(Arrays.copyOfRange(input, 0, midPoint));
            Sorter right = new Sorter(Arrays.copyOfRange(input, midPoint, input.length));
            output = merge(left.getSorted(),right.getSorted());
        }

        
        return output;
    }
    
    public int[] merge(int[] left, int[] right){
        int total = left.length + right.length;
        int minSize = Math.min(left.length, right.length);
        int current = 0;
        int leftCount = 0;
        int rightCount = 0;
        
        int[] output = new int[total];
        
        for(current = 0; current < 2 * minSize; current++) {
                    
            if  ((left[leftCount] > right[rightCount])) {
                        
                        output[current] = right[rightCount++];
                        if(rightCount == right.length) break;
                    
                    
            } else {    
                        
                        output[current] = left[leftCount++];
                        if(leftCount == left.length) break;
            
                    }
        }
        
        while(leftCount<left.length) {
            output[++current] = left[leftCount++];
        }
        
        while(rightCount<right.length) {
            output[++current] = right[rightCount++];
        }
        
        return output;
    }
    
    public void run() {
        this.output = getSorted();
    }
}
