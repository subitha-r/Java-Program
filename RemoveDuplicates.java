//Remove duplicates from sorted array

/*Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores) */

import java.io.*;

class RemoveDuplicates
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[],i,j,k=0,size,temp;

		//Dynamically declaring the size of array
		System.out.println("Enter the size of an array");
		size=Integer.parseInt(br.readLine());
		arr=new int[size];

		//Entering array elements
		System.out.println("Enter "+size+" elements");
		for(i=0;i<size;i++)
			arr[i]=Integer.parseInt(br.readLine());

		//Displaying
		System.out.print("Unsorted Array");
		for(i=0;i<size;i++)
			System.out.print(arr[i]+" ");

		//sorting
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		//Elements after sorting
		System.out.println("Sorted Array");
		for(i=0;i<size;i++)
			System.out.println(arr[i]+" ");

		//Removing duplicates
		for(i=1;i<size;i++)
		{
			if(arr[i-1]!=arr[i])
				{
					arr[k]=arr[i];
					k++;
				}
		}

		//Printing
		System.out.println("Removing Duplicates in Sorted Array");
		for(i=0;i<k;i++)
			System.out.println(arr[i]+" ");
		

	}
}