import java.io.*;

class sort
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[]={9,5,8,0,1},i,j,temp;

	System.out.print("Elements before sorting: ");
	for(i=0;i<5;i++)
		System.out.print(arr[i]+" "); 

	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		} 
	}

	System.out.print("Elements after sorting: ");
	for(i=0;i<5;i++)
		System.out.print(arr[i]+" ");

	}
}