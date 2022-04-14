package methods;

public class StaticMethod 
{
	public static void myFirstMethod()
	{
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	public static void addition()
	{
		int x=4;
		int y=7;
		int z = x + y;
		System.out.println(z);
	}
	public static void m2()
	{
		myFirstMethod();
	}
	public static void main(String[] args)
	{
		myFirstMethod();//calling method from same class
		addition();
		Test.staticFromOtheClass();
		NonStaticMethod o1 =new NonStaticMethod();
		o1.m3();
	}

}
