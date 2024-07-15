/*
 *  Given two sorted arrays, merge them such that the elements are not repeated
 * Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
 */

import java.io.*;

public class UnRepeatedSortedArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1, arr2, merge, k;
        int size1, size2, size3, i, unrepeat = 1, temp = 0;

        System.out.print("\nEnter the size of Array1:");
        size1 = Integer.parseInt(br.readLine());
        arr1 = new int[size1];
        System.out.print("\nEnter the size of Array 2:");
        size2 = Integer.parseInt(br.readLine());
        arr2 = new int[size2];
        size3 = size1 + size2;
        merge = new int[size3];

        // Input for array
        System.out.print("\nEnter the elements for Array 1:");
        for (i = 0; i < size1; i++)
            arr1[i] = Integer.parseInt(br.readLine());
        System.out.print("\nEnter the elements for Array 2:");
        for (i = 0; i < size2; i++)
            arr2[i] = Integer.parseInt(br.readLine());

        // Merge
        int j = 0;
        for (i = 0; i < size1; i++)
            merge[j++] = arr1[i];
        for (i = 0; i < size2; i++)
            merge[j++] = arr2[i];

        // Displaying the merged array
        System.out.print("\nMerged Array: ");
        for (i = 0; i < size3; i++) {
            System.out.print(merge[i] + " ");
        }

        // Sorting merged array
        for (i = 0; i < size3; i++) {
            for (j = i + 1; j < size3; j++) {
                if (merge[i] > merge[j]) {
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        // Displaying the merged sorted array
        System.out.print("\nMerged Sorted Array: ");
        for (i = 0; i < size3; i++)
            System.out.print(merge[i] + " ");

        // Removing Duplicates
        for (i = 1; i < size3; i++) {
            if (merge[i - 1] != merge[i]) {
                merge[unrepeat] = merge[i];
                unrepeat++;
            }
        }

        // Displaying the merged sorted array after removing duplicates
        System.out.print("\nMerged Sorted Array: ");
        for (i = 0; i < unrepeat; i++)
            System.out.print(merge[i] + " ");
    } // Main
} // Class
