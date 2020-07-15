//16 program to get reverse of a number
import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		int rev;
		Scanner sc=new Scanner(System.in);
			System.out.print("entre a value ");
			int n=sc.nextInt();
			System.out.print(" reverse of "+n+" = ");
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			System.out.print(rev);
		}
		
	}
}
