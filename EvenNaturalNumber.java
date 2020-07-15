//6)program to print first 10 even natural numbers

import java.util.*;
class EvenNaturalNumber
{
	public static void main(String args[])
	{
		System.out.println("First 10  even natural numers :");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
	}
}