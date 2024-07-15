
public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] with arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        // int arr[] = { 24, 9, 29, 14, 19, 27 };
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int length = arr.length;
        quickSort(arr, 0, arr.length - 1);

        System.out.print("\nSorted Array");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    } // Main close
} // Class Close
