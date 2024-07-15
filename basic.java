
//Sorting and removing duplicates in an given array
import java.io.*;

public class basic {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], size, i, k = 1, temp = 0;
        System.out.print("\nEnter the size for an Array:");
        size = Integer.parseInt(br.readLine());
        arr = new int[size];

        System.out.print("\nARRAY INPUTS");
        System.out.print("\nEnter " + size + " elements:");
        for (i = 0; i < size; i++)
            arr[i] = Integer.parseInt(br.readLine());

        System.out.print("\nSORTING THE ELEMENTS");
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nDISPLAYING THE ARRAY: ");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        // REMOVING THE DUPLICATES
        for (i = 1; i < size; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.print("\n DISPLAYING THE ARRAY AFTER REMOVING DUPLICATES: ");
        for (i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
}

/*
 * OUTPUT
 * Enter the size for an Array:5
 * 
 * ARRAY INPUTS
 * Enter 5 elements:6
 * 7
 * 6
 * 1
 * 2
 * 
 * SORTING THE ELEMENTS
 * DISPLAYING THE ARRAY: 7 6 6 2 1
 * DISPLAYING THE ARRAY AFTER REMOVING DUPLICATES: 7 6 2 1
 */