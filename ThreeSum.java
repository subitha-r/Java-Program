/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */

import java.io.*;

public class ThreeSum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[], size, i, k, j, target = 0, sum;

        System.out.println("Enter the size of an array:");
        size = Integer.parseInt(br.readLine());
        num = new int[size];

        System.out.println("Enter the elements of an array:");
        for (i = 0; i < size; i++)
            num[i] = Integer.parseInt(br.readLine());

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                for (k = i + 2; k < size; k++) {
                    if (num[i] + num[j] + num[k] == target)
                        System.out.print("\n num[" + i + "]" + "[" + j + "]" + "[" + k + "]");
                }
            }
        }

        /*
         * for (i = 0; i < size; i++) {
         * sum = num[i] + num[i + 1] + num[i + 2];
         * 
         * if (sum == target)
         * System.out.println("num[" + num[i] + "," + num[i + 1] + "," + num[i + 2] +
         * "]");
         * }
         */

    }
}