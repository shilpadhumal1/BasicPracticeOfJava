package exceptionhandling;

public class Exception 
{
	public static void main(String[] args) {
		
		System.out.println("before exception");
		int a=12;
		int b=0;
//		int k=a/b;
//		System.out.println(k);
		try
		{
			System.out.println("hi");
			int m=a/b;
			System.out.println("hello");
		}
		
//		catch(ArithmeticException e)
//		{
//			System.out.println("1st one exception handling   "+e.getMessage());
//		}
//		catch(ArithmeticException m)
//		{
//			System.out.println("handling exception"+m.getMessage());
//		}
		
//		
		finally
		{
			System.out.println("finally block is running");
		}
		System.out.println("after exception handling");
	}

}
