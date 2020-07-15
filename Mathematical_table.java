//8)program to print mathematical table of given number

import java.util.*;
class Mathematical_table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		System.out.println("mathematical table of "+num+":");
		while(i<11)
		{
			System.out.println(num+" X "+i+" = "+(i*num));
			i++;
		}
	}
}