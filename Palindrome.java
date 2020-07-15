//17.program to find whether the given number is palindrome or not
import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
			System.out.println("entre a value");
			int num=sc.nextInt();
			int n=num;
			int temp=n;
		while(n>0)
		{
			
			sum=sum*10+n%10;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(num+" is a palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}
}