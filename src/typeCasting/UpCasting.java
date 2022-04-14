package typeCasting;



public class UpCasting
{
	//up casting is the type of type casting in which lower order variable is converted in to higher order data type
	//while performing up casting there is no loss of information
	//ex: byte to int OR int to long
	public static void main(String[] args) 
	{
		int a=100;
		long b=(long)a;
		System.out.println(b);// upcasting because here byte is getting convert to higher order i.e integer
		double x=129.123;
		
		int y=(int) x;
		System.out.println(y);
		
	}
}
