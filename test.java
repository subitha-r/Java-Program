
//Removing zero from an array and placing it in last positions
import java.io.*;

public class test {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], size, i, k = 0;

        // Entering array size
        System.out.print("Enter the size of an array:");
        size = Integer.parseInt(br.readLine());
        arr = new int[size];

        // Entering array values
        System.out.println("\nEnter " + size + " elements:");
        for (i = 0; i < size; i++)
            arr[i] = Integer.parseInt(br.readLine());

        // Displaying before removing zeros
        System.out.println("The elements in the array are:");
        for (i = 0; i < size; i++)
            System.out.println(arr[i]);

        // Removal of duplicates
        for (i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        // Displaying after removing zeros
        System.out.println("The elements in the array are:");
        for (i = 0; i < k; i++)
            System.out.print(arr[i] + " ");

        // A pp e n ding zero
        for (; k < size; k++)
            System.out.print("0");
    }
}
