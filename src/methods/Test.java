package methods;

public class Test 
{
	public void nonStaticFromOtherClass()
	{
		System.out.println("m5 non static method from other test class");
	}
	public static void staticFromOtheClass()
	{
		System.out.println("Calling Static method from another class");
	}
	public void ar1(int a,int b)
	{
		System.out.println(a+" "+b);
	}

}
