/*Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores). */

import java.io.*;
public class RemoveElement
{
	public static void main(String[] args)throws IOException
	{
			int nums[]={3,2,2,3},val=3,i,k=0;
			int size=nums.length;
			System.out.println("Size of an nums array: "+size);

			for(i=0;i<size;i++)
			{
				if(nums[i]!=3)
						{
							nums[k]=nums[i];
							k++;
						}
			}
			System.out.println("Size of an array: "+k);

			//To print elements
			for(i=0;i<k;i++)
			{
				System.out.print(nums[k]+" ");
			}
	}
}