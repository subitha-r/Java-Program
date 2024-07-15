/*
 * Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.
 *   Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
         Output : {7, 1, 6, 2, 5, 3, 4} 
 */
public class AlternateSorting {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int i, size = arr.length;
        int[] k = new int[size];

        int left = 0, right = size - 1;
        // int j = size - 1;
        for (i = 0; i < size; i++) {
            if (i % 2 == 0)
                k[i] = arr[right--];
            else
                k[i] = arr[left++];
        }
        System.out.print("Before Sorting:");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.print("After soring:");
        for (i = 0; i < size; i++)
            System.out.print(k[i] + " ");
    }
}

/*
 * for(i=0;i<size;i++)
 * {
 * if(i%2==0)
 * odd[i]=arr[i];
 * else
 * even[i]=arr[i];
 * }
 */