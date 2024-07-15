//Double Dimensional Array

/*Case 1: Transepose of given matrix
  Case 2: Sum of diagonal elements */

 import java.io.*;

 class DDArray
 {
 	public static void main(String[] args)throws IOException
 	{
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		int sum=0,sumdig=0,i,j,ch;
 		double sqdig=0;
 		int arr[][]=new int[3][3];

 		//Entering elements
 		System.out.println("Enter the elements for an array");
 		for(i=0;i<3;i++)
 		{
 			for(j=0;j<3;j++)
 				arr[i][j]=Integer.parseInt(br.readLine());
 		}

 		//Displaying the array
 		for(i=0;i<3;i++)
 				{
 					for(j=0;j<3;j++)
 						System.out.print(arr[i][j]);
 					System.out.println("");
 				}

 		//Entering choice
 		System.out.println("Case 1: Transpose of Matric \n Case 2: Sum of diganoal \n sum of square of diagnal");
 		System.out.println("Enter your choice:");
 		ch=Integer.parseInt(br.readLine());

 		switch(ch)
 		{
 			case 1:
 			{
 				int transpose[][]=new int[3][3];
 				for(i=0;i<3;i++)
 				{
 					for(j=0;j<3;j++)
 						{
 							transpose[i][j]=arr[j][i];
 							System.out.print(transpose[i][j]+" ");
 						}
 					System.out.println("");
 				}
 				break;
 			}
 			case 2:
 			{
 				for (i = 0; i < 3; i++) 
 				{
                    sumdig += arr[i][i];
                }
                System.out.println("The sum of main diagonal is: " + sumdig);
                break;
 			}
 			case 3:
 			{
 				for (i = 0; i < 3; i++) 
 				{
                    sqdig=sqdig+Math.pow(arr[i][i],2);
                }
                System.out.println("The sum squares of main diagonal is: " + sqdig);
                break;
 			}
 		} //Switch close
 	}
 }