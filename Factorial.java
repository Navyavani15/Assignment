//13.program to find factorial of a given number

import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int sum=1;
		System.out.print("Enter number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(n+ "! = "+sum);

	}

}