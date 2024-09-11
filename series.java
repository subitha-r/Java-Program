//Fibonacci and Tribonacci series
/*Case 1: Fibonacci
  Case 2: Tribonacci */

import java.io.*;
class series
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=-1,b=1,c=2,sum,ch,temp;
		
		System.out.println("Case 1: Fibonacci \n Case 2: Tribonacci");
		System.out.println("Enter you choice:");
		ch=Integer.parseInt(br.readLine());

		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter the limit of the loop:");
				int n=Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++)
				{
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			    }
			    break;
			}
			case 2:
			{
				System.out.println("Enter the limit of the loop:");
				int n=Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++)
				{
				sum=a+b+c;
				System.out.println(sum);
				a=b;
				b=c;
				c=sum;
				}
				break;
			}
		} //switch close

	}
}