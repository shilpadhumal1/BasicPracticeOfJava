package typeCasting;

public class MethodsWithTypeCasting 
{
	public void m1(int m)
	{
		System.out.println(m);
	}
	public byte m1()
	{
		byte x=10;
		return x;
	}
	public static void main(String[] args)
	{
		MethodsWithTypeCasting o1= new MethodsWithTypeCasting();
		System.out.println(o1.m1());
		int k=(int)o1.m1();
		o1.m1(k);
				
	}

}
