//10.program to print prime numbers between 2 to 100
import java.util.*;
class PrimeNumberInRange
{
	public static void main(String args[])
	{
		System.out.println("Prime numbers between 2 to 100");
		for(int n0=2;n0<=100;n0++)
		{
			int count=0;
			
			for(int i=2;i<n0-1;i++)
			{
				if(n0%i==0)
				{

				count++;
				}
			}
		
			if(count==0)
			{	
			System.out.print(n0+" ");
			}
		}
	}
}