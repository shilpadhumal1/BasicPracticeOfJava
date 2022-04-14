package exceptionhandling;

import java.io.IOException;

public class Exercise1
{
	static int marks;
	
	public static void m1()
	{
		int m;
		m=marks;
		if (m >=100 || m<=0)
		{
			  new MarksOutOfBounds();
			
		}
		else
			System.out.println("In boundries");
		
		
		
	}
	public static void main(String[] args) {
		marks=145;
		try
		{
			m1();
		}
		catch(MarksOutOfBounds e)
		{
			System.out.println("caugt"+e);
		}
	}

}
