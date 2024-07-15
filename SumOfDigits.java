//Sum of digits

import java.io.*;
class SumOfDigits
{
	public static void main(String[] args)throws IOException
	{
		int temp,rem,num=135,sum=0,digit;
		temp=num;
		while(temp!=0)
		{
			digit=temp%10;
			sum+=digit;
			temp=temp/10;
		}
		System.out.println("Sum of the given number is: "+sum);
	}
}