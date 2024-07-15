/*
 Write a program to sort the elements in odd positions in descending order and elements in ascending order
 * Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
 */

import java.io.*;
//import java.util.Arrays;

public class oddsort {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], array[], odd[], even[], size, i, oddIndex = 0, evenIndex = 0, temp;

        System.out.println("Enter the size of an array:");
        size = Integer.parseInt(br.readLine());
        arr = new int[size];
        array = new int[size];
        odd = new int[(size + 1) / 2];
        even = new int[size / 2];

        System.out.println("Enter " + size + " elements:");
        for (i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Displaying array element
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        // Separate odd and even indexed elements
        for (i = 0; i < size; i++) {
            if (i % 2 == 0)
                odd[oddIndex++] = arr[i];
            else
                even[evenIndex++] = arr[i];
        }

        // odd elements
        System.out.print("\nOdd Elements:");
        for (i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");
        // even elements
        System.out.print("\nEven Elements:");
        for (i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");

        // Sorting odd elements
        for (i = 0; i < oddIndex; i++) {
            for (int j = i; j < oddIndex; j++) {
                if (odd[i] < odd[j]) {
                    temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        // Sorting even elements
        for (i = 0; i < evenIndex; i++) {
            for (int j = i; j < evenIndex; j++) {
                if (even[i] > even[j]) {
                    temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }

        // Printing odd elements after sorting
        System.out.print("\nAfter sorting odd elements in descending order");
        for (i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");
        // Printing even elements after sorting
        System.out.print("\nAfter sorting even elements in ascending order");
        for (i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");

        // Merging
        oddIndex = 0;
        evenIndex = 0;
        for (i = 0; i < size; i++) {
            if (i % 2 == 0) {
                array[i] = odd[oddIndex++];
            } else {
                array[i] = even[evenIndex++];
            }
        }

        // Displaying array element
        System.out.print("\nFinal output:");
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }
}
