
//Binary search
import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 12, 15, 21 }, first, last, mid, search;

        System.out.print("\nEnter the element to search:");
        search = sc.nextInt();

        first = 0;
        last = arr.length - 1;
        mid = (first + last) / 2;
        while (first <= last) {

            if (arr[mid] == search) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        } // While

        if (first > last) {
            System.out.println("Element is not found!");

        }
    }
}