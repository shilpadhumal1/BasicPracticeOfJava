package scannerclass;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Factorial number: ");
		int num=scan.nextInt();
		int facto=1;
		for(int i=1;i<=num;i++)
		{
			facto=facto*i;
			//System.out.println(facto+"*"+i+"="+facto);
			
		}
		System.out.println("Factorial of"+num+"is: "+facto);
	}

}
