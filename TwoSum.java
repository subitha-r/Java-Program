
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
 */
import java.io.*;

public class TwoSum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[], target, i, size, j;

        System.out.print("\nEnter the size of an array:");
        size = Integer.parseInt(br.readLine());
        num = new int[size];
        System.out.print("\nEnter the elements of array:");
        for (i = 0; i < size; i++)
            num[i] = Integer.parseInt(br.readLine());
        System.out.print("\nEnter the target element");
        target = Integer.parseInt(br.readLine());

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (num[i] + num[j] == target) {
                    System.out.print("\n num[" + i + "]" + "[" + j + "]");
                }
            }
        }
    }
}
