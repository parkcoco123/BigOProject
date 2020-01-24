/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pipatpong
 */
public class SelectionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] items = new int[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = (int)(Math.random()*999999 + 1);
        }
        
        System.out.println("Before Selection Sorting :");
        printArray(items);
        
        long before = System.currentTimeMillis();

        //Arrays.sort(items);
        // Perform selection sort
        selectionSort(items);

        System.out.println("After Selection Sorting :");
        printArray(items);
        
        System.out.print("Timestamp : ");
        System.out.println(System.currentTimeMillis()-before + " millesecond");
    }

    static void selectionSort(int items[]) {

        // select item one by one based on index
        for (int i = 0; i < items.length - 1; i++) {
            // Find the minimum item in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum selected item with
            // the first selected item
            int temp = items[min_idx];
            items[min_idx] = items[i];
            items[i] = temp;
        }
    }

    static void printArray(int items[]) {
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
