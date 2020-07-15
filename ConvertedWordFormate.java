//18 program to convert given number intlo the word format
import java.util.*;
class ConvertedWordFormate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("entre the value between 0 to 9 --- ");
		int n=sc.nextInt();
		if(n<10)
		{
		String ones[]={"Zero", "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
		System.out.println(n+" --> "+ones[n]);
		}
	
	}
}