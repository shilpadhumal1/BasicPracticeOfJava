package methods;

public class CallingOfMethods 
{
	//calling of static method in to static method
	public static void st1()
	{
		System.out.println("1.(static in static)Calling static method st1 in another static method same class ");
	}
	
	public static void st2()
	{
		st1();
		Test.staticFromOtheClass();
		
	}
	
	//calling of static method in non static method.
	public static void st3()
	{
		System.out.println("2.(static in non static)Calling static method st3 in another non static method same class");
	}
	
	
	//calling non static method in non static method.
	public void nonStatic()
	{
		System.out.println("3.(non static in non static)Calling non static method in non static method in same class");
		Test obj = new Test();//creation object for another class//calling non static in non static method from other class
		obj.nonStaticFromOtherClass();//calling non static method from another class by creating an object 
	}
	//calling non static method in static method
	public void nonStatic1()
	{
		System.out.println("4.(non static in static)calling non static in static method");
	}
	
	public void nonStaticMethod()
	{
		
		st3();//calling static method st3 in non static method in same class
		Test.staticFromOtheClass();//calling static method in non static method from other class
		nonStatic();//calling non static method in non static method in same class
		nonStatic1();
		
	}
	
	public static void main(String[] args) 
	{
		st2();
		CallingOfMethods d = new CallingOfMethods();
		d.nonStaticMethod();
		//d.nonStatic1();
		Test objj = new Test();
		objj.nonStaticFromOtherClass();
	}
	
	

}
