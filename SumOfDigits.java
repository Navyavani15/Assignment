//15 Sum of digits of a number
import java.util.*;
class SumOfDigits
{
	public static void main(String args[])
	{
		int sum=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Entre a number ");
		int n=sc.nextInt();
		System.out.print("sum of digit in "+n+" = ");
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.print(sum);
	}
}