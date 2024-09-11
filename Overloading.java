//Overloading
/*
1. void calculate(int m,char ch)It checks whether the integer argument is divisible by 7 or not, if ch is 's'. Otherwise, it checks whether the last digit of 
   integer argument is 7 or not.
2. void calculate(int a,int b,char ch) It displays the greatest of integer arguments if ch is 'g'. Otherwise, it displays the smaller 
   of integer arguments 
*/

import java.io.*;

class Overloading
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		loading obj=new loading();
		int m,a,b;
		char ch;
		System.out.println("Enter the values for m, a and b:");
		m=Integer.parseInt(br.readLine());
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter a single character");
		ch = (char) br.read(); // Read a single character
		obj.calculate(m,ch);
		obj.calculate(a,b,ch);
	}
}
class loading
{
 void calculate(int m,char ch)
 {
 	if(ch=='s')
 	{
 		if(m%7==0)
 			System.out.println(m+" is divisible by 7");
 	}
 	else
 	{
 		if((m%10)==7)
 			System.out.println(m+" the last digit is 7");
 		else
 			System.out.println("The last digit of "+m+" is not 7");
 	}
 }

 	void calculate(int a,int b,char ch)
 	{
 		if(ch=='g')
 		{
 			int c=(a>b)?a:b;
 			System.out.println("The greatest among "+a+" and "+b+" is "+c);
 		}
 		else
 		{
 			int c=(a<b)?a:b;
 			System.out.println("The smallest among "+a+" and "+b+" is "+c);
 		}
 	}
 	
}